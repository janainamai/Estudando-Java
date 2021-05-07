package br.com.janaina.estudando.padraoDeProjeto.Bfactory;

public abstract class FactoryBoneca {
	public void falarOla() {
		InterfaceBoneca boneca = criarBoneca();
		boneca.falar();
	}
	
	public abstract InterfaceBoneca criarBoneca();
}
