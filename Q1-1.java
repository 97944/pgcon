package pgcon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1 {

    public static void main(String[] args) throws IOException {
    	int count=0;
    	int count2=0;

        ArrayList<Integer> alllist = new ArrayList<Integer>();
        ArrayList<Integer> havelist = new ArrayList<Integer>();
        ArrayList<Integer> salelist = new ArrayList<Integer>();
        ArrayList<Integer> shoplist = new ArrayList<Integer>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int allvolume = Integer.parseInt(line);
		for(int i=0;i<=allvolume;i++){
        	alllist.add(i);
        }
		StringTokenizer token = new StringTokenizer(line, " ");
		int end = Integer.parseInt(token.nextToken());

		while ((line = br.readLine()) != null) {
			token = new StringTokenizer(line, " ");
			while (token.hasMoreTokens()) {
				int h = Integer.parseInt(token.nextToken());
				if (count==0 &&h == 0) {
					break;
				}
				if (h <= end) {
					havelist.add(h);
					count++;
				}
			}
			break;
		}
		int[] have = new int[count];

		for(int i=0;i<count;i++){
        	have[i]=havelist.get(i);
        }

		while ((line = br.readLine()) != null) {
			token = new StringTokenizer(line, " ");
			while (token.hasMoreTokens()) {
				int s = Integer.parseInt(token.nextToken());
				if (count2==0 && s == 0) {
					break;
				}
				if (s <= end) {
					salelist.add(s);
					count2++;
				}
			}
			break;
		}

        for(int i=0;i<count;i++){
       		if(!alllist.isEmpty() && havelist.get(0)!=0){
        	    alllist.remove(alllist.indexOf(have[i]));
       		}
        }

        int[] sale = new int[count2];

        for(int i=0;i<count2;i++){
        	sale[i]=salelist.get(i);
        }

        for(int i=0;i<count2;i++){
        	if(alllist.contains(sale[i])){
        		shoplist.add(sale[i]);
        	}
        }

        Collections.sort(shoplist);

        if(shoplist.isEmpty()){
        	System.out.println("None");
        }else{
        	for (int i = 0 ; i < shoplist.size() ; i++){
                int data = shoplist.get(i);
                System.out.print(data);
                if(i!=(shoplist.size()-1)){
                	System.out.print(" ");
                }
        	}
        }


    }

}
