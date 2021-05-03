package br.com.janaina.devdojo.Bmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
    private static int[] pneus;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void Imprimir() {
        System.out.println("----------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
        System.out.println("Quantidade de pneus: " + Carro.pneus.length);

    }

    public static int[] getQuantidadeDePneus() {
        return pneus;
    }

    public static void setQuantidadeDePneus(int[] quantidadeDePneus) {
        Carro.pneus = quantidadeDePneus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
      Carro.velocidadeLimite = velocidadeLimite;
    }
}
