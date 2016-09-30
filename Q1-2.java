package pgcon;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		String dummy1;
		String dummy2;
		String dummy3;
		String str[] = new String[9];
		Scanner scanner = new Scanner(System.in);
		dummy1=scanner.next();
		dummy2=scanner.next();
		dummy3=scanner.next();
		for(int i=0;i<3;i++){
			str[i]=dummy1.substring(i,i+1);
		}
		for(int i=0;i<3;i++){
			str[i+3]=dummy2.substring(i,i+1);
		}
		for(int i=0;i<3;i++){
			str[i+6]=dummy3.substring(i,i+1);
		}


		/*for(int i=0;i<3;i++){
			System.out.print(" ");
			for(int j=0;j<3;j++){
				if(str[i*3+j].equals("-")){
					if(j<2){
						System.out.print(" ｜" );
					}else{
						System.out.println("  ");
					}
				}else if(j<2){
					System.out.print(str[i*3+j] + "｜" );
				}else{
					System.out.println(str[i*3+j]);
				}
			}
			if(i<2){
				System.out.println("―+―+―");
			}
		}*/
		int counto=0;
		int countx=0;
		int countnull=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(str[i*3+j].equals("o")){
					counto++;
				}else if(str[i*3+j].equals("x")){
					countx++;
				}else if(str[i*3+j].equals("-")){
					countnull++;
				}
			}
		}

		int check;
		check =Check(str);
		int reach;
		reach=checkReach(str);
		if(check==0){
			System.out.println("WIN");
			return;
		}
		else if(check==1){
			System.out.println("LOSE");
			return;
		}
		else if(countnull==0 && check==-1){
			System.out.println("FIN");
			return;
		}
		else if(counto==countx+1 && check==-1){
			System.out.println("NG");
			return;
		}
		else if(reach==0){
			System.out.println("OK");
		}
		else{
			System.out.println("NO");
		}

	}
	static int Check(String winner[]){
		String[] check = new String[2];
		check[0]="o";
		check[1]="x";
		for(int i=0;i<2;i++){
			if(winner[4].equals(check[i])){
				if(winner[0].equals(check[i])){
					if(winner[8].equals(check[i])){
						return i;
					}
				}
				if(winner[2].equals(check[i])){
					if(winner[6].equals(check[i])){
						return i;
					}
				}
			}
			for(int j=0;j<3;j++){
				if(winner[j*3].equals(check[i])){
					if(winner[j*3+1].equals(check[i])){
						if(winner[j*3+2].equals(check[i])){
							return i;
						}
					}
				}
				if(winner[j].equals(check[i])){
					if(winner[j+3].equals(check[i])){
						if(winner[j+6].equals(check[i])){
							return i;
						}
					}
				}
			}
		}
		return -1;
	}
	static int checkReach(String winner[]){
		String[] check = new String[2];
		check[0]="o";
		check[1]="x";
		int count=0;
		int nullcount=0;
		for(int i=0;i<2;i++){
			if(winner[4].equals(check[i])){
				count++;
			}else if(winner[4].equals("-")){
				nullcount++;
			}
			if(winner[0].equals(check[i])){
				count++;
			}else if(winner[0].equals("-")){
				nullcount++;
			}
			if(winner[8].equals(check[i])){
				count++;
			}else if(winner[8].equals("-")){
				nullcount++;
			}
			if(count==2 && nullcount==1){
				return i;
			}
			count=0;
			nullcount=0;
			if(winner[4].equals(check[i])){
				count++;
			}else if(winner[4].equals("-")){
				nullcount++;
			}
			if(winner[2].equals(check[i])){
				count++;
			}else if(winner[2].equals("-")){
				nullcount++;
			}
			if(winner[6].equals(check[i])){
				count++;
			}else if(winner[6].equals("-")){
				nullcount++;
			}
			if(count==2 && nullcount==1){
				return i;
			}
			count=0;
			nullcount=0;
			for(int j=0;j<3;j++){
				if(winner[j*3].equals(check[i])){
					count++;
				}else if(winner[j*3].equals("-")){
					nullcount++;
				}
				if(winner[j*3+1].equals(check[i])){
					count++;
				}else if(winner[j*3+1].equals("-")){
					nullcount++;
				}
				if(winner[j*3+2].equals(check[i])){
					count++;
				}else if(winner[j*3+2].equals("-")){
					nullcount++;
				}
				if(count==2 && nullcount==1){
					return i;
				}
				count=0;
				nullcount=0;
				if(winner[j].equals(check[i])){
					count++;
				}else if(winner[j].equals("-")){
					nullcount++;
				}
				if(winner[j+3].equals(check[i])){
					count++;
				}else if(winner[j+3].equals("-")){
					nullcount++;
				}
				if(winner[j+6].equals(check[i])){
					count++;
				}else if(winner[j+6].equals("-")){
					nullcount++;
				}
				if(count==2 && nullcount==1){
					return i;

				}
				count=0;
				nullcount=0;
			}
		}
		return -1;
	}

}
