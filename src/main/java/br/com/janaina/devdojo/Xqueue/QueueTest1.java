package br.com.janaina.devdojo.Xqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest1 {
	public static void main(String[] args) {
		Queue<String> fila = new PriorityQueue<>();
		
		fila.add("C");
		fila.add("A");
		fila.add("B");
		
		while(!fila.isEmpty())
			System.out.println(fila.poll());
		
	}
}
