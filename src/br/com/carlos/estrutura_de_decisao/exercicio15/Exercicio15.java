
//Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
//Dicas:
//Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes;

package br.com.carlos.estrutura_de_decisao.exercicio15;
public class Exercicio15 {
    public static void main(String[] args) {
        System.out.println(obterTipoTriangulo(7,7,7));
    }

    private static String obterTipoTriangulo(double ladoA, double ladoB, double ladoC) {
        if (isTriangulo(ladoA, ladoB, ladoC)) {
           if (ladoA == ladoB && ladoB == ladoC) {
               return "Equilatero";
           } else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
               return "Isosceles";
           } else {
               return "Escaleno";
           }
        }
        return "Nao e um triangulo.";
    }

    private static boolean isTriangulo(double ladoA, double ladoB, double ladoC) {
        if (ladoA > (ladoB + ladoC)) {
            return true;
        } else if (ladoB > (ladoC + ladoA)) {
            return true;
        } else if (ladoC > (ladoA + ladoB)) {
            return true;
        } else if (ladoA == ladoB && ladoB == ladoC) {
            return true;
        } else {
            return false;
        }
    }
}
