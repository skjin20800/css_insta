package ch13;

import java.io.FileWriter;
import java.util.Scanner;

public class FileEx {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
FileWriter fout = null;
int c;
	
	try {
		fout = new FileWriter("d://test2.txt");
				while(true) {
					String line = scanner.nextLine();
					if(line.length() == 0) {
						break;
					}
					fout.write(line, 0, line.length());
					fout.write("\r\n", 0,2);
				}
				fout.close();
	} catch (Exception e) {
		System.out.println("½ÇÆÐ");
		// TODO: handle exception
	}
	scanner.close();
}
}
