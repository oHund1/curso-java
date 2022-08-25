package br.com.carlos.estrutura_de_decisao.exercicio08;

//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite M para Matutino, V para Vespertino ou N para Noturno: ");
        String periodo = leitor.nextLine().toUpperCase();
        String matutino = "M";
        String verspertino = "V";
        String noturno = "N";

        if (periodo.equals(matutino)) {
            System.out.println("Bom Dia!");
        } else if (periodo.equals(verspertino)) {
            System.out.println("Boa Tarde!");
        } else if (periodo.equals(noturno)) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Invalido!");
        }

        leitor.close();

    }
}
