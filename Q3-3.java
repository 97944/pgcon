package Q3;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		String str = scanner.next();
		int s = scanner.nextInt();
		long n = scanner.nextLong();
		int m = scanner.nextInt();
		scanner.close();

		char[] cstr = str.toCharArray();
		Arrays.sort(cstr);
		String str2 = "";

		for (int i = 0; i < str.length(); i++) {
			// System.out.print(cstr[i] + " ");
			str2 += cstr[i];
		}
		/*System.out.println(str + " " + s + " " + n + " " + m);
		System.out.println(str2);
		System.out.println(n / str2.length() + " " + n % str2.length());*/

		ArrayList<Integer> dummy3 = new ArrayList<Integer>();
		String[] z = new String[(int) m];

		for (int i = 0; i < m; i++) {

			long result = n - 1 + i;
			long dummy1 = 0;
			int dummy2 = 0;
			dummy3.clear();
			while (result > 1) {
				dummy1 = result / str2.length();
				dummy2 = (int) (result % str2.length());
				dummy3.add(dummy2);
				result = dummy1;
			}
			if((int)result !=0){
				dummy3.add((int) result);
			}


			z[i] = "";
			for (int j = dummy3.size() - 1; j >= 0; j--) {
				z[i] += str2.charAt(dummy3.get(j));
			}
			String dummy = "";
			for (int j = 0;j<s-z[i].length();j++){
				dummy += str2.charAt(0);
			}
			z[i] = dummy + z[i];
		}

		 for(int i=0;i<m;i++){
			System.out.println(z[i]);
		}
	}
}
