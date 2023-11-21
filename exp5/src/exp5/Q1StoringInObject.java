package exp5;

import java.io.*;
import java.net.*;
import java.util.*;


public class Q1StoringInObject {

	public static void main(String[] args) throws IOException, URISyntaxException {
		System.out.print("Enter the url: ");
		Scanner sc = new Scanner(System.in);
		String website = sc.nextLine();
		URL u = new URI(website).toURL();
		Object o = u.getContent();
		System.out.println("I got a "+o.getClass().getName());
	}
}
