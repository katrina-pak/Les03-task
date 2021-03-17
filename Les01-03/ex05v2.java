package by.epam.tr.main;

import java.util.Scanner;

public class ex05v2 {

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

		if (x < 0) {
			System.out.println("Некорректные данные для вычислений");
			return;
		}
		double temp;

		temp = Math.cos(x) - x / 3;

		if (temp == 0) {
			System.out.println("Знаменатель равен нулю.");
			return;
		}

		z = x * Math.log(x) + y / temp;
		System.out.println("z= " + z);

	}

}