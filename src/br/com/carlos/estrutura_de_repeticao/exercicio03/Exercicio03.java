
//Faça um programa que leia e valide as seguintes informações:
//Nome: maior que 3 caracteres;
//Idade: entre 0 e 150;
//Salário: maior que zero;
//Sexo: 'f' ou 'm';
//Estado Civil: 's', 'c', 'v', 'd';

package br.com.carlos.estrutura_de_repeticao.exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    static public void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Ola!");


        System.out.print("Digite o nome: ");
        String nome = leitor.next();

        while (nome.length() < 3) {
            System.out.println("ERRO! Digite um nome com mais de 3 caracteres. ");
            System.out.print("Digite o nome: ");
            nome = leitor.next();
        }

        System.out.println("Digite a idade: ");
        int idade = leitor.nextInt();

        while (idade < 0 || idade > 150) {
            System.out.println("ERRO! Digite uma idade entre 0 e 150.");
            System.out.print("Digite a idade: ");
            idade = leitor.nextInt();
        }

        System.out.println("Digite o salário: ");
        double salario = leitor.nextDouble();

        while (salario <= 0) {
            System.out.println("ERRO! Digite um salario maior que 0.");
            System.out.print("Digite o salário: ");
            salario = leitor.nextDouble();
        }

        System.out.println("Digite o sexo: ");
        String sexo = leitor.next();

        while (sexo!= "f" || sexo!= "m") {
            System.out.println("ERRO! Digite f ou m.");
            System.out.print("Digite o sexo: ");
            sexo = leitor.nextLine();
        }

        System.out.println("Digite o estado civil: ");
        String estadoCivil = leitor.next();

        leitor.close();
    }
}
