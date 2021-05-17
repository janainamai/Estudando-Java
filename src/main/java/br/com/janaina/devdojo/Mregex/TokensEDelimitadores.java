package br.com.janaina.devdojo.Mregex;

public class TokensEDelimitadores {
	public static void main(String[] args) {
		// Token: resultados obtidos pelos delimitadores
		// Delimitadores: impoem um intervalo

		String texto = "Janaina, Heloísa, Vicky";
		String[] nomes = texto.split(",");

		for (String nome : nomes) {
			System.out.println(nome.trim());
		}
	}
}
