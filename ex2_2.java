package ktp_task3;

import java.util.Scanner;

public class ex2_2 {
//�������, ������������ ������� ������� ��������� "zip"/���� -1 ���� �� 2� ��� 1 ���������
//������� �����

	static int findZip(String line) {	
			//��������� ������� ��������� zip, ���������� ������� ������� � ��������� ���������(����� zip)
			int beginIndex = line.indexOf("zip");
			if (beginIndex != -1) {
			String newCheckLine = line.substring(beginIndex+1);
			//��������� ����� ������ zip
			 int second_beginIndex = newCheckLine.indexOf("zip");
			 if (second_beginIndex!= -1) {
				 return second_beginIndex+beginIndex+1;
			 }
			 else {
				 return -1;
			 }
			}
			else {
				return -1;
			}
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter line for search");
	    System.out.println("index of second "+ findZip(in.nextLine()));	 
	    in.close();
	}

}
