package br.com.janaina.devdojo.Iexcecoes.tryWithResources;

import java.io.IOException;

public class Console {
	public static void main(String[] args) {
		lerArquivo();
	}

	public static void lerArquivo() {
		try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
