package br.com.janaina.devdojo.ZAgenericsdois;

public class ClasseGenericaTest2 {
	public static void main(String[] args) {
		BarcoRentavelService barcoRentalService = new BarcoRentavelService();
		Barco barco = barcoRentalService.buscarBarcoDisponivel();
		System.out.println("usando o barco por um m�s...");
		barcoRentalService.retornarBarcoAlugado(barco);
	}
}
