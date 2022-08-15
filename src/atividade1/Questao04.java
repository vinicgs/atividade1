package atividade1;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		
//		Solicite a quantidade de bytes que um cliente deseja comprar e informe quantos 
//		quilobytes (Kbytes) equivale esta quantidade. Tenha cuidado para descobrir,
//		exatamente, quantos bytes são um quilobyte, pois ele não corresponde a 1000 bytes
		
		Scanner sc = new Scanner(System.in);
		
		int quilobyte = 1024;
		
		System.out.println("Digite um valor em byte para comprar: ");
		double valorByte = sc.nextInt();
		
		double valorEmQuilobytes = valorByte / quilobyte;
		
		System.out.println(" ");
		System.out.printf("Valor em quilobytes é: %5f",  valorEmQuilobytes);
		
		
		
		sc.close();
	}

}
