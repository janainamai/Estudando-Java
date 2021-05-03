package br.com.janaina.devdojo.Dleituraconsole;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Este programa possui todas as respostas!");
        System.out.println("Digite sua pergunta que eu direi SIM ou NÃO.");
        String pergunta = input.nextLine();

        if(pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        }
        else {
            System.out.println("NÃO");
        }
    }
}
