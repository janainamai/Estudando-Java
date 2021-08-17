package br.com.janaina.devdojo.ZHpadraodeprojeto.dominio;
 
import java.util.HashSet;
import java.util.Set;

public final class Airplane {
	private final Set<String> availableSeats = new HashSet<>();
	
	{
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	
	public boolean buySeat(String seat) {
		return availableSeats.remove(seat);
	}
	
}
