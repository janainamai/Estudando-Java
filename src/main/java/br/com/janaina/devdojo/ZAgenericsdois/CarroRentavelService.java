package br.com.janaina.devdojo.ZAgenericsdois;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
	private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
	
	public Carro buscarCarroDisponivel() {
		System.out.println("Buscando carro dispon�vel...");
		Carro carro = carrosDisponiveis.remove(0);
		System.out.println("Alugando carro: " + carro);
		System.out.println("Carros dispon�veis para alugar: ");
		System.out.println(carrosDisponiveis);
		return carro;
	}
	
	public void retornarCarroAlugado(Carro carro) {
		System.out.println("Devolvendo carro: " + carro);
		carrosDisponiveis.add(carro);
		System.out.println("Carros dispon�veis para alugar: ");
		System.out.println(carrosDisponiveis);
		
	}
}
