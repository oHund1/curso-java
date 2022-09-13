
// O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
//                      Até 5 Kg           Acima de 5 Kg
//File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
//Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
//Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
//Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
// porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente
// receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de
// carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne,
// preço total, tipo de pagamento, valor do desconto e valor a pagar.

package br.com.carlos.estrutura_de_decisao.exercicio28;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");

        System.out.println("Digite um numero: ");
        int tipo = leitor.nextInt();

        System.out.println("Digite a quantidade: ");
        int quantidade = leitor.nextInt();

        System.out.println("A compra será realizada com cartao Tabajara? 1p/ SIM - 2p/ NAO: ");
        int compra = leitor.nextInt();

        if (tipo == 1) {
            String nome = "File Duplo";
            if (quantidade <= 5) {
                double preco = quantidade * 4.9;
            } else {
                double preco = quantidade * 5.8;
            }
        }

        if (tipo == 2) {
            String nome = "Alcatra";
            if (quantidade <= 5) {
                double preco = quantidade * 5.9;
            } else {
                double preco = quantidade * 6.8;
            }
        }

        if (tipo == 3) {
            String nome = "Picanha";
            if (quantidade <= 5) {
                double preco = quantidade * 6.9;
            } else {
                double preco = quantidade * 7.8;
            }
        }

        if (compra == 1) {
            String Resposta = "SIM";




        }



    }
}
