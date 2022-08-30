package br.com.carlos.estrutura_de_decisao.exercicio20;

//Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
//        A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
//        A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
//        A mensagem "Aprovado com Distinção", se a média for igual a 10.

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite a primeira nota: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = leitor.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media == 10) {
            System.out.println("Aprovado com Distinção!");
            System.out.println("A media final foi de: " + media);
        } else if (media >= 7) {
            System.out.println("Aprovado!");
            System.out.println("A media final foi de: " + media);
        } else if (media < 7) {
            System.out.println("Reprovado!");
            System.out.println("A media final foi de: " + media);
        }

        leitor.close();

    }
}
