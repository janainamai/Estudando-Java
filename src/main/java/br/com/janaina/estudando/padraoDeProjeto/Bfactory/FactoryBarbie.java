package br.com.janaina.estudando.padraoDeProjeto.Bfactory;

public class FactoryBarbie extends FactoryBoneca {

	@Override
	public InterfaceBoneca criarBoneca() {
		return new Barbie();
	}

}
