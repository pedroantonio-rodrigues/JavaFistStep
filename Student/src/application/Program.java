package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Students students = new Students();
		System.out.println("Enter name of Student: ");
		students.nome = sc.nextLine();
		System.out.println("Enter grade one: ");
		students.grade1 = sc.nextDouble();
		System.out.println("Enter grade two: ");
		students.grade2 = sc.nextDouble();
		System.out.println("Enter grade tree: ");
		students.grade3 = sc.nextDouble();
		System.out.println("");
		System.out.println(students);

		sc.close();
	}

}
