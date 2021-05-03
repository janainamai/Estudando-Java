package br.com.janaina.devdojo.Aintroducao;


public class Aula14Operadores {
    public static void main(String[] args) {

        int numberOne = 5;
        int numberTwo = 10;

        //operadores aritméticos - + * /
        double soma = numberOne + numberTwo;
        double subtracao = numberOne - numberTwo;
        double multiplicacao = numberOne * numberTwo;
        double divisao = numberOne / (double)numberTwo;

        //operadores relacionais % < > <= >= == !=
        int rest = 10 % 5;
        boolean isDezMaiorDoQueVinte = 10 > 20;
        boolean isDezmenorDoQueVinte = 10 < 20;
        boolean isDezIgualinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;

        /*operadores lógicos
         && (and)
         || (or)
         ! not)
         */

        //operadores de atribuição = += -= *= %= ++
        double bonus = 1000; //bonus 1000
        bonus += 100; //bonus 1100
        bonus -= 50; //bonus 1050
        bonus *= 2; //bonus 2100
        bonus++; //bonus 2102
        bonus--; //bonus 2100
    }
}
