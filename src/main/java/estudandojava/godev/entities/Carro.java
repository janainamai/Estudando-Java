package estudandojava.godev.entities;

public class Carro {
	private double motor;
	private int nivelCombustivel;
	private int velocidade;
	private boolean isLigado;

	public Carro() {
	}

	public Carro(double motor, int nivelCombustivel, int velocidade, boolean isLigado) {
		super();
		this.motor = motor;
		this.nivelCombustivel = nivelCombustivel;
		this.velocidade = velocidade;
		this.isLigado = isLigado;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public int getNivelCombustivel() {
		return nivelCombustivel;
	}

	public void setNivelCombustivel(int nivelCombustivel) {
		this.nivelCombustivel = nivelCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	
	

}
