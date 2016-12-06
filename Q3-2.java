package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		String str = scanner.next();
		ArrayList<String> s = new ArrayList<String>();

		String dummy = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				dummy += str.charAt(i);
			} else {
				s.add(dummy);
				dummy = "";
			}
			if (i == str.length() - 1) {
				s.add(dummy);
			}
		}
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < s.size(); i++) {
			if(Integer.decode(s.get(i)) > 32767){
				int x =Integer.decode(s.get(i)) - 32768;
				int y = -32768 + x;
				num.add(y);
			}else{
				num.add(Integer.decode(s.get(i)));
			}

		}


		Collections.sort(num);
		/*for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}*/

		for (int i = 0; i < num.size(); i++) {
			for (int j = 0; j < s.size(); j++) {
				if (num.get(i).equals(Integer.decode(s.get(j))) || num.get(i).equals(Integer.decode(s.get(j))-65536)) {
					System.out.print(s.get(j));
					break;
				}
			}
			if(i < num.size()-1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}
