
//Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
// Valide a entrada e permita repetir a operação.

package br.com.carlos.estrutura_de_repeticao.exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite a populacao do pais A: ");
        int paisA = leitor.nextInt();

        System.out.print("Digite a taxa de crescimento do pais A: ");
        double taxaPaisA = leitor.nextDouble();

        System.out.print("Digite a populacao do pais B: ");
        int paisB = leitor.nextInt();

        System.out.print("Digite a taxa de crescimento do pais B: ");
        double taxaPaisB = leitor.nextDouble() ;

        int anos = 0;

        while ( paisA <= paisB) {
            paisA += paisA * taxaPaisA;
            paisB += paisB * taxaPaisB;
            anos += 1;
        }

        System.out.println("O pais A ultrapassa o pais B em " + anos +" anos");

        leitor.close();
    }
}
