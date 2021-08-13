package br.com.janaina.devdojo.XQueue;

import java.util.PriorityQueue;
import java.util.Queue;

import br.com.janaina.devdojo.WMap.Consumidor;

public class QueueTest2 {
	public static void main(String[] args) {
		Consumidor consumidor = new Consumidor("Janaina");
		Queue<Consumidor> consumidorQueue = new PriorityQueue<>();
		consumidorQueue.add(consumidor);
	}
}
