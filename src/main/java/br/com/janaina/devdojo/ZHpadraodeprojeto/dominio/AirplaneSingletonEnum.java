package br.com.janaina.devdojo.ZHpadraodeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AirplaneSingletonEnum {
	INSTANCE;

	private final Set<String> availableSeats;
	
	AirplaneSingletonEnum() {
		this.availableSeats = new HashSet<>();
		this.availableSeats.add("1A");
		this.availableSeats.add("1B");
	}
	
	public boolean buySeat(String seat) {
		return availableSeats.remove(seat);
	}
}
