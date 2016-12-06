package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		char[] cstr = str.toCharArray();
		ArrayList<Character> tanuki = new ArrayList<Character>();
		for(int i=0;i<str.length();i++){
			if(cstr[i] == 't'){
				if(cstr[i+1] != 'a'){
					tanuki.add(cstr[i]);
				}else{
					i++;
				}
			}else{
				tanuki.add(cstr[i]);
			}
		}
		for(int i=0;i<tanuki.size();i++){
			System.out.print(tanuki.get(i));
		}
		System.out.println();
	}
}
