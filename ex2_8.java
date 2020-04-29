package ktp_task3;

import java.util.Scanner;

public class ex2_8 {
//функция, возвращающая самую длинную последовательность посл. нулей в двоичном коде
static String longestZero (String code) {
	String zero = "";
	String zerobuffer = "";
	for (int i = 0; i<code.length(); i++){ //проходка по коду
		//ноль
		if (code.charAt(i)=='0') {
			zero+="0";
		}
		else { //единица
			//сравнение с предыдущим буфером
			if (zero.length()>zerobuffer.length()) {
				zerobuffer = zero;				
			}
			zero = "";
		}
	}
	return zerobuffer;
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter code");
		System.out.println("longestZero: "+ longestZero(in.nextLine()));
		in.close();
	}

}
