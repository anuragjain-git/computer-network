package exp3;
import java.util.*;

class WorkerThread extends Thread {
	int x, y;
	WorkerThread(int n1, int n2){
		x= n1;
		y = n2;
	}
	public void run() {
		int result = x + y;
		onResult(result);
	}
	
	void onResult(int result) {
		System.out.println("Received result fromthe thread : "+result);
	}
}

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("Enter a and b : ");
		a = sc.nextInt();
		b = sc.nextInt();
		WorkerThread wt = new WorkerThread(a, b);
		wt.start();
	}
}
