package codetest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner a1 = new Scanner(System.in);
		int a=0, b=0, c=0;
		a = a1.nextInt();
	
		
		
		for(int i = 0; i<=a;i++) {
	 b+=i;
			}
		System.out.println(b);
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int num = Integer.parseInt(br.readLine());
			br.close();
			
			
		}
		catch(IOException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
			
		
}
		
		
}
