package ktp_task3;

import java.util.Scanner;

public class ex2_7 {
//функция, проверяющая является ли число числом Капрекала
	static boolean isKaprekar (int n) {
		if (n<0) {
			return false;
		}
		else {
			String n2 = Integer.toString(n*n);
			String left = n2.substring(0, (n2.length()/2));
			String right = n2.substring(n2.length()/2);
			int sum = Integer.parseInt(left)+Integer.parseInt(right);
			if (sum == n) {
				return true;
			} else return false;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number");
		System.out.print("is Kaprekar: " + isKaprekar(in.nextInt()));
		in.close();
	}

}
