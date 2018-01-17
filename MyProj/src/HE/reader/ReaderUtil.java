package HE.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReaderUtil {


	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(num * 2);
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();        
        System.out.println(str);        
	}
}
