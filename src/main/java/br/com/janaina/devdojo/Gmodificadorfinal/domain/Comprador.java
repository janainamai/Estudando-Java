package br.com.janaina.devdojo.Gmodificadorfinal.domain;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Comprador " + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
