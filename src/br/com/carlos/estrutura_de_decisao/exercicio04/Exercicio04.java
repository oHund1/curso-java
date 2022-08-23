package br.com.carlos.estrutura_de_decisao.exercicio04;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite uma letra: ");
        String letra = leitor.nextLine().toLowerCase();
        String vogais = "aeiou";
        String consoante = "bcdfghjklmnpqrstvwxyz";

        if (vogais.contains(letra)) {
            System.out.println("A letra " + letra + " e uma vogal.");
        } else if (consoante.contains(letra)){
            System.out.println("A letra " + letra +  " e uma consoante.");
        } else {
            System.out.println( letra + " nao e uma letra");
        }

        leitor.close();
    }

}

