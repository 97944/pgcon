/*
 * 少し強引にですが、
 * 入力例 : 1
<ESC>[2J<ESC>[3;11HA<ESC>[4;10HA A<ESC>[5;9HA   A<ESC>[6;8HA     A<ESC>[7;7HAAAAAAAAA<ESC>[8;6HA<ESC>[8;16HA<ESC>[9;5HA<ESC>[9;17HA
に対して、
出力例 :

          A
         A A
        A   A
       A     A
      AAAAAAAAA
     A         A
    A           A
















 を出力する事はできました。
しかし、AtCoderに提出すると部分点ももらえない状況です。
お暇な時間に回答していただけると幸いです。
 */

package pgcon2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		int input = scanner.nextInt();
		String[] str = new String[input];
		char[][] cstr = new char[input][];
		ArrayList<String> esc = new ArrayList<String>();

		// str[]に1行ずつ読み込み、cstr[][]に1文字ずつ格納 esc<>に<ESC>[の1単位ずつ格納
		for(int i=0;i<input;i++){
			str[i] = scanner.next();
			cstr[i] = str[i].toCharArray();
			for(int j=0;j<str[i].length();j++){
				if(cstr[i][j] == '<'){
					j += 6;
					String test = null;
					while(cstr[i][j] != '<' && j < str[i].length()-1){
						test += cstr[i][j];
						j++;
						if(j==str[i].length()-1){
							test += cstr[i][str[i].length()-1];
						}
					}
					test = test.substring(4,test.length()); //はじめの4文字にnullが入ってしまう為、強引に取り出してます。
					esc.add(test);
					j--;
				}
			}
		}
		scanner.close();

		String[][] screen = new String[25][80];
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
							screen[k][l] = " ";
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
						screen[x][y] = String.valueOf(esc.get(i).charAt(k));
						y++;
						j++;
						if(y==80){
							x += 1;
							y =1;
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
