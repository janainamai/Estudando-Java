package br.com.janaina.estudando.padraoDeProjeto.Bfactory;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		FactoryBoneca factoryBoneca = null;
		
		System.out.println("Qual boneca você deseja ouvir?\n1. Barbie\n2. Poly");
		
		Scanner scanner = new Scanner(System.in);
		Integer opcao = scanner.nextInt();
		
		if(opcao.equals(1)) {
			factoryBoneca = new FactoryBarbie(); 
		}
		else if(opcao.equals(2)) {
			factoryBoneca = new FactoryPoly(); 
		}
		
		System.out.println();
		factoryBoneca.falarOla();
		System.out.println();
		
	}
}
