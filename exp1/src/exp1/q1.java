package exp1;
import java.io.*;
public class q1 {

	public static void main(String[] args) throws IOException {
		
		//write      
		
		FileOutputStream i=new FileOutputStream("E:\\2141010002\\2141010002.txt");
		i.write(56);
		i.write(56);
		i.write(77);
		i.write(88);

		//read
		FileInputStream i1=new FileInputStream("E:\\2141010002\\2141010002.txt");
		System.out.println(i1.read());
		System.out.println(i1.read());
		System.out.println(i1.read());
		System.out.println(i1.read());
		i.close();
	}
}