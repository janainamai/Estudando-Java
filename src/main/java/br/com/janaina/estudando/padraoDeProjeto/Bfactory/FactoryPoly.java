package br.com.janaina.estudando.padraoDeProjeto.Bfactory;

public class FactoryPoly extends FactoryBoneca{

	@Override
	public InterfaceBoneca criarBoneca() {
		return new Poly();
	}

}
