package br.com.janaina.devdojo.Rcollections;

public class Aequals {
	public static void main(String[] args) {
		// --------------------------- ENTENDENDO == E EQUALS
		
			// == utilizar para vari�veis de tipo primitivo
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
			// comparou se as variáveis apontam para o mesmo endereçoo de memória
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
	
	/**
	 * De acordo com a documentação do Java sobre equals, ele precisa ser:
	 * Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
	 * Simétrico: para x e y diferentes de null, se x.equals(y) == true, logo, y.equals(x) precisa ser == true
	 * Transitividade: para x, y, z diferentes de null, se x.equals(y) == true e x.equals(z) == true, logo, y.equals(z) precisa ser == true
	 * Consistente: x.equals(x) sempre retorna true se x for diferente de null
	 * para x diferente de null, x.equals(null) tem que retornar false
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return false;
		CelularComEquals celular = (CelularComEquals) obj;
		return serialNumber != null && serialNumber.equals(celular.serialNumber);
	}
	
	
}
