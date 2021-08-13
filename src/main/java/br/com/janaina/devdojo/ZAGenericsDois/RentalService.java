package br.com.janaina.devdojo.ZAGenericsDois;

import java.util.List;

public class RentalService<T> {
	
	private List<T> objetosDisponiveis;
	
	public RentalService(List<T> objetosDisponiveis) {
		this.objetosDisponiveis = objetosDisponiveis;
	}
	
	public T buscarObjetoDisponivel() {
		System.out.println("Buscando objeto dispon�vel...");
		T objeto = objetosDisponiveis.remove(0);
		System.out.println("Alugando objeto: " + objeto);
		System.out.println("Objetos dispon�veis para alugar: ");
		System.out.println(objetosDisponiveis);
		return objeto;
	}

	public void retornarObjetoAlugado(T objeto) {
		System.out.println("Devolvendo objeto: " + objeto);
		objetosDisponiveis.add(objeto);
		System.out.println("Objetos dispon�veis para alugar: ");
		System.out.println(objetosDisponiveis);
	}
}
