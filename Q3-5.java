package prcon3.p5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p20 = scanner.nextInt(),p9 = scanner.nextInt(),
				p6 = scanner.nextInt(),p4 = scanner.nextInt();
		int sum = 0;
		int ansPrice = Integer.MAX_VALUE;
		int ansNum = Integer.MAX_VALUE;
		int[] buy = new int[4];
		for(int i=0;i<=n/20;i++){
			for(int j=0;j<=(n-i*20)/9;j++){
				for(int k=0;k<=(n-i*20-j*9)/6;k++){
					for(int l=0;l<=(n-i*20-j*9-k*6)/4;l++){
						sum = 20 * i + 9 * j + 6 * k + 4 * l;
						if(sum == n){
							int price = p20 * i + p9 * j + p6 * k + p4 * l;
							int num = i + j + k + l;
							if(price <= ansPrice && num <= ansNum){
								ansPrice = price;
								ansNum = num;
								buy[0] = i;
								buy[1] = j;
								buy[2] = k;
								buy[3] = l;
							}
						}
					}
				}
			}
		}
		for(int i=0;i<4;i++){
			System.out.print(buy[i]);
			if(i < 3){
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}
