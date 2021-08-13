package br.com.janaina.devdojo.ZBClassesInternas;

public class ClasseExterna {
	private String nome = "Janaina";
	private static String sobrenome = "Mai";
	
	static class InternaEstatica {
		void imprimir() {
			System.out.println(new ClasseExterna().nome);
			System.out.println(sobrenome);
		}
	}
	
	public static void main(String[] args) {
		InternaEstatica internaEstatica = new InternaEstatica();
		internaEstatica.imprimir();
	}
}
