package br.com.janaina.devdojo.Cassociacao.test;

import br.com.janaina.devdojo.Cassociacao.domain.Jogador;
import br.com.janaina.devdojo.Cassociacao.domain.Time;

public class test02Jogador {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Janaina");
        Time time1 = new Time("Vermelho");

        jogador1.setTime(time1);

        jogador1.Imprimir();
    }
}
