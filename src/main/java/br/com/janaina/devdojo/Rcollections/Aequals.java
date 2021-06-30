package br.com.janaina.devdojo.Rcollections;

public class Aequals {
	public static void main(String[] args) {
		// --------------------------- ENTENDENDO == E EQUALS
		
			// == utilizar para vari�veis de tipo primitivo
			// e para verificar se apontam para a mesma localiza��o de mem�ria 
		
			// equals() tamb�m verifica se as vari�veis apontam para o mesmo objeto
			// devemos sobrescrever o equals informando o atributo que deve ser �nico daquele objeto
			// se utilizarmos um exemplo de objeto celular, cada um tem seu pr�prio serialNumber
		
			int idade = 21;
			int idade2 = 21;
			System.out.println(idade == idade2);
			// retorno: true
			// comparou o valor das vari�veis
		
			String sobrenome = "Mai";
			String sobrenome2 = new String("Mai");
			System.out.println(sobrenome == sobrenome2);
			// retorno: false
			// comparou o endere�o de refer�ncia das vari�veis
		
			CelularSemEquals celular1 = new CelularSemEquals("A123", "Motorola");
			CelularSemEquals celular2 = new CelularSemEquals("A123", "Motorola");
			System.out.println(celular1.equals(celular2));
			// retorno: false
			// comparou se as vari�veis apontam para o mesmo endere�o de mem�ria
			// para o retorno ser true, precisamos configurar o equals
		
		// --------------------------- TESTANDO COM EQUALS CONFIGURADO
		
		
	}
}

/**
 * Classe sem m�todo equals sobrescrito.
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
 * Classe com m�todo equals sobrescrito.
 */
class CelularComEquals {
	private String serialNumber;
	private String marca;
}
