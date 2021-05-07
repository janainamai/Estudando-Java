package br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.model.entities;

public class Celta implements IVeiculo {
	private String marca;
	private String modelo;

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
		
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
		
	}

}
