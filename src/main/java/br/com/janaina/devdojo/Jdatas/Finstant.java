package br.com.janaina.devdojo.Jdatas;

import java.time.Instant;

public class Finstant {
	public static void main(String[] args) {
		// possui zulu time, que significa horário neutro no mundo
		
		// objeto imutável, ou seja: alterações nesse objeto gerará uma nova instância
		
		// utilizado quando salvamos data no banco de dados, assim podemos salvar o
		// horário em qualquer lugar, bastando converter no momento em que utilizar em
		// determinada zona/região
		
		Instant now = Instant.now();
		now.getNano(); // representa o nano segundo do segundo, no máximo isso: 999.999.999
	}

}
