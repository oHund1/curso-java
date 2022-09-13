
//Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
// e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
//        Média de Aproveitamento  Conceito
//        Entre 9.0 e 10.0        A
//        Entre 7.5 e 9.0         B
//        Entre 6.0 e 7.5         C
//        Entre 4.0 e 6.0         D
//        Entre 4.0 e zero        E
//        O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se
//        o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.

package br.com.carlos.estrutura_de_decisao.exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void  main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite a primeira nota: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = leitor.nextDouble();

        double media = (n1 + n2) / 2;
        String conceito = obterConceito(media);

        if (media > 6) {
            System.out.println("O aluno foi APROVADO com o conceito de " + conceito);
        } else {
            System.out.println("O aluno foi REPROVADO com conceito de " + conceito);
        }

        leitor.close();

    }

    private static String obterConceito(double media) {

        if (media > 9.0 && media <= 10.0){
            return "A";
        } else if (media > 7.5 && media <= 9.0) {
           return  "B";
        } else if (media > 6.0 && media <= 7.5) {
            return "C";
        } else if (media > 4.0 && media <= 6.0) {
            return "D";
        } else {
            return "E";
        }

    }
}
