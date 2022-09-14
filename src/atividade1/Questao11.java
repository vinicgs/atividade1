package atividade1;

import java.util.Scanner;

public class Questao11 {
    /*
     * 11. Dados três valores X, Y, Z, verificar se eles podem ser os comprimentos
     * dos lados de um
     * triângulo e, se forem, verificar se é triângulo eqüilátero, isósceles ou
     * escaleno. Se não
     * formarem triângulo, escrever uma mensagem.
     */

    public static void main(String[] args) {
        int X, Y, Z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        X = sc.nextInt();

        System.out.println("Digite um valor: ");
        Y = sc.nextInt();

        System.out.println("Digite um valor: ");
        Z = sc.nextInt();

        if ((X < Y + Z) && Y < (X + Z) && Z < (X + Z)) {
            System.out.println("Pode ser formado um triângulo, pois a medida de cada lado é menor que a soma dos outros lados");

            if (X == Y && Y == Z) {
                System.out.println("Trigângulo equilátero");
            } else if (X != Y && Y != Z) {
                System.out.println("Triângulo escaleno");
            } else {
                System.out.println("Triângulo isósceles");
            }

        } else {
            System.out.println("Não pode ser formado um triângulo");
        }
        sc.close();
    }

}
