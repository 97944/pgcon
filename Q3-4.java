package Q4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		int n = scanner.nextInt();
		String[] x = new String[n];

		for (int i = 0; i < n; i++) {
			x[i] = scanner.next();
			if (x[i].equals(null)) {
				x[i] = "";
			}
		}
		String dummy2 = scanner.next();
		int m = 0;
		if(isNumber(dummy2)){
			m = Integer.parseInt(dummy2);
		}else{
			m = Integer.parseInt(x[n-1]);
			x[n-1] = "";
		}
		String[] y = new String[m];
		/*for (int i = 0; i < m; i++) {
			if(isNumber(dummy2) == false && i == 0){
				y[0] = dummy2;
				i++;
			}
			y[i] = scanner.next();

			if (y[i].equals(null)) {
				y[i] = "";
			}
		}*/
		int z = 0;
		while(scanner.hasNext()){
			y[z] = scanner.next();
			z++;
		}
		if(y[m-1] == null){
			y[m-1] = "";
		}
		String[] af = new String[m];
		for (int i = 0; i < m; i++) {
			af[i] = "";
		}
		boolean start = false;
		boolean end = false;
		for (int i = 0; i < m; i++) {
			start = false;
			end = false;
			for (int j = 0; j < y[i].length(); j++) {
				if (y[i].charAt(j) == '%' && j == 0) {
					start = true;
				} else if (y[i].charAt(j) == '%' && j == y[i].length() - 1) {
					end = true;
				} else {
					af[i] += y[i].charAt(j);
				}
			}
			int count = 0;
			if (af[i] == ""){
				System.out.println("Not match");
			}
			else if (start == false && end == false) {
				for (int k = 0; k < n; k++) {
					if (x[k].equals(af[i])) {
						System.out.print(k + 1);
						if (k < n - 1) {
							System.out.print(" ");
						}
					} else {
						count++;
					}
				}
				if (count == n) {
					System.out.println("Not match");
				} else {
					System.out.println();
				}
			} else if (start == true && end == false) {
				for (int k = 0; k < n; k++) {
					if (x[k].endsWith(af[i])) {
						System.out.print(k + 1);
						if (k < n - 1) {
							System.out.print(" ");
						}
					} else {
						count++;
					}
				}
				if (count == n) {
					System.out.println("Not match");
				} else {
					System.out.println();
				}

			} else if (start == false && end == true) {
				for (int k = 0; k < n; k++) {
					if (x[k].startsWith(af[i])) {
						System.out.print(k + 1);
						if (k < n - 1) {
							System.out.print(" ");
						}
					} else {
						count++;
					}
				}
				if (count == n) {
					System.out.println("Not match");
				} else {
					System.out.println();
				}

			} else {
				for (int k = 0; k < n; k++) {
					if (x[k].indexOf(af[i]) != -1) {
						System.out.print(k + 1);
						if (k < n - 1) {
							System.out.print(" ");
						}
					} else {
						count++;
					}
				}
				if (count == n) {
					System.out.println("Not match");
				} else {
					System.out.println();
				}
			}
		}
	}
	public static boolean isNumber(String val) {
		String regex = "\\A[-]?[0-9]+\\z";
		Pattern p = Pattern.compile(regex);
		Matcher m1 = p.matcher(val);
		return m1.find();
	}
}