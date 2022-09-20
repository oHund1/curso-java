
//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
// mostrando uma mensagem de erro e voltando a pedir as informações.

package br.com.carlos.estrutura_de_repeticao.exercicio02;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola! Faca seu cadastro. ");
        System.out.print("Digite um usuario: ");
        String user = leitor.next();

        System.out.print("Digite uma senha: ");
        String pass = leitor.next();

        while (Objects.equals(user, pass)) {
            System.out.println("ERRO! Digite uma senha diferente do usuario. ");

            System.out.print("Digite um usuario: ");
            user = leitor.next();

            System.out.print("Digite uma senha: ");
            pass = leitor.next();
        }

        leitor.close();

    }
}
