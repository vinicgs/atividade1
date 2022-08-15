package atividade1;

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {

//	Calcular a quantidade de dinheiro gasto por um fumante. Dados: o número de anos que 
//	ele fuma, o nº de cigarros fumados por dia e o preço de uma carteira.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite há anos você fuma: ");
        int anosFumando = sc.nextInt();

        System.out.println("Cigarros fumados por dia");
        int cigarrosFumadosPorDia = sc.nextInt();

        System.out.println("Preço de cada carteira: ");
        double precoDaCarteira = sc.nextDouble();

        int cigarrosNaCarteira = 20;
        int quantidadeDeCigarros = (cigarrosFumadosPorDia * 365 * anosFumando);

        double dinheiroGastoEmCigarros = quantidadeDeCigarros
                / cigarrosNaCarteira * precoDaCarteira;

        System.out.println("Você gastou " + dinheiroGastoEmCigarros
                + " Reais em cigarros, durante " + anosFumando + " anos");

        sc.close();
    }

}