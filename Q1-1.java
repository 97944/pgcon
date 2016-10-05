/* 
 * ご指摘ありがとうございます。
 * 指摘いただいた点を修正いたしましたので、再アップロードいたします。
 * 
 */

package pgcon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1a {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> havelist = new ArrayList<Integer>(); // すでに持っている巻数リスト
		ArrayList<Integer> salelist = new ArrayList<Integer>(); // 古本屋に売っている巻数リスト
		ArrayList<Integer> buylist = new ArrayList<Integer>(); // 買うべき巻数リスト

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int volume = Integer.parseInt(line);

		StringTokenizer token = new StringTokenizer(line, " ");

		if((line = br.readLine()) != null) {
			token = new StringTokenizer(line, " ");
			while (token.hasMoreTokens()) {
				int h = Integer.parseInt(token.nextToken());
				if (havelist.size()==0 && h == 0) {
					break;
				}
				if (h <= volume) {
					havelist.add(h);
				}
			}
		}

		if((line = br.readLine()) != null) {
			token = new StringTokenizer(line, " ");
			while (token.hasMoreTokens()) {
				int s = Integer.parseInt(token.nextToken());
				if (salelist.size()==0 && s == 0) {
					break;
				}
				if (s <= volume) {
					salelist.add(s);
				}
			}
		}

		for(int i=0;i<salelist.size();i++){
			if(!havelist.contains(salelist.get(i))){
				buylist.add(salelist.get(i));
			}
		}
		Collections.sort(buylist);
		if(buylist.isEmpty()){
			System.out.println("None");
		}else{
			for (int i = 0 ; i < buylist.size() ; i++){
				int data = buylist.get(i);
				System.out.print(data);
				if(i!=(buylist.size()-1)){
					System.out.print(" ");
				}
			}
		}
    }
}
