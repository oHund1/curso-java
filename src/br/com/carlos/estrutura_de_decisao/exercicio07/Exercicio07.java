
//Faça um Programa que leia três números e mostre o maior e o menor deles.

package br.com.carlos.estrutura_de_decisao.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite outro numero: ");
        double n2 = leitor.nextDouble();

        System.out.print("Digite mais um numero: ");
        double n3 = leitor.nextDouble();

        if (n1 > n2 && n1 > n3) {
            System.out.print("O maior numero e: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.print("O maior numero e: " + n2);
        } else if (n3>n1 && n3>n2) {
            System.out.print("O maior numero e: " + n3);
        } else {
            System.out.println("Valores invalidos!");
        }

        System.out.println("");

        if (n1 < n2 && n1 < n3) {
            System.out.println("O menor numero e: " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("O menor numero e: " + n2);
        } else if (n3 < n1 && n3 < n2) {
            System.out.println("O menor numero e: " + n3);
        } else {
            System.out.println("Valores invalidos!");
        }

        leitor.close();

    }
}










