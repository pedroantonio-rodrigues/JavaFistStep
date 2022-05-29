package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//declaração de um array de variaveis primitivas 
		double[] vect = new double[n];
		// criação do laço for para incrementar valores no array
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		//declaração da variavel sum iniciada com 0 para fazer a soma dos valores do array
		double sum = 0.0;
		// criação do laço for para saber quantas posições tem o array 
		for (int i = 0; i < n; i++) {
			//somas do valores do array posição por posição
			sum += vect[i];
		}
		// criação da variavel avg que recebe os valores de sum dividido n 
		double avg = sum / n;
		//mostra para o usuario o valor da media das alturas contidas no array
		System.out.printf("AVERENGE HEIGTH : %.2f%n", avg);
		
		sc.close();
	}
}
