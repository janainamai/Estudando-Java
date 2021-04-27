package br.com.janaina.estudando.padraoDeProjeto.Dprototype;

import java.util.Objects;

public abstract class Forma {
	public int x;
	public int y;
	public String color;
	
	public Forma() {}
	
	public Forma(Forma forma) {
		if(forma != null) {
			this.x = forma.x;
			this.y = forma.y;
			this.color = forma.color;
		}
	}
	
	public abstract Forma clone();
	
	@Override
	public boolean equals(Object object2) {
		 if (!(object2 instanceof Forma)) return false;
	        Forma forma2 = (Forma) object2;
	        return forma2.x == x &&forma2.y == y && Objects.equals(forma2.color, color);
	}


	
	
	
}
