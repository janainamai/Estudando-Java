package br.com.janaina.devdojo.ZAGenericsDois;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest3 {
	public static void main(String[] args) {
		List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
		List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
		
		RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
		
		Carro carro = rentalService.buscarObjetoDisponivel();
		
		System.out.println("Utilizando o carro por um m�s...");
		
		rentalService.retornarObjetoAlugado(carro);
	}
}
