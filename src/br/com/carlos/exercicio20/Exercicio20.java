package br.com.carlos.exercicio20;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero inteiro: ");
        double n1 = leitor.nextDouble();

        if (n1 > 0) {
            System.out.println("O numero real " + n1 + " e positivo.");}
        else {
            System.out.println("O numero real " + n1 + " e negativo.");}

            leitor.close();

    }
}
