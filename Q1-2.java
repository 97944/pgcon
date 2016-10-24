package pgcon;

import java.util.Scanner;

public class Q2a {
	static String[] check = {"o","x"};
	public static final int MARU = 0;
	public static final int BATSU = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] dummy = new String[3];
		String str = null;
		for(int i=0;i<3;i++){
			dummy[i] = scanner.next();
			str += dummy[i];
		}
		scanner.close();
		str = str.substring(4, 13);
		char[] cstr = str.toCharArray();
		String[] board = new String[9];
		int countnull = 0,countmaru = 0,countbatsu = 0;
		for(int i=0;i<9;i++){
			board[i] = String.valueOf(cstr[i]);
			if(cstr[i] == '-'){
				countnull++;
			}else if(cstr[i] == 'o'){
				countmaru++;
			}else{
				countbatsu++;
			}
			System.out.println(cstr[i] + " ");
		}

		int result = checkWin(board);

		if(result == MARU){
			System.out.println("WIN");
			return;
		}else if( result == BATSU){
			System.out.println("LOSE");
			return;
		}
		if(countnull==0){
			System.out.println("FIN");
		}else if(countmaru != countbatsu){
			System.out.println("NG");
		}else{
			result = checkReach(board);
			if(result == MARU){
				System.out.println("OK");
			}else{
				System.out.println("NO");
			}
		}
	}
	/*
	 * リーチ判定
	 * "-"の場所に"o"を入れて勝者ならば、0を返す。それ以外は-1を返す。
	 */
	private static int checkReach(String board[]){

		int[] result = new int[8];

		for(int j=0;j<9;j++){
			if(board[j].equals("-")){
				board[j] = check[0];
				for(int i=0;i<3;i++){
					result[i] = checkThree(board,i,i+3,i+6);
					result[i+3] = checkThree(board,i*3,i*3+1,i*3+2);
				}
				result[6] = checkThree(board,4,0,8);
				result[7] = checkThree(board,4,2,6);
				for(int k=0;k<8;k++){
					if(result[k] >= 0){
						return result[k];
					}
				}
				board[j] = "-";
			}
		}
		return -1;
	}
	/*
	 * 勝者判定
	 * 斜め、縦、横を見て"o"が勝者なら0,"x"が勝者なら1,それ以外は-1を返す。
	 */
	private static int checkWin(String board[]){
		int[] result = new int[8];

		for(int i=0;i<3;i++){
			result[i] = checkThree(board,i,i+3,i+6);
			result[i+3] = checkThree(board,i*3,i*3+1,i*3+2);
		}
		result[6] = checkThree(board,4,0,8);
		result[7] = checkThree(board,4,2,6);
		for(int i=0;i<8;i++){
			if(result[i] >= 0){
				return result[i];
			}
		}
		return -1;
	}
	/*
	 * 引数の値によって勝者判定
	 * "o"が勝者なら0,"x"が勝者なら1,それ以外は-1を返す。
	 */
	private static int checkThree(String winner[], int idx1, int idx2, int idx3){
		for(int i=0;i<2;i++){
			if(winner[idx1].equals(check[i])){
				if(winner[idx2].equals(check[i])){
					if(winner[idx3].equals(check[i])){
						return i;
					}
				}
			}
		}
		return -1;
	}
}
