package atividade1;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		//2. Crie um programa que leia dois valores e escreva o resultado da multiplicação.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		double numero1 = sc.nextInt();
		
		System.out.println("Numero 2: ");
		double numero2 = sc.nextInt();
		
		double resultado = numero1 * numero2;
		
		System.out.println(numero1 + " multiplicado por " + numero2 + " = " + resultado );
		
		
		sc.close();
	}

}
