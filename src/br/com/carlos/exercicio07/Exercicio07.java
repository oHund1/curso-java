package br.com.carlos.exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola");
        System.out.print("Digite a medida do lado do quadrado: ");
        double lado = leitor.nextDouble();
        double area = lado * lado;
        double dobro = area * 2;

        System.out.println("Area do quadrado e: " + area);
        System.out.println("O dobro da area e: " + dobro);


    }
}
