package ktp_task3;

import java.util.Scanner;

public class ex2_1 {

	//функция, находящая количество решений ур-я ax^2+bx+c=0
	static int solutions(int a, int b, int c) {
		int count_solutions=0;
		int D = b*b - 4*a*c;
		if (D==0) {
			count_solutions= 1;
		}
		else {
			if (D<0) {
				count_solutions= 0;
			}
			if (D>0) {
				count_solutions = 2;
			}
		}
		return count_solutions;
}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter parametrs of eguation");
		System.out.println("count of solution: "+ solutions(in.nextInt(), in.nextInt(), in.nextInt()));
		in.close();
	}

}
