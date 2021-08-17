package br.com.janaina.devdojo.ZHpadraodeprojeto.test;

import br.com.janaina.devdojo.ZHpadraodeprojeto.dominio.AirplaneSingletonLazy;

public class AirplaneSingletonLazyTest01 {
	public static void main(String[] args) {
		buySeat("1A");
		buySeat("1A");
	}
	
	private static void buySeat(String seat) {
		System.out.println(AirplaneSingletonLazy.getInstance().buySeat(seat));
	}
}
