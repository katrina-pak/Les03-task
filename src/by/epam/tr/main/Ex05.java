package by.epam.tr.main;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		double x = 0;
		double y = 0;
		double z;
		
		Scanner sc = new Scanner(System.in);
		
		//////////////////////////////////////////////////
		
		
		System.out.print("Введите x: ");
		while (!sc.hasNextDouble()) {
		        sc.nextLine();
		        System.out.print("Введите x: ");
		}
		
		x = sc.nextDouble();
		
		//////////////////////////////////////////
		
		System.out.print("Введите y: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите y: ");
		} 
		
		y = sc.nextDouble();
		
		/////////////////////////////////////////////
		
		double temp;
		
		temp = Math.cos(x) - x / 3; 
		
		if (temp != 0) {
			z = x * Math.log(x) + y / temp; 
		
		} else {
			System.out.println("Знаменатель равен нулю.");
			z = Double.NaN; //значение бесконечности
		}
		
		System.out.println("z= " + z);
		
		 } 

}
