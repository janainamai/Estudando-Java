package br.com.janaina.devdojo.Bmodificadorestatico.domain;

public class Empresa {
    private String nome;
    private String endereco;
    private String CNPJ;
    private static int diasDeTrabalhoPorMes;
    private static String administrador;
    private static int senhaPin;

    static {
        Empresa.administrador = "admin";
        Empresa.senhaPin = 1234;
    }

    {
        Empresa.diasDeTrabalhoPorMes = 20;
    }

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void EnviarDados(String endereco, String CNPJ, int diasDeTrabalhoPorMes) {
        this.endereco = endereco;
        this.CNPJ = CNPJ;
        Empresa.diasDeTrabalhoPorMes = diasDeTrabalhoPorMes;
    }

    public void ImprimirDados() {
        System.out.println("Dados da empresa:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("CNPJ: " + this.CNPJ);
        System.out.println("Dias de trabalho por mês: " + Empresa.diasDeTrabalhoPorMes);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getDiasDeTrabalhoPorMes() {
        return Empresa.diasDeTrabalhoPorMes;
    }

    public void setDiasDeTrabalhoPorMes(int diasDeTrabalhoPorMes) {
        Empresa.diasDeTrabalhoPorMes = diasDeTrabalhoPorMes;
    }

}

