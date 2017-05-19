package prconpractice3;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		s = s.replaceAll(" ","");
		int tmp = 0;
		int n = 0;
		int result = 0;
		char op = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) != '+' && s.charAt(i) != '-'){
				if(n != 0){
					tmp = tmp * 10;
				}
				tmp += Character.digit(s.charAt(i),10);
				n++;
			}else{
				if(op == '-'){
					result -= tmp;
				}else{
					result += tmp;
				}
				op = s.charAt(i);
				tmp = 0;
				n = 0;
			}
		}
		if(op == '-'){
			result -= tmp;
		}else{
			result += tmp;
		}

		System.out.println(result);
	}

}
