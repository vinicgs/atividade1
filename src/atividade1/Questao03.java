package atividade1;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
//		 Construa um algoritmo que calcula a quantidade de litros de combustível gastos em uma 
//		 viagem utilizando-se um automóvel que faz 12 Km por litro. Para realizar esse cálculo, o 
//		 usuário deverá fornecer o tempo gasto da viagem e a velocidade média durante a 
//		 mesma. O algoritmo deverá apresentar como resultado os valores da velocidade média, 
//		 tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada na 
//		 viagem.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a velocidade: ");
		double velocidade = sc.nextDouble();
		
		System.out.println("Tempo gasto em horas: ");
		double tempoGasto = sc.nextDouble();
		
		double velocidadeMedia = velocidade / tempoGasto;
		double distanciaPercorrida =  velocidade * tempoGasto;
		double quantidadeDeLitros = distanciaPercorrida / 12;
		
		System.out.println("Velocidade mèdia em Km/h: " + velocidadeMedia);
		System.out.println("Tempo gasto na viagem: " + tempoGasto + " horas");
		System.out.println("Distancia percorrida: " + distanciaPercorrida + " Km");
		System.out.println("Quantidade de litros utilizada: " + quantidadeDeLitros );
		
		sc.close();
	}
	

	

}
