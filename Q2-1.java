/* 
 * ���w�E���肪�Ƃ��������܂��B
 * �w�E�����������_���C���������܂����̂ŁA�ăA�b�v���[�h�������܂��B
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
