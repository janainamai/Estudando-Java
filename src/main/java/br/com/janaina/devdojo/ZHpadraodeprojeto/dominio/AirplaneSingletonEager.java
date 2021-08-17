package br.com.janaina.devdojo.ZHpadraodeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AirplaneSingletonEager {
	private static final AirplaneSingletonEager INSTANCE = new AirplaneSingletonEager();
	
	private final Set<String> availableSeats = new HashSet<>();

	// construtor privado para não permitir instancia
	private AirplaneSingletonEager() {
		
	}
	
	{
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	
	public static AirplaneSingletonEager getInstance() {
		return INSTANCE;
	}

	public boolean buySeat(String seat) {
		return availableSeats.remove(seat);
	}
}
