package br.com.janaina.devdojo.Cassociacao.domain;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void Imprimir() {
        System.out.println("Jogador: " + this.nome);
        if(this.time != null)
        System.out.println("Time: " + this.time.getNome());
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
