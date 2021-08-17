package br.com.janaina.devdojo.ZHpadraodeprojeto.test;

import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.AirplaneSingletonEnum;

public class AirplaneSingletonEnumTest01 {
	public static void main(String[] args) {
		buySeat("1A");
		buySeat("1A");
	}
	
	private static void buySeat(String seat) {
		System.out.println(AirplaneSingletonEnum.INSTANCE.buySeat(seat));
	}
}
