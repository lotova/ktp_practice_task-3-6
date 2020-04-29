package ktp_task3;

import java.util.Scanner;

public class ex2_3 {
//Создайте функцию, которая проверяет, является ли целое число совершенным

static boolean checkPerfect(int number) {
	int SumFactor = 1;
	for (int i=2;i<number;i++) {
		if (number%i==0) {
			SumFactor+=i;
		}
	}
	if (SumFactor==number) {
		return true;
	}
	else {
		return false;
	}
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter numder");
		System.out.println("Is number Perfect: "+checkPerfect(in.nextInt()));
		in.close();
	}

}
