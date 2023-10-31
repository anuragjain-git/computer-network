package experiment3;

import java.util.Scanner;

// create interface StateTax having abstract method stateTax()
interface StateTax {
	// declare abstract method
	double stateTax();
}

// implement the StateTax interface for Haryana
class Haryana implements StateTax {
	public double stateTax() {
		return 1500.0;
	}
}

//implement the StateTax interface for Utter Pradesh
class UP implements StateTax {
	public double stateTax() {
		return 2500.0;
	}
}

public class exp3_callback {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, 
	InstantiationException {
		//create an instance of the Scanner class to take user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter state name: ");
		
		// get state name from the user
		exp3_callback c = new exp3_callback();
		Package p = c.getClass().getPackage();
		String pName = p.getName();
		String state = sc.next();
		
		// store the state name in an object obj
		Class obj = Class.forName(pName+"."+state);
		
		//Create new object of the obj class that reference by the StateTax
		StateTax refer = (StateTax)obj.newInstance();
		
		//call the calculateTax() method by passing the reference of the StateTax to calculateTax
		calculateTax(refer);
	}

	static void calculateTax(StateTax data) {
		// central tax will be same for all state
		double central_Tax = 3500.0;
		
		// get the state_Tax for the user entered state and find the total tax
		double state_Tax = data.stateTax();
		double total_Tax = state_Tax + central_Tax;
		
		// show the result
		System.out.println("The total Tax od the state is = "+ total_Tax);
	}
}
