package ktp_task3;

import java.util.Scanner;

public class ex2_10 {
static boolean rightTriagle(int x, int y, int z) {
	if ((x == 0)||(y==0)||(z==0)) {
		return false;
	}
	if((x*x + y*y == z*z)||(z*z + x*x == y*y)||(y*y+ z*z == x*x)) {
		return true;
	} else return false;
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter lines og triagle");
		System.out.println("is triagle right: "+ rightTriagle(in.nextInt(),in.nextInt(),in.nextInt()));
		in.close();
	}

}
