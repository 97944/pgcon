package prcon3.p2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] str = s.split(" ");
		int[] n = new int[str.length];
		short[] sh = new short[str.length];
		HashMap<Short,String> map = new HashMap<Short,String>();
		for(int i=0;i<str.length;i++){
			n[i] = Integer.decode(str[i]);
			sh[i] = (short)n[i];
			map.put(sh[i], str[i]);
		}
		Arrays.sort(sh);
		for(int i=0;i<str.length;i++){
			System.out.print(map.get(sh[i]));
			if(i < str.length - 1){
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}
