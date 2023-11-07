package exp4;

import java.net.*;
import java.util.*;

public class obj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter host url: ");
		String url = s.next();
		
		try {
			InetAddress address = InetAddress.getByName(url);
			System.out.println(address);
		}
		catch(UnknownHostException ex) {
			System.out.println("Could not find "+url);
		}

	}

}
