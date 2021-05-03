package br.com.janaina.devdojo.Cassociacao.test;

import br.com.janaina.devdojo.Cassociacao.domain.Jogador;
import br.com.janaina.devdojo.Cassociacao.domain.Time;

public class test04Time {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Alan");
        Jogador jogador2 = new Jogador("Adilson");
        Jogador jogador3 = new Jogador("Carlos");
        Jogador jogador4 = new Jogador("Matheus");
        Jogador jogador5 = new Jogador("Arthur");

        Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4, jogador5};

        Time time = new Time("Juvenal Carvalho", jogadores);
        for(Jogador jogador : jogadores) {
            jogador.setTime(time);
            jogador.Imprimir();
            System.out.println();
        }
    }
}
