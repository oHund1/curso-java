
//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino,
// M - Masculino, Sexo Inválido.

package br.com.carlos.estrutura_de_decisao.exercicio03;

import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite M para masculino ou F para feminino: ");

        String sexo = leitor.nextLine();
        String feminino = "F";
        String masculino = "M";

        if (sexo.equals(feminino)) {
            System.out.println("O sexo definido foi feminino.");
        } else if (sexo.equals(masculino)) {
            System.out.println("O sexo definido foi masculino.");
        } else {
            System.out.println("Sexo invalido.");
        }

        leitor.close();
    }
}

