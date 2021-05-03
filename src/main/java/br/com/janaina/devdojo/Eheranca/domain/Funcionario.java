package br.com.janaina.devdojo.Eheranca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário.");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 1.");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 2.");
    }


    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionário.");
    }

    public void Imprimir() {
        super.Imprimir();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
