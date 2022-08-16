package br.com.carlos.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite a nota referente ao primeiro bimestre: ");
        int n1 = leitor.nextInt();

        System.out.print("Digite a nota referente ao segundo bimestre: ");
        int n2 = leitor.nextInt();

        System.out.print("Digite a nota referente ao terceiro bimestre: ");
        int n3 = leitor.nextInt();

        System.out.print("Digite a nota referente ao quarto bimestre: ");
        int n4 = leitor.nextInt();

        double media = (n1 + n2 + n3 + n4)/4.0;

        System.out.println("A media bimestral foi de: " + media);

        leitor.close();
    }
}
