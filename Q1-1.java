/* 
 * ���w�E���肪�Ƃ��������܂��B
 * �w�E�����������_���C���������܂����̂ŁA�ăA�b�v���[�h�������܂��B
 * 
 */

package pgcon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1a {

	public static void main(String[] args) throws IOException {
		ArrayList<Integer> havelist = new ArrayList<Integer>(); // ���łɎ����Ă��銪�����X�g
		ArrayList<Integer> salelist = new ArrayList<Integer>(); // �Ö{���ɔ����Ă��銪�����X�g
		ArrayList<Integer> buylist = new ArrayList<Integer>(); // �����ׂ��������X�g

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int volume = Integer.parseInt(line);

		StringTokenizer token = new StringTokenizer(line, " ");

		if((line = br.readLine()) != null) {
			token = new StringTokenizer(line, " ");
			while (token.hasMoreTokens()) {
				int h = Integer.parseInt(token.nextToken());
				if (havelist.size()==0 && h == 0) {
					break;
				}
				if (h <= volume) {
					havelist.add(h);
				}
			}
		}

		if((line = br.readLine()) != null) {
			token = new StringTokenizer(line, " ");
			while (token.hasMoreTokens()) {
				int s = Integer.parseInt(token.nextToken());
				if (salelist.size()==0 && s == 0) {
					break;
				}
				if (s <= volume) {
					salelist.add(s);
				}
			}
		}

		for(int i=0;i<salelist.size();i++){
			if(!havelist.contains(salelist.get(i))){
				buylist.add(salelist.get(i));
			}
		}
		Collections.sort(buylist);
		if(buylist.isEmpty()){
			System.out.println("None");
		}else{
			for (int i = 0 ; i < buylist.size() ; i++){
				int data = buylist.get(i);
				System.out.print(data);
				if(i!=(buylist.size()-1)){
					System.out.print(" ");
				}
			}
		}
    }
}
