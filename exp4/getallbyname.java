package exp4;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class getallbyname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter host url: ");
		String url = s.next();
		
		try {
			InetAddress[] address = InetAddress.getAllByName(url);
			for(InetAddress add : address)
				System.out.println(add);
		}
		catch(UnknownHostException ex) {
			System.out.println("Could not find "+url);
		}
	}

}
