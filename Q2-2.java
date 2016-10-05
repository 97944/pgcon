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
	static final ArrayList<Integer> sList = new ArrayList<Integer>();
	static final ArrayList<Integer> dList = new ArrayList<Integer>();
	static final ArrayList<Integer> cList = new ArrayList<Integer>();
	static final ArrayList<Integer> hList = new ArrayList<Integer>();


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
		Collections.sort(sList);
		Collections.sort(dList);
		Collections.sort(cList);
		Collections.sort(hList);

		if(!sList.isEmpty()){
			output("S",sList);
		}
		if(!dList.isEmpty()){
			output("D",dList);
		}
		if(!cList.isEmpty()){
			output("C",cList);
		}
		if(!hList.isEmpty()){
			output("H",hList);
		}

	}
	/*
	 * char型をint型に変換します。
	 */
	private static int convertNumInt(char num){
		if(num == 'A'){
			return 1;
		}else if(num == '0'){
			return 10;
		}else if(num == 'J'){
			return 11;
		}else if(num == 'Q'){
			return 12;
		}else if(num == 'K'){
			return 13;
		}else {
			return Integer.parseInt(String.valueOf(num));
		}
	}
	/*
	 * 指定された柄のトランプを表示します。
	 */
	private static void output(String type , ArrayList<Integer> list){
		System.out.print(type + ":");
		for(int i=0;i<list.size();i++){
			if(list.get(i)==1){
				System.out.print("A");
			}else if(list.get(i)==10){
				System.out.print(0);
			}else if(list.get(i)==11){
				System.out.print("J");
			}else if(list.get(i)==12){
				System.out.print("Q");
			}else if(list.get(i)==13){
				System.out.print("K");
			}else{
				System.out.print(list.get(i));
			}
			if(i!=list.size()-1){
				System.out.print(",");
			}
		}
		System.out.println();
	}

}
