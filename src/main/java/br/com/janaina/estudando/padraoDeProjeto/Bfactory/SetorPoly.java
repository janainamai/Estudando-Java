package br.com.janaina.estudando.padraoDeProjeto.Bfactory;

public class SetorPoly extends FactoryBoneca{

	@Override
	public InterfaceBoneca criarBoneca() {
		return new Poly();
	}

}
