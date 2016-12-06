package practice;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int num = scanner.nextInt();
		scanner.close();
		if(str.length() >= num){
			System.out.println(str);
		}else{
			int x = num - str.length();

			if(x % 2 == 0){
				for(int i=0;i<x/2;i++){
					System.out.print("_");
				}
				System.out.print(str);
				for(int i=0;i<x/2;i++){
					System.out.print("_");
				}
				System.out.println();
			}else{
				for(int i=0;i<x/2;i++){
					System.out.print("_");
				}
				System.out.print(str);
				for(int i=0;i<x/2+1;i++){
					System.out.print("_");
				}
				System.out.println();
			}
		}
	}

}
