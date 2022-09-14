package atividade1;

import java.util.Scanner;

public class Questao10 {
    /*
     * 10. Você sabe o que são números Pitagóricos?
     * São os inteiros que cumprem a equação de Pitágoras a² + b² = c². Por exemplo:
     * 3, 4 e 5.
     * Elabore um algoritmo que dado 3 números quaisquer informe se eles são
     * pitagóricos.
     */

    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        a = sc.nextInt();

        System.out.println("Digite um numero:");
        b = sc.nextInt();

        System.out.println("Digite um numero:");
        c = sc.nextInt();

        if ((a * a) + (b * b) == c * c) {
            System.out.println(a + b + c + " São número pitagóricos");
        } else {
            System.out.println(a + b + c + " Não são números pitagóricos");
        }
        sc.close();
    }

}
