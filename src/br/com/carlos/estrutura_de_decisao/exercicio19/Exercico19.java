
//Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas,
// dezenas e unidades do mesmo.
//Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
//326 = 3 centenas, 2 dezenas e 6 unidades
//12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16

package br.com.carlos.estrutura_de_decisao.exercicio19;

import java.util.Scanner;

public class Exercico19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite um numero inteiro menor que 1000: ");
        int n1 = leitor.nextInt();

        int numero = n1;
        int unidade = n1 % 10;
        n1 = (n1 - unidade)/10;
        int dezena = n1 % 10;
        n1 = (n1 - dezena)/10;
        int centena = n1;

        System.out.println(numero + " = " + centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades.");

        leitor.close();

    }

}
