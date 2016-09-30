package pgcon2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		scanner.useDelimiter(System.getProperty("line.separator"));
        scanner = new Scanner(scanner.next());

		while(scanner.hasNext()){
			list.add(scanner.next());
		}
		String s = "S";
		ArrayList<Integer> sList = new ArrayList<Integer>();
		String d = "D";
		ArrayList<Integer> dList = new ArrayList<Integer>();
		String c = "C";
		ArrayList<Integer> cList = new ArrayList<Integer>();
		String h = "H";
		ArrayList<Integer> hList = new ArrayList<Integer>();
		String a = "A";
		String j = "J";
		String q = "Q";
		String k = "K";
		String ten ="0";
		for(int i=0;i<list.size();i++){
			if(list.get(i).startsWith(s)){
				if(list.get(i).endsWith(a)){
					sList.add(1);
				}else if(list.get(i).endsWith(j)){
					sList.add(11);
				}else if(list.get(i).endsWith(q)){
					sList.add(12);
				}else if(list.get(i).endsWith(k)){
					sList.add(13);
				}else if(list.get(i).endsWith(ten)){
					sList.add(10);
				}else{
					int x =Integer.parseInt(list.get(i).substring(list.get(i).length()-1));
					sList.add(x);
				}
			}else if(list.get(i).startsWith(d)){

				if(list.get(i).endsWith(a)){
					dList.add(1);
				}else if(list.get(i).endsWith(j)){
					dList.add(11);
				}else if(list.get(i).endsWith(q)){
					dList.add(12);
				}else if(list.get(i).endsWith(k)){
					dList.add(13);
				}else if(list.get(i).endsWith(ten)){
					dList.add(10);
				}else{
					int x =Integer.parseInt(list.get(i).substring(list.get(i).length()-1));
					dList.add(x);
				}
			}else if(list.get(i).startsWith(c)){

				if(list.get(i).endsWith(a)){
					cList.add(1);
				}else if(list.get(i).endsWith(j)){
					cList.add(11);
				}else if(list.get(i).endsWith(q)){
					cList.add(12);
				}else if(list.get(i).endsWith(k)){
					cList.add(13);
				}else if(list.get(i).endsWith(ten)){
					cList.add(10);
				}else{
					int x = Integer.parseInt(list.get(i).substring(list.get(i).length()-1));
					cList.add(x);
				}
			}else if(list.get(i).startsWith(h)){

				if(list.get(i).endsWith(a)){
					hList.add(1);
				}else if(list.get(i).endsWith(j)){
					hList.add(11);
				}else if(list.get(i).endsWith(q)){
					hList.add(12);
				}else if(list.get(i).endsWith(k)){
					hList.add(13);
				}else if(list.get(i).endsWith(ten)){
					hList.add(10);
				}else{
					int x = Integer.parseInt(list.get(i).substring(list.get(i).length()-1));
					hList.add(x);
				}
			}
		}
		Collections.sort(sList);
		Collections.sort(dList);
		Collections.sort(cList);
		Collections.sort(hList);

		if(!sList.isEmpty()){
			System.out.print(s +":");
			for(int i=0;i<sList.size();i++){
				if(sList.get(i)==1){
					System.out.print(a);
				}else if(sList.get(i)==10){
					System.out.print(0);
				}else if(sList.get(i)==11){
					System.out.print(j);
				}else if(sList.get(i)==12){
					System.out.print(q);
				}else if(sList.get(i)==13){
					System.out.print(k);
				}else{
					System.out.print(sList.get(i));
				}
				if(i!=sList.size()-1){
					System.out.print(",");
				}
			}
			System.out.println();
		}
		if(!dList.isEmpty()){
			System.out.print(d +":");
			for(int i=0;i<dList.size();i++){
				if(dList.get(i)==1){
					System.out.print(a);
				}else if(dList.get(i)==10){
					System.out.print(0);
				}else if(dList.get(i)==11){
					System.out.print(j);
				}else if(dList.get(i)==12){
					System.out.print(q);
				}else if(dList.get(i)==13){
					System.out.print(k);
				}else{
					System.out.print(dList.get(i));
				}
				if(i!=dList.size()-1){
					System.out.print(",");
				}
			}
			System.out.println();
		}
		if(!cList.isEmpty()){
			System.out.print(c +":");
			for(int i=0;i<cList.size();i++){
				if(cList.get(i)==1){
					System.out.print(a);
				}else if(cList.get(i)==10){
					System.out.print(0);
				}else if(cList.get(i)==11){
					System.out.print(j);
				}else if(cList.get(i)==12){
					System.out.print(q);
				}else if(cList.get(i)==13){
					System.out.print(k);
				}else{
					System.out.print(cList.get(i));
					//System.out.print(cList.get(i).substring(cList.get(i).length()-1));
				}
				if(i!=cList.size()-1){
					System.out.print(",");
				}
			}
			System.out.println();
		}
		if(!hList.isEmpty()){
			System.out.print(h +":");
			for(int i=0;i<hList.size();i++){
				if(hList.get(i)==1){
					System.out.print(a);
				}else if(hList.get(i)==10){
					System.out.print(0);
				}else if(hList.get(i)==11){
					System.out.print(j);
				}else if(hList.get(i)==12){
					System.out.print(q);
				}else if(hList.get(i)==13){
					System.out.print(k);
				}else{
					System.out.print(hList.get(i));
				}
				if(i!=hList.size()-1){
					System.out.print(",");
				}
			}
			System.out.println();
		}
		scanner.close();
	}
}