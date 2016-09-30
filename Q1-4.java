package pgcon;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = new String[72];
		String change[][] = new String[72][8];
		for(int i=0;i<72;i++){
			str[i] = scanner.next();
			int val = Integer.parseInt(str[i], 16);
			String binary = Integer.toBinaryString(val);

			while(binary.length()!=8){
				binary="0"+binary;
			}
			String sp[] = binary.split("");
			for(int j=0;j<sp.length;j++){
				change[i][j]=sp[j];
				if(sp[j].equals("0")){
					System.out.print(".");
				}else if(sp[j].equals("1")){
					System.out.print("X");
				}
			}
			if((i+1)%3==0){
				System.out.println();
			}
		}
		System.out.println();

		for(int k=0;k<3;k++){
			for(int j=0;j<8;j++){
				for(int i=23;i>=0;i--){
					if(change[i*3+k][j].equals("0")){
						System.out.print(".");
					}else if(change[i*3+k][j].equals("1")){
						System.out.print("X");
					}
				}
				System.out.println();
			}
		}
		scanner.close();
	}

}
