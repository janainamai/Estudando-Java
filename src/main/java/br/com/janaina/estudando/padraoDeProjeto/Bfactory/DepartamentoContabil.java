package br.com.janaina.estudando.padraoDeProjeto.Bfactory;

class DepartamentoContabil extends Departamento {
	public void criarEmpregado(int id) {
		this.criarEmpregado = new Contador(id);
	}
}