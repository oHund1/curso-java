
//Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que
// a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva
// o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as
// taxas de crescimento.

package br.com.carlos.estrutura_de_repeticao.exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");

        int paisA = 80000;
        int paisB = 200000;
        int anos = 0;

        while ( paisA <= paisB) {
            paisA += paisA * 0.03;
            paisB += paisB * 0.015;
            anos += 1;
        }

        System.out.println("O pais A ultrapassa o pais B em " + anos +" anos");

        leitor.close();
    }
}
