package br.com.janaina.devdojo.Fsobrescrita.domain;

public class Serie extends Object{
    private String nome;

    @Override
    public String toString() {
        return "Série: " + this.nome;
    }


    public Serie(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
