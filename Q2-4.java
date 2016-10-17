/*
 * 質問があります。お時間がある時にでも答えていただけたら、幸いです。
 * エスケープシーケンスの16進0x1Bで読み替えるというのが理解できません。
 * "<ESC>["のあとの文字列で条件式を使うのはなんとなくわかるのですが。。。
 * あと、最初に入力の行数を入力とするのに、1行に何個もエスケープシーケンスが入力されるケースが
 * あるのですが、入力の行数を入力させるのはなんででしょう。
 */

package pgcon2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		ArrayList<String> escape = new ArrayList<String>();
		for(int i=0;i<input;i++){
			escape.add(scanner.nextLine());
		}
		String txt = scanner.nextLine();
		System.out.println(Integer.parseInt(txt,16));

	}

}
