package by.epam.tr.main;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		int i;
		Scanner conin = new Scanner(System.in);

		System.out.print("Enter integer: ");
		while (!conin.hasNextInt()) {
			conin.nextLine();
			System.out.print("Enter integer: ");
		}
			
			i = conin.nextInt();
			System.out.println("i=" + i);

		}

	}

