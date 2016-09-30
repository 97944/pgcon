package pgcon;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int oldTax = scanner.nextInt();
		int newTax = scanner.nextInt();
		int sum = scanner.nextInt();
		int newsum=0;
		int max=0;

		for(int i=1;i<sum*100/(100+oldTax);i++){
			int a = i*(100+oldTax)/100;
			int b = sum-a;
			int c = (b*100)%(100+oldTax);
			int d = a*(100+newTax)/100;
			int e = c*(100+newTax)/100;

			if(c==0){
				newsum = d+e;
				if(max<newsum){
					max = newsum;
				}
			}else{
				c += 1;
				int f = c*(100+oldTax)/100;
				int g = a + f;
				if(g>sum){
					break;
				}else{
					newsum = d+e;
					if(max<newsum){
						max = newsum;
					}
				}
			}
		}
		System.out.print(max);

	}
}
