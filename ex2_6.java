package ktp_task3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2_6 {
//проверка, имеют ли два массива одинаковое кол-воникальныз элементов
	static boolean isSame(List<Integer> mass1, List<Integer> mass2) {
		if(countUnique(mass1) == countUnique(mass2)) {
			return true;
		} 
		else return false;
	}
//функция, считающая колиество никальных элементов	
	static int countUnique(List<Integer> elements) {
		ArrayList <Integer> check = new ArrayList<Integer>();
		for(int i=0; i<elements.size(); i++) {
			if (check.contains(elements.get(i))) {
				
			}
			else {
				check.add(elements.get(i));
			}
		}
		return check.size();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter two lists");
		//считываем строку 2 4 5, 5 7 8
		String str = in.nextLine();
		//разделяем на две строки [2 4 6] [5 7 8]
		String[] mass = str.split(",");
		//получаем строковые массивы [2],[4],[6] и [5],[7],[8]
		String [] first_mass = mass[0].split(" ");
		String [] second_mass = mass[1].split(" ");
		//получаем интовый список парсированием 
		ArrayList <Integer> mass1 = new ArrayList<Integer>();
		ArrayList <Integer> mass2 = new ArrayList<Integer>();
		
		for(int i =0; i< first_mass.length;i++) {
			mass1.add(Integer.parseInt(first_mass[i]));
		}
		for(int i =0; i< second_mass.length;i++) {
			mass2.add(Integer.parseInt(second_mass[i]));
		}
		System.out.println(mass1);
		System.out.println(mass2);
		//выполняем проверку
		System.out.println("is Same: "+ isSame(mass1, mass2));
	}

}
