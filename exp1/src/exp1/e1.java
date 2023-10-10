package exp1;

import java.io.*;
import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("E:\\2141010002\\2141010002.txt");
            PrintWriter printWriter = new PrintWriter(fileOutputStream);

            Scanner sc = new Scanner(System.in);
            System.out.println("@ to exit");

            String input;
            while (true) {
                input = sc.nextLine();
                if (!input.equals("@")) {
                    printWriter.println(input);
                } else {
                    break;
                }
            }

            printWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}