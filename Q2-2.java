/*
 * ご指摘ありがとうございます。
 * 指摘いただいた点を修正いたしましたので、再アップロードいたします。
 *
 */

package pgcon2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2a {
	static ArrayList<Integer> sList = new ArrayList<Integer>();
	static ArrayList<Integer> dList = new ArrayList<Integer>();
	static ArrayList<Integer> cList = new ArrayList<Integer>();
	static ArrayList<Integer> hList = new ArrayList<Integer>();
	public static final String table = "A234567890JQK";


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
        scanner = new Scanner(scanner.next());
		ArrayList<String> list = new ArrayList<String>();
		while(scanner.hasNext()){
			list.add(scanner.next());
		}
		scanner.close();
		for(int i=0;i<list.size();i++){
			String str = list.get(i);
			char[] cstr = str.toCharArray();
			if(cstr[0] == 'S'){
				sList.add(convertNumInt(cstr[1]));
			}else if(cstr[0] == 'D'){
				dList.add(convertNumInt(cstr[1]));
			}else if(cstr[0] == 'C'){
				cList.add(convertNumInt(cstr[1]));
			}else if(cstr[0] == 'H'){
				hList.add(convertNumInt(cstr[1]));
			}
		}
		output("S",sList);
		output("D",dList);
		output("C",cList);
		output("H",hList);

	}
	/*
	 * char型をint型に変換します。
	 */
	private static int convertNumInt(char num){

		return table.indexOf(num)+1;
	}
	/*
	 * 指定された柄のトランプを表示します。
	 */
	private static void output(String type , ArrayList<Integer> list){

		if(list.isEmpty()){
			return;
		}
		Collections.sort(list);
		System.out.print(type + ":");

		for(int i=0;i<list.size();i++){
			System.out.print(table.charAt(list.get(i)-1));
			if(i!=list.size()-1){
				System.out.print(",");
			}
		}
		System.out.println();
	}

}
