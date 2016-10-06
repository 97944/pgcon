/*
 * 全体のジョブ数、ジョブ名、実行時間、後続ジョブ数、後続ジョブ名を
 * 入力から配列に格納する事までは、できたのですが、
 * 経路が2つ以上ある場合の経路の取り出し方がわかりません。
 * お時間があれば、教えていただきたいです。
 *
 */

package pgcon;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); //全体のジョブ数
		String[] job = new String[input]; //ジョブ名
		int[] time = new int[input]; //ジョブの実行時間
		int[] jobnum = new int[input]; //後続ジョブの数
		String[][] afterJob = new String[input][]; //後続ジョブ名
		//String[] afterJob = new String[input];
		//System.out.println();
		//System.out.println(input);

		for(int i=0;i<input;i++){
			job[i] = scanner.next();
			time[i] = scanner.nextInt();
			jobnum[i] = scanner.nextInt();
			//System.out.print(job[i] + " " + time[i] + " " + jobnum[i]);
			if(i > 0){
				for(int j=0;j<jobnum[i];j++){
					afterJob[i][j] = scanner.next();
				}
			}
			scanner.close();
			//System.out.println();
		}
		int count =0;
		int max =0;
		for(int i=0;i<input;i++){
			for(int j=i+1;j<input;j++){
				if(job[i].equals(afterJob[j])){
					count++;
				}
			}
			if(max<count){
				max = count;
			}
			count = 0;
		}
		System.out.println(max);
		int criticalTime = 0;
		String[] critical = new String[max];
		/*for(int i=0;i<max;i++){
			critical[i]=job[0];
		}*/
		/*for(int k=0;k<max;k++){
			for(int i=0;i<input;i++){
				//if(job[i].equals(afterJob[i][0])){
				for(int j=0;j<input;j++){
					if(i>0 && afterJob[i].equals(job[j])){
					//criticalTime += time[i];
					critical[k] += job[i];
					//break;
					}
				}
			}
			System.out.println(critical[k]);
		}*/

		/*for(int i=0;i<max;i++){
			for(int j=0;j<input;j++){
				for(int k=0;k<input;k++){
					if(job[j].equals(afterJob[k])){
						critical[i]+=job[j];
						for(int l=0;l<input;l++){
							if(job[k].equals(afterJob[l])){
								critical[i]+=job[k];
								for(int m=0;m<input;m++){
									if(job[l].equals(afterJob[m])){
										critical[i]+=job[l];
									}
								}
							}
						}
					}
				}
			}
			System.out.println(critical[i]);
		}*/
	}
}