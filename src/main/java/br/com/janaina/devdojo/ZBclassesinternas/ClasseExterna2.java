package br.com.janaina.devdojo.ZBclassesinternas;

public class ClasseExterna2 {
	private String nome = "Janaina";
	
	void metodo() {
		final String sobrenome = "Mai";
		
		class ClasseLocal {
			public void metodoLocal() {
				System.out.println(nome);
				System.out.println(sobrenome);
			}
		}
		
		ClasseLocal classeLocal = new ClasseLocal();
		classeLocal.metodoLocal();
	}
	
	public static void main(String[] args) {
		ClasseExterna2 classeExterna = new ClasseExterna2();
		classeExterna.metodo();
	}
}
