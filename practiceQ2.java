package prconpractice3;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str[i].length();j++){
				if(j == 0){
					System.out.print(String.valueOf(str[i].charAt(j)).toUpperCase());
				}else{
					System.out.print(str[i].charAt(j));
				}
			}
			if(i < str.length - 1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}
