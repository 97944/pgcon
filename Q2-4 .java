/*
 * やっと問題の意味がわかりました！ありがとうございます。
 * Eclipseで実行すると、25行80文字で表示されるのですが、
 * AtCoderのコードテストで実行結果を確認すると
 *


           A
          A A
         A   A
        A     A
       AAAAAAAAA
      A         A
     A           A


                                                    ...
   と表示されてしまいます。
   時間ある時に回答をお願いいたします。
 */
package pgcon2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4b {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		int input = scanner.nextInt();
		String[] str = new String[input];
		char[][] cstr = new char[input][];
		ArrayList<String> esc = new ArrayList<String>();

		for(int i=0;i<input;i++){
			str[i] = scanner.next();
			cstr[i] = str[i].toCharArray();
			for(int j=0;j<str[i].length();j++){
				if(cstr[i][j] ==0x1B){
					j += 2;
					String test = "";
					while(cstr[i][j] != 0x1B && j < str[i].length()-1){
						test += cstr[i][j];
						j++;
						if(j==str[i].length()-1){
							test += cstr[i][str[i].length()-1];
						}
					}
					esc.add(test);
					j--;
				}
			}
		}

		scanner.close();

		char[][] screen = new char[25][80];
		int x = 0,y = 0;
		/* 'J'をはじめに見つけたら、screenを" "で初期化
		 * ';'をはじめに見つけたら、見つけた位置によって、1桁か2桁か判断し、カーソル移動(カーソル:x,y)
		 * 'H'をはじめに見つけたら、Hの次からの文字をscreen[x][y]に描写
		 * */
		for(int i=0;i<esc.size();i++){
			for(int j=0;j<esc.get(i).length();j++){
				switch (esc.get(i).charAt(j)){
				case 'J' :
					for(int k=0;k<25;k++){
						for(int l=0;l<80;l++){
							screen[k][l] = ' ';
						}
					}

					x = 0;
					y = 0;
					break;
				case ';' :

					if(j==1){
						x = Character.digit(esc.get(i).charAt(0),10);
					}else{
						x = Character.digit(esc.get(i).charAt(0)*10 + esc.get(i).charAt(1),10);
					}
					int vy = 0;
					j++;
					for(int k=j;k<esc.get(i).length();k++){
						if(esc.get(i).charAt(k) == 'H'){
							if(vy == 1){
								y = Character.digit(esc.get(i).charAt(k-1),10);
							}else{
								y = Character.digit(esc.get(i).charAt(k-2),10) * 10 + Character.digit(esc.get(i).charAt(k-1),10);
							}
						}
						vy++;
					}
					break;
				case 'H' :
					j++;
					for(int k=j;k<esc.get(i).length();k++){
						screen[x][y] = (esc.get(i).charAt(k));
						y++;
						j++;
						if(y>=80){
							x += 1;
							y %= 80;
						}
						if(x>=25){
							x %= 25;
						}
					}
				}
			}
		}
		for(int i=0;i<25;i++){
			for(int j=0;j<80;j++){
				System.out.print(screen[i][j]);
			}
			System.out.println();
		}
	}
}