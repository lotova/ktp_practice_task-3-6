package ktp_task3;

import java.util.Scanner;

public class ex2_8 {
//�������, ������������ ����� ������� ������������������ ����. ����� � �������� ����
static String longestZero (String code) {
	String zero = "";
	String zerobuffer = "";
	for (int i = 0; i<code.length(); i++){ //�������� �� ����
		//����
		if (code.charAt(i)=='0') {
			zero+="0";
		}
		else { //�������
			//��������� � ���������� �������
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
