package ktp_task3;

import java.util.Scanner;

public class ex2_4 {
//�������� ������ � ��������� ������� ������
//���� ������ ����->������������, ���� 1=���� -> ��� ����
//
static String flipEdChars (String line) {
	//�������� ������� ������
	if(line.length()<2){
		return "Incompatible";
	}
	//�������� ������������
	if(line.charAt(0) == line.charAt(line.length()-1)){
		return "Two's a pair.";
	}
	else {
	//�������� ������ ���� ��� ������ ��������
	StringBuffer newLine = new StringBuffer(line);
	//�������� ���������������� ������
	char buffer1=line.charAt(line.length()-1);
	char buffer2= line.charAt(0);
	//������ ��������
	newLine.setCharAt(0, buffer1);
	newLine.setCharAt(line.length()-1, buffer2);
	//������� ������
	line = newLine.toString();
	return line;
	}
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter string");
		System.out.println(flipEdChars(in.nextLine()));
		in.close();

	}

}
