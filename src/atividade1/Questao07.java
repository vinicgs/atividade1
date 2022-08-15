package atividade1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {

		// Tem-se um conjunto de dados de um grupo de pessoas, serão coletados a altura
		// e o
		// sexo (1- masculino, 2 - feminino). O final do conjunto é determinado quando
		// for
		// informada uma altura menor ou igual a zeros. Imprima:
		// a) a maior e a menor altura do grupo;
		// c) o número de homens;
		// d) a média de altura das mulheres;
		// e) o percentual de mulheres abaixo de 1,68.
		Scanner sc = new Scanner(System.in);

		List<Double> Homens = new ArrayList<>();
		List<Double> Mulheres = new ArrayList<>();

		double alturaEntrada, somaAlturaMulheres = 0, menor = 0, maior = 0;
		int sexoEntrada, mulheresMenores = 0;
		int numeroHomens = 0;

		while (true) {
			System.out.println("Digite a altura: ");
			alturaEntrada = sc.nextDouble();
			if (alturaEntrada == 0)
				break;

			System.out.println("Digite o sexo (1 - Masculino, 2 - Feminino): ");
			sexoEntrada = sc.nextInt();

			if (sexoEntrada == 1) {
				Homens.add(alturaEntrada);
			} else if (sexoEntrada == 2) {
				somaAlturaMulheres += alturaEntrada;

				Mulheres.add(alturaEntrada);
				if (alturaEntrada < 168) {
					mulheresMenores++;
				}
			}

			if (alturaEntrada > maior) {
				maior = alturaEntrada;
				if (menor == 0) {
					menor = alturaEntrada; // pegar o menor número pela primeira vez
				}
			} else if (alturaEntrada < maior && alturaEntrada < menor && menor != 0) {
				menor = alturaEntrada;
			}

		}

		numeroHomens = Homens.size();
		double percentualDeMulheres = (double) mulheresMenores * 100 / Mulheres.size();
		double mediaAlturaMulheres = somaAlturaMulheres / Mulheres.size();

		System.out.printf("Maior altura: %.2f\n", maior);
		System.out.printf(" menor altura: %.2f\n", menor);

		System.out.println("Numero de homens :" + numeroHomens);
		System.out.printf("Media de altura das mulheres: %.2f\n", mediaAlturaMulheres);
		System.out.printf("Percentual de mulheres a baixo de 1,68: %.2f\n", percentualDeMulheres);
		sc.close();
	}

}
