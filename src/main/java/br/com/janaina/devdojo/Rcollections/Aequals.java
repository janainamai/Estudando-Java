package br.com.janaina.devdojo.Rcollections;

public class Aequals {
	public static void main(String[] args) {
		// --------------------------- ENTENDENDO == E EQUALS
		
			// == utilizar para variáveis de tipo primitivo
			// e para verificar se apontam para a mesma localização de memória 
		
			// equals() também verifica se as variáveis apontam para o mesmo objeto
			// devemos sobrescrever o equals informando o atributo que deve ser único daquele objeto
			// se utilizarmos um exemplo de objeto celular, cada um tem seu próprio serialNumber
		
			int idade = 21;
			int idade2 = 21;
			System.out.println(idade == idade2);
			// retorno: true
			// comparou o valor das variáveis
		
			String sobrenome = "Mai";
			String sobrenome2 = new String("Mai");
			System.out.println(sobrenome == sobrenome2);
			// retorno: false
			// comparou o endereço de referência das variáveis
		
			CelularSemEquals celular1 = new CelularSemEquals("A123", "Motorola");
			CelularSemEquals celular2 = new CelularSemEquals("A123", "Motorola");
			System.out.println(celular1.equals(celular2));
			// retorno: false
			// comparou se as variáveis apontam para o mesmo endereço de memória
			// para o retorno ser true, precisamos configurar o equals
		
		// --------------------------- TESTANDO COM EQUALS CONFIGURADO
		
		
	}
}

/**
 * Classe sem método equals sobrescrito.
 */
class CelularSemEquals {
	private String serialNumber;
	private String marca;
	
	public CelularSemEquals(String serialNumber, String marca) {
		this.serialNumber = serialNumber;
		this.marca = marca;
	}
	
}

/**
 * Classe com método equals sobrescrito.
 */
class CelularComEquals {
	private String serialNumber;
	private String marca;
}
