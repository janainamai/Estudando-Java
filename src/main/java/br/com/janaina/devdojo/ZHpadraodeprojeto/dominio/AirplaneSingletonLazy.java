package br.com.janaina.devdojo.ZHpadraodeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AirplaneSingletonLazy {
	private static AirplaneSingletonLazy INSTANCE;

	private final Set<String> availableSeats = new HashSet<>();

	private AirplaneSingletonLazy() {

	}

	{
		availableSeats.add("1A");
		availableSeats.add("1B");
	}

	public static AirplaneSingletonLazy getInstance() {
		if (INSTANCE == null) {
			synchronized (AirplaneSingletonLazy.class) {
				if (INSTANCE == null) {
					INSTANCE = new AirplaneSingletonLazy();
				}
			}
		}
		return INSTANCE;
	}

	public boolean buySeat(String seat) {
		return availableSeats.remove(seat);
	}
}
