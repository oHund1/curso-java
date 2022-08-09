package br.com.carlos.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite a nota referente ao primeiro bimestre: ");
        int n1 = Integer.parseInt(leitor.nextLine());

        System.out.print("Digite a nota referente ao segundo bimestre: ");
        int n2 = Integer.parseInt(leitor.nextLine());

        System.out.print("Digite a nota referente ao terceiro bimestre: ");
        int n3 = Integer.parseInt(leitor.nextLine());

        System.out.print("Digite a nota referente ao quarto bimestre: ");
        int n4 = Integer.parseInt(leitor.nextLine());

        int media = (n1 + n2 + n3 + n4)/4;

        System.out.println("A media bimestral foi de: " + media);
    }
}
