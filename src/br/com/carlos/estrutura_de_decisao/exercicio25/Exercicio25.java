
//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//        "Telefonou para a vítima?"
//        "Esteve no local do crime?"
//        "Mora perto da vítima?"
//        "Devia para a vítima?"
//        "Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação
//        da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como
//        "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como
//        "Inocente".


package br.com.carlos.estrutura_de_decisao.exercicio25;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {

        System.out.println("Ola!");

        int positivos = perguntar("Telefonou para a vítima?") ? 1 : 0;

        positivos += perguntar("Esteve no local do crime?") ? 1 : 0;

        positivos += perguntar("Mora perto da vítima?") ? 1 : 0;

        positivos += perguntar("Devia para a vítima?") ? 1 : 0;

        positivos += perguntar("Já trabalhou com a vítima?") ? 1 : 0;

        if (positivos == 2) {
            System.out.println("Suspeito!");
        } else if (positivos == 3 || positivos == 4) {
            System.out.println("Cumplice!");
        } else if (positivos == 5) {
            System.out.println("Assassino!!");
        } else {
            System.out.println("Inocente.");
        }

    }

    private static boolean perguntar(String pergunta ) {
        Scanner leitor = new Scanner(System.in);

        System.out.print(pergunta);
        String resposta = leitor.nextLine();

        return resposta.equals("sim");

    }

}
