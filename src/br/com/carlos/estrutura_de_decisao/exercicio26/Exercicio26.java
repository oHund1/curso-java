
//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//Álcool:
//até 20 litros, desconto de 3% por litro
//acima de 20 litros, desconto de 5% por litro
//Gasolina:
//até 20 litros, desconto de 4% por litro
//acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o número de litros vendidos,
// o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago
// pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.

package br.com.carlos.estrutura_de_decisao.exercicio26;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.print("Digite quantos litros voce deseja abastecer: ");
        double litros = leitor.nextDouble();
        leitor.nextLine();

        System.out.print("Digite A para alcool ou G para gasolina: ");
        String combustivel = leitor.nextLine();

        double preco = calcularPrecoFinal(combustivel, litros);

        System.out.println("O preco a pagar e: " + preco);

        leitor.close();

    }

    private static double calcularPrecoFinal(String combustivel, double litros) {

        double desconto = 0;
        double preco = 0;

        if (combustivel.equals("A")) {
            preco = litros * 1.9;

            if (litros <= 20) {
                desconto = preco * 3 / 100;
            } else {
                desconto = preco * 5 / 100;
            }
        } else if (combustivel.equals("G")) {
            preco = litros * 2.5;

            if (litros <= 20) {
                desconto = preco * 4 / 100;
            } else {
                desconto = preco * 6 / 100;
            }
        }

        return preco - desconto;

    }
}
