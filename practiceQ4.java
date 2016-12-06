package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		String dummy = scanner.next();
		scanner.close();
		ArrayList<Character> cstr = new ArrayList<>();
		for (int i = 0; i < dummy.length(); i++) {
			if (dummy.charAt(i) != ' ') {
				cstr.add(dummy.charAt(i));
			}
		}
		String str = String.valueOf(cstr.get(0));
		for(int i=1;i<cstr.size();i++){
			str += String.valueOf(cstr.get(i));
		}
		//System.out.println(str);

		int x = 0;
		ArrayList<Integer> num = new ArrayList<>();
		ArrayList<Character> ope = new ArrayList<>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == '+' || str.charAt(i) == '-'){
				ope.add(str.charAt(i));
				num.add(getNum(str.substring(x,i)));
				x = i+1;
			}
		}
		num.add(getNum(str.substring(x,str.length())));

		for(int i=0;i<num.size();i++){
			//System.out.println(num.get(i));
		}


		int result = 0;
		for(int i=0;i<num.size();i++){
			if(i == 0){
				result = num.get(i);
				//System.out.println(result);
			}else if(ope.get(i-1) == '+'){
				//System.out.println(result + " " + ope.get(i-1) + " " + num.get(i));
				result += num.get(i);

			}else if(ope.get(i-1) == '-'){
				//System.out.println(result + " " + ope.get(i-1) + " " + num.get(i));
				result -= num.get(i);
			}
		}

		System.out.println(result);


	}public static int getNum(String str){
		int num = 0;

		num = Integer.parseInt(str);

		return num;
	}

}
