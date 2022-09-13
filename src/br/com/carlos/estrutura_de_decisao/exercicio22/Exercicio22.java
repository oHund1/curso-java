
// Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
// Dica: utilize o operador módulo (resto da divisão).

package br.com.carlos.estrutura_de_decisao.exercicio22;

import javax.swing.*;

public class Exercicio22 {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número: ");

        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("O numero e par.");
        } else {
            System.out.println("O numero e impar.");
        }

    }
}
