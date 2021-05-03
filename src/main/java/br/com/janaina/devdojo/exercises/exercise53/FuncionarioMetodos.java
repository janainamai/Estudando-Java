package br.com.janaina.devdojo.exercises.exercise53;

public class FuncionarioMetodos {
    public void ImprimirDados(Funcionario f) {
        System.out.println("Nome: " + f.nome + "\nIdade: " + f.idade);
        System.out.print("Salários: " );
        for(double valor : f.salarios) {
            System.out.print(valor + " ");
        }

        ImprimirResultado(f.salarios);
    }

    private void ImprimirResultado(double[] salarios) {
        double salarioTotal = 0;
        double totalSalarios = 0;
        for (double valor : salarios) {
            salarioTotal += valor;
            totalSalarios ++;
        }
        double mediaSalarial = (salarioTotal / totalSalarios);
        System.out.println("\nMédia salarial: " + String.format("%.2f", mediaSalarial));
    }
}
