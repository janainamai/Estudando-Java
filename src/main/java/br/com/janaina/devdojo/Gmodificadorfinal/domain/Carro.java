package br.com.janaina.devdojo.Gmodificadorfinal.domain;

public final class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void Imprimir() {
        System.out.println("Nome: " + this.nome);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
