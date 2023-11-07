package exp4;

import java.net.*;

public class obj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
		}
		catch(Exception ex) {
			System.out.println("Error ouccered.");
		}
	}

}
