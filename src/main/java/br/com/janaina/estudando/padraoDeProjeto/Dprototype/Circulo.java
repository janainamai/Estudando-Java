package br.com.janaina.estudando.padraoDeProjeto.Dprototype;

public class Circulo extends Forma{
	public int raio;
	
	public Circulo() {}

	public Circulo(Circulo circulo) {
		super(circulo);
		if(circulo != null) {
			this.raio = circulo.raio;
		}
	}
	
	@Override
	public Forma clone() {
		return new Circulo(this);
	}
	
	 @Override
	    public boolean equals(Object object2) {
	        if (!(object2 instanceof Circulo) || !super.equals(object2)) return false;
	        Circulo circulo2 = (Circulo) object2;
	        return circulo2.raio == raio;
	    }
	
}
