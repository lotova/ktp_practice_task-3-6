package ktp_task3;

import java.util.Scanner;

public class ex2_9 {

//функция, возвращающая следующее простое
	static boolean isPrime (int n) {
		for(int i=2; i<n; i++) {
			if( n%i == 0) {
				return false;
			}		
		}
		return true;
	}
	static int  nextPrime (int n) {
		while (isPrime(n)==false) {
			n++;
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter number ");
		System.out.print("next Prime number: " + nextPrime(in.nextInt()));
	in.close();
	}

}
