package by.epam.tr.main;

import java.util.Scanner;

public class Task13a {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double result;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите a: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите a: ");
		}

		a = sc.nextDouble();

		System.out.print("Введите b: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите b: ");
		}

		b = sc.nextDouble();

		System.out.print("Введите c: ");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите c: ");
		}

		c = sc.nextDouble();

		/////////////////////////////////////

		if (a == 0) {
			System.out.println("Знаменатель равен нулю");
			return;
		}

		result = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + b;
		System.out.println("Результат= " + result);

	}

}
