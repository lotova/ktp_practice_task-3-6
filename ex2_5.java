package ktp_task3;

import java.util.Scanner;

public class ex2_5 {
//определить, является ли строка допустимым 16-тиричным кодом
	static boolean isValidNexCode(String line) {
		if (line.charAt(0)!='#') {
			return false;
		}
		else {
			if (line.length()!=7) {
				return false;
			}
			else {
				//можно проверить на 16-сть
				String checkLine= line.substring(1);
				try {
					Integer.parseInt(checkLine, 16);
					return true;
				}catch (Exception e) {
					return false;
				}
			
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter line");
		System.out.println("is 16-number: "+ isValidNexCode(in.nextLine()));
		in.close();
	}

}
