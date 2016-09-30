package pgcon2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String[] list = new String[s.length()];
		int rCount=0;
		int gCount=0;
		int bCount=0;
		for(int i=0;i<s.length();i++){
			list[i]=String.valueOf(s.charAt(i));
			if(list[i].equals("R")){
				rCount++;
			}else if(list[i].equals("G")){
				gCount++;
			}else if(list[i].equals("B")){
				bCount++;
			}
		}
		int r=0;
		if(rCount%2!=0){
			r = rCount%2;
		}
		int g=0;
		if(gCount%2!=0){
			g = gCount%2;
		}
		int b=0;
		if(bCount%2!=0){
			b = bCount%2;
		}
		int sum = r+g+b;
		System.out.print(sum);
		scanner.close();
	}

}
