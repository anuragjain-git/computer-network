package exp1;
import java.io.*;
import java.util.*;
public class q2 {

	public static void main(String[] args) throws IOException {
		try 
			(FileWriter file1=new FileWriter("E:\\2141010002\\2141010002.txt");
			BufferedWriter buffer= new BufferedWriter(file1);){
			buffer.write("Hello");
			System.out.println("Success!");
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		
		try {
			FileReader file1=new FileReader("E:\\\\2141010002\\2141010002.txt");
			BufferedReader buffer= new BufferedReader(file1);
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}
}