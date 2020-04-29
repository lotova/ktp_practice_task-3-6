package ktp_task3;

import java.util.Scanner;

public class ex2_4 {
//заменить первый и последний символы строки
//если меньше двух->несовместимо, если 1=посл -> это пара
//
static String flipEdChars (String line) {
	//проверка размера строки
	if(line.length()<2){
		return "Incompatible";
	}
	//проверка зеркальности
	if(line.charAt(0) == line.charAt(line.length()-1)){
		return "Two's a pair.";
	}
	else {
	//создание нового типа для замены символов
	StringBuffer newLine = new StringBuffer(line);
	//создание вспомогательного буфера
	char buffer1=line.charAt(line.length()-1);
	char buffer2= line.charAt(0);
	//замена символов
	newLine.setCharAt(0, buffer1);
	newLine.setCharAt(line.length()-1, buffer2);
	//возврат строки
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
