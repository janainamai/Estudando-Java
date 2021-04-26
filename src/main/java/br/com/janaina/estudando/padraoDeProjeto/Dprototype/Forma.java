package br.com.janaina.estudando.padraoDeProjeto.Dprototype;

public abstract class Forma {
	private int x;
	private int y;
	private String color;
	
	public Forma() {}
	
	public Forma(Forma forma) {
		if(forma != null) {
			this.x = forma.getX();
			this.y = forma.getY();
			this.color = forma.getColor();
		}
	}
	
	public abstract Forma clone();

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
