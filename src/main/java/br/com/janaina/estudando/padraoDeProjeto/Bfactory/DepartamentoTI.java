package br.com.janaina.estudando.padraoDeProjeto.Bfactory;

class DepartamentoTI extends FactoryDepartamento {
	public void criarEmpregado(int id) {
		Programador empregado = new Programador(id);
		System.out.println("Novo empregado: programador " + empregado.getId());
	}
}

