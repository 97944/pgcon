package prconpractice3;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int n = scanner.nextInt();
		if(s.length() > n){
			System.out.println(s);
		}else{
			int ln = (n - s.length()) / 2;
			int rn = ln + (n - s.length()) % 2;
			for(int i=0;i<ln;i++){
				System.out.print("_");
			}
			System.out.print(s);
			for(int i=0;i<rn;i++){
				System.out.print("_");
			}
			System.out.println();
		}
	}

}
