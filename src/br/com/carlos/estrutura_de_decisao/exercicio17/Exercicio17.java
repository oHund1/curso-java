
//Faça um Programa que peça um número correspondente a um determinado ano e
// em seguida informe se este ano é ou não bissexto.

package br.com.carlos.estrutura_de_decisao.exercicio17;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite o ano: ");
        int ano = leitor.nextInt();

        if (ano % 4 == 0 ) {
            System.out.println("O ano digitado e bissexto.");
        } else {
            System.out.println("O ano digitado nao e bissexto.");
        }

        leitor.close();

    }
}
