package Q5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int piece = scanner.nextInt();
		int twen = scanner.nextInt();
		int nine = scanner.nextInt();
		int six = scanner.nextInt();
		int four = scanner.nextInt();
		scanner.close();
		int min = 10000000;
		int min20 = 0,min9 = 0,min6 = 0,min4 = 0;
		int sum = 1000;

		for(int i=0;i<50;i++){
			for(int j=0;j<50;j++){
				for(int k=0;k<50;k++){
					for(int l=0;l<50;l++){
						int num = i*20 + j*9 + k*6 + l*4;
						if(num == piece){
							int price = i*twen + j*nine + k*six + l*four;
							int dummy = i + j + k + l;
							if(min >= price && sum >= dummy){
								min = price;
								min20 = i;
								min9 = j;
								min6 = k;
								min4 = l;
								sum = i + j + k + l;
							}
						}
					}
				}
			}
		}

		System.out.println(min20 + " " + min9 + " " + min6 + " " + min4);

	}

}
