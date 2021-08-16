package br.com.janaina.devdojo.ZAgenericsdois;

public class ClasseGenericaTest1 {
	public static void main(String[] args) {
		CarroRentavelService carroRentalService = new CarroRentavelService();
		Carro carro = carroRentalService.buscarCarroDisponivel();
		System.out.println("usando o carro por um m�s...");
		carroRentalService.retornarCarroAlugado(carro);
	}
}
