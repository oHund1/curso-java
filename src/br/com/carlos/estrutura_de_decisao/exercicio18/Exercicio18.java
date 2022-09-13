
//Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.

package br.com.carlos.estrutura_de_decisao.exercicio18;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero para DIA: ");
        int dia = leitor.nextInt();

        System.out.print("Digite um numero para MES: ");
        int mes = leitor.nextInt();

        System.out.print("Digite um numero para ANO:");
        int ano = leitor.nextInt();

        if (dia > 31 && mes > 12) {
            System.out.println("A data informada e invalida.");
        } else {
            System.out.println("A data informada foi: " + dia + "/" + mes + "/" + ano);
        }

        leitor.close();

    }
}
