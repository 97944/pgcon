package pgcon2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		int rCount=0;
		int gCount=0;
		int bCount=0;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c=='R'){
				rCount++;
			}else if(c=='G'){
				gCount++;
			}else if(c=='B'){
				bCount++;
			}
		}
		int count=0;
		if(rCount%2!=0){
			count++;
		}
		if(gCount%2!=0){
			count++;
		}
		if(bCount%2!=0){
			count++;
		}
		System.out.print(count);
	}
}
