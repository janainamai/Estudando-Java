package br.com.janaina.estudando.padraoDeProjeto.Bfactory;

class DepartamentoTI extends Departamento {
	public void criarEmpregado(int id) {
		this.criarEmpregado = new Programador(id);
	}
}