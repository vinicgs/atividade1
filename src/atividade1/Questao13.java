package atividade1;

import java.util.Scanner;

public class Questao13 {
    /*
     * . Crie um programa em c que leia dois valores inteiros e um valor char. O
     * valor char pode
     * ser +, -, x, /
     * De acordo a operação escolhida deve ser efetuado o cálculo e escrito o
     * resultado.
     * (Utilize estrutura de múltipla escolha)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        char op;
        System.out.println("Digite dois números:");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Digite a operação:");
        op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':
                System.out.printf("%.2f", (double) a / b);
                break;
            case '*':
                System.out.println(a * b);
                break;
        }
        sc.close();
    }

}
