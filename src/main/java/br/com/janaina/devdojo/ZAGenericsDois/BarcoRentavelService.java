package br.com.janaina.devdojo.ZAGenericsDois;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
	private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
	
	public Barco buscarBarcoDisponivel() {
		System.out.println("Buscando barco dispon�vel...");
		Barco barco = barcosDisponiveis.remove(0);
		System.out.println("Alugando barco: " + barco);
		System.out.println("Barcos dispon�veis para alugar: ");
		System.out.println(barcosDisponiveis);
		return barco;
	}
	
	public void retornarBarcoAlugado(Barco barco) {
		System.out.println("Devolvendo barco: " + barco);
		barcosDisponiveis.add(barco);
		System.out.println("Barcos dispon�veis para alugar: ");
		System.out.println(barcosDisponiveis);
		
	}
}
