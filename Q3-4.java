package prcon3.p4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		int N = scanner.nextInt();
		String[] str = new String[N];
		for(int i=0;i<N;i++){
			str[i] = scanner.next();
		}
		int M = scanner.nextInt();
		String[] comStr = new String[M];
		int[] check = new int[M];
		for(int i=0;i<M;i++){
			comStr[i] = scanner.next();
			if(comStr[i].charAt(0) == '%' && comStr[i].charAt(comStr[i].length() - 1) == '%'){
				comStr[i] = comStr[i].substring(1, comStr[i].length() - 1);
				check[i] = 0;
			}else if(comStr[i].charAt(0) == '%'){
				comStr[i] = comStr[i].substring(1, comStr[i].length());
				check[i] = 1;
			}else if(comStr[i].charAt(comStr[i].length() - 1) == '%'){
				comStr[i] = comStr[i].substring(0, comStr[i].length() - 1);
				check[i] = 2;
			}else{
				check[i] = 3;
			}
		}

		for(int i=0;i<M;i++){
			ArrayList<Integer> ans = new ArrayList<Integer>();
			for(int j=0;j<N;j++){
				if(checkStr(check[i],str[j],comStr[i])){
					ans.add(j+1);
				}
			}
			if(ans.isEmpty()){
				System.out.println("Not match");
			}else{
				for(int j=0;j<ans.size();j++){
					System.out.print(ans.get(j));
					if(j < ans.size() - 1){
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			ans.clear();
		}
	}
	public static boolean checkStr(int x,String s,String cs){
		switch(x){
		case 0:
			if(s.indexOf(cs) != -1){
				return true;
			}
			break;
		case 1:
			if(s.endsWith(cs)){
				return true;
			}
			break;
		case 2:
			if(s.startsWith(cs)){
				return true;
			}
		case 3:
			if(s.equals(cs)){
				return true;
			}
		}
		return false;
	}

}
