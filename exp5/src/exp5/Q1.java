package exp5;

import java.io.*;
import java.net.*;
import java.util.*;


public class Q1 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		System.out.print("Enter the url: ");
		Scanner sc = new Scanner(System.in);
		String website = sc.nextLine();
		URL u = new URI(website).toURL();
		BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()));
		String readLine;
		while((readLine = in.readLine()) != null) {
			System.out.println(readLine);
		}
		in.close();
	}
}