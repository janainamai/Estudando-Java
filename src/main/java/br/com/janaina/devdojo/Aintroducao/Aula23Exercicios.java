package br.com.janaina.devdojo.Aintroducao;

public class Aula23Exercicios {
    public static void main(String[] args) {
        double salario = 20000;

        double taxa = (salario <= 34712) ? 9.70 : (salario > 34712 && salario <= 68507) ? 37.35 : 49.50;
        double pagamentoDeTaxa =(taxa/100) * salario;
        System.out.println("O pagamento da taxa é de: " + pagamentoDeTaxa + " euros." );

    }
}
