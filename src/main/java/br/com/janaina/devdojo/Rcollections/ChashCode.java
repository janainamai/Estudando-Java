package br.com.janaina.devdojo.Rcollections;

public class ChashCode {
	// hashCode deve estar em sintonia com o equals
	// hash é um número que geramos, utilizaremos um exemplo simples
	// para cada letra do alfabeto, utilizaremos um número

	// A=1, B=2, C=3, D=4...

	// janaina seria igual a 10 + 1 + 14 + 1 + 9 + 14 + 1 = 50
	// esse exemplo é apenas didático, pois com certeza geraria conflito
	// visto que deve existir algum outro nome que também soma 50
	
	// veja abaixo na prática o assunto na classe Celular
}

class Celular {
	private String serialNumber;
	private String marca;

	public Celular(String serialNumber, String marca) {
		this.serialNumber = serialNumber;
		this.marca = marca;
	}

	// se x.equals(y) == true, y.hashCode() == x.hashCode()
	// se o hashCode entre dois objetos for true, não necessariamente o equals precisa ser
	// se x.equals(y) == false o hashCode precisa ser false
	// se (y.hashCode() != x.hashCode) então x.equals(y) deverá ser falso
	@Override
	public int hashCode() {
		return serialNumber == null ? 0 : this.serialNumber.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return false;
		Celular celular = (Celular) obj;
		return serialNumber != null && serialNumber.equals(celular.serialNumber);
	}
	

}
