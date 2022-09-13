//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por
// aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.

package br.com.carlos.estrutura_de_decisao.exercicio05;

import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite a primeira nota: ");
        int n1 = leitor.nextInt();

        System.out.print("Digite a segunda nota: ");
        int n2 = leitor.nextInt();

        double media = (n1 + n2) / 2;
        if (media == 10) {
            System.out.println("Voce foi aprovado com distincao.");
        } else if (media >= 7) {
            System.out.println("Voce foi aprovado.");
        } else {
            System.out.println("Voce foi reprovado.");
        }
        leitor.close();
    }
}


