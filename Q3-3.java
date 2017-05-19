package prcon3.p3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int k = str.length();
		int S = scanner.nextInt();
		long N = scanner.nextLong() - 1;
		int M = scanner.nextInt();
		char[] c = str.toCharArray();
		Arrays.sort(c);
		String s = String.valueOf(c);
		long[] tbl = new long[S];
		long n = N;
		for(int i=1;i<=M;i++){
			String x = "";
			for(int j=S-1;j>=0;j--){
				if(j != S-1){
					n /= k;
				}
				tbl[j] = n % k;
				x = s.charAt((int)tbl[j]) + x;
			}
			System.out.println(x);
			n = N + i;
		}
	}

}
