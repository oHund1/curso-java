
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

        System.out.print("Digite um numero: ");
        int carne = leitor.nextInt();

        System.out.print("Digite a quantidade em kg: ");
        int quantidade = leitor.nextInt();

        System.out.print("A compra sera realizada com cartao Tabajara? 1p/ SIM - 2p/ NAO: ");
        int pagamento = leitor.nextInt();

        double preco = obterValorTotal(carne, quantidade);

        double promocao = 0;
        double desconto = 0;

        if (pagamento == 1) {
            promocao = 0.05;
            desconto = preco * promocao;
        } else {
            promocao = 0;
            desconto = 0;
        }

        double valorFinal = preco - desconto;

        System.out.println("TIPO CARNE:     " + obterCorteCarne(carne));
        System.out.println("QUANTIDADE:     " + quantidade + " kg");
        System.out.println("TIPO PAGAMENTO: " + obterMeioPagamento(pagamento));
        System.out.println("DESCONTO:       " + desconto + " reais");
        System.out.println("VALOR TOTAL:    " + valorFinal + " reais") ;

        leitor.close();

    }

    private static double obterValorTotal(int carne, int quantidade) {

        double preco = 0;

        if (carne == 1) {

            if (quantidade <= 5) {
                preco = 4.9;
            } else {
                preco = 5.8;
            }

        } else if (carne == 2) {

            if (quantidade <= 5) {
                preco = 5.9;
            } else {
                preco = 6.8;
            }

        } else if (carne == 3) {

            if (quantidade <= 5) {
                preco = 6.9;
            } else {
                preco = 7.8;
            }

        } else {
            System.out.println("ERRO!");
        }

        return preco * quantidade;

    }

    private static String obterCorteCarne(int carne) {

        String corte = "";

        if (carne == 1) {
            corte = "File Duplo";
        } else if (carne == 2) {
            corte = "Alcatra";
        } else if (carne == 3) {
            corte = "Picanha";
        }

        return corte;

    }

    private static String obterMeioPagamento(int pagamento) {

        String formatoPagamento = "";

        if (pagamento == 1) {
            formatoPagamento = "Cartao Tabajara";
        } else {
            formatoPagamento = "Dinheiro";
        }

        return formatoPagamento;

    }



}