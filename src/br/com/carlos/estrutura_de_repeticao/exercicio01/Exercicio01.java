
//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue
// pedindo até que o usuário informe um valor válido.

package br.com.carlos.estrutura_de_repeticao.exercicio01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero de 0 a 10: ");
        float nota = leitor.nextFloat();

        while (nota > 10 || nota < 0) {
            System.out.print("Digite um numero de 0 a 10: ");
           nota = leitor.nextFloat();
        }
    }
}
