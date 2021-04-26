package br.com.janaina.estudando.padraoDeProjeto.Bfactory;

public class Console {
	public static void main(String[] args) {
	FactoryDepartamento depTI = new DepartamentoTI();
	depTI.criarEmpregado(0);
	
	FactoryDepartamento depC = new DepartamentoContabil();
	depC.criarEmpregado(1);
	}
}

