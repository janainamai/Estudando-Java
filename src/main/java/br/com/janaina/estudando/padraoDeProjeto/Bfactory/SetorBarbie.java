package br.com.janaina.estudando.padraoDeProjeto.Bfactory;

public class SetorBarbie extends FactoryBoneca {

	@Override
	public InterfaceBoneca criarBoneca() {
		return new Barbie();
	}

}
