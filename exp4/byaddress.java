package exp4;

import java.net.InetAddress;

public class byaddress {

	public static void main(String[] args) {
		byte[] ipAddr = new byte[] { 127, 0, 0, 0 };
		try {
			InetAddress address = InetAddress.getByAddress(ipAddr); 
			System.out.println(address);
		}
		catch(Exception ex) {
			System.out.println("Error ouccered.");
		}
	}

}
