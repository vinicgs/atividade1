package atividade1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
//		 Elabore um programa que lê 5 valores, um de cada vez, e conta quantos destes valores 
//		 são negativos, quantos são positivos e quantos são zero, escrevendo esta informação.
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer>maiorQueZero = new ArrayList<>();
		List<Integer>menorQueZero = new ArrayList<>();
		List<Integer>zero = new ArrayList<>();

		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "o numero");
			int numero = sc.nextInt();
			if (numero > 0) {
				maiorQueZero.add(numero);
			}else if ( numero < 0) {
				menorQueZero.add(numero);
			}else {
				zero.add(numero);
			}
			
		}
		System.out.println(" Numeros maiores que 0: "+ maiorQueZero );
		System.out.println(" Numeros menores que 0: " + menorQueZero);
		System.out.println(" Numeros 0: " + zero.size());
		
		sc.close();
	}

}
