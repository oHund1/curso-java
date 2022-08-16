package br.com.carlos.exercicio19;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero: ");
        int n1 = leitor.nextInt();

        System.out.print("Digite outro numero: ");
        int n2 = leitor.nextInt();

        if (n1 > n2)
                 { System.out.println("O maior numero e " + n1);}
            else
                     {System.out.println("O maior numero e " + n2); }

        leitor.close();
    }
}
