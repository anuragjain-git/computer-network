package exp4;

import java.net.InetAddress;
import java.util.Scanner;

public class obj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter host url: ");
		String url = s.next();
		try {
			InetAddress address = InetAddress.getByName(url); //returns url/ipaddress
			System.out.println(address);
			byte[] ipAddress = address.getAddress(); //store address in byte array
			
			if(ipAddress.length == 4)
				System.out.println("IP Address is IPv4.");
			else if(ipAddress.length == 8)
				System.out.println("IP Address is IPv6.");
			else
				System.out.println("Invalid IP Address.");
		}
		
		catch(Exception ex) {
			System.out.println("Error ouccered.");
		
		}

	}
}
