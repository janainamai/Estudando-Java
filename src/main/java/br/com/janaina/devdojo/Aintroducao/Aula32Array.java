package br.com.janaina.devdojo.Aintroducao;

public class Aula32Array {
    public static void main(String[] args) {
        //este array possue 3 espaços em memória
        int[] idades = new int[3];

        idades[0] = 21;
        idades[1] = 20;
        idades[2] = 1;

        System.out.println("A Janaina tem " + idades[0] + " anos e a Heloísa tem " + idades[1] + " anos. Elas namoram a " + idades[2] + " ano.");

    }
}
