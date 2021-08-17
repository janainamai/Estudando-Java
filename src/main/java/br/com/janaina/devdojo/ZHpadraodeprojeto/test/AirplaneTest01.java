package br.com.janaina.devdojo.ZHpadraodeprojeto.test;

import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.Airplane;

public class AirplaneTest01 {
	public static void main(String[] args) {
		buySeat("1A");
		buySeat("1A");
	}
	
	private static void buySeat(String seat) {
		Airplane airplane = new Airplane(); 
		System.out.println(airplane.buySeat(seat));
	}
}
