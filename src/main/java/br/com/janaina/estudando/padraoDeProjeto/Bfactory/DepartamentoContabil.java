package br.com.janaina.estudando.padraoDeProjeto.Bfactory;

class DepartamentoContabil extends FactoryDepartamento {
	public void criarEmpregado(int id) {
		Contador empregado = new Contador(id);
		System.out.println("Novo empregado: contador " + empregado.getId());
	}
}