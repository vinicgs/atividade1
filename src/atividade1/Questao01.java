package atividade1;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		//1. Crie um programa que leia dois valores e efetue a troca dos mesmos.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Numero 2: ");
		int numero2 = sc.nextInt();
		
		int aux = numero2;		
		numero2 = numero1;
		numero1 = aux;
		
		System.out.println("Numeros trocados: "+  numero1 + " " + numero2);
		
		sc.close();
	}

}
