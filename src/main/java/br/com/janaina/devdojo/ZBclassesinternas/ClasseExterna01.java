package br.com.janaina.devdojo.ZBclassesinternas;

public class ClasseExterna01 {
	private String nome = "Janaina Mai";
	
	class ClasseInterna {
		public void imprimirNome() {
			System.out.println(nome);
			System.out.println(this);
			System.out.println(ClasseExterna01.this.nome);
		}
	}
	
	public static void main(String[] args) {
		ClasseInterna classeInterna = new ClasseExterna01().new ClasseInterna();
		
		classeInterna.imprimirNome();
	}
}
