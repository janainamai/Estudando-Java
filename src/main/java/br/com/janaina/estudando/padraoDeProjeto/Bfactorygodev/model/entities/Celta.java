package br.com.janaina.estudando.padraoDeProjeto.Bfactorygodev.model.entities;

public class Celta implements IVeiculo {
	private String marca;
	private String modelo;

	@Override
	public String getMarca() {
		return this.marca;
	}

	@Override
	public String getModelo() {
		return this.modelo;
	}

	@Override
	public void setMarca(String marca) {
		this.marca = marca;
		
	}

	@Override
	public void setModelo(String modelo) {
		this.modelo = modelo;
		
	}

}
