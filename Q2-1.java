/* 
 * ご指摘ありがとうございます。
 * 指摘いただいた点を修正いたしましたので、再アップロードいたします。
 * 
 */

package pgcon2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));

		String txt = scanner.next();
		scanner.close();
		
		for(int i=txt.length()-1;i>=0;i--){
			System.out.print(String.valueOf(txt.charAt(i)));
		}
		System.out.println("");
	}
}
