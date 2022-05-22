package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employe;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employe employe = new Employe();
		System.out.println("Enter name of employee: ");
		employe.name = sc.next();
		System.out.println("Enter gross salary: ");
		employe.grossSalary = sc.nextDouble();
		System.out.println("Enter with tax of salary: ");
		employe.tax = sc.nextDouble();

		System.out.println(employe);

		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		employe.increaseSalary(percentage);
		System.out.println("");
		System.out.println("Update Salary " + employe);

		sc.close();
	}
}
