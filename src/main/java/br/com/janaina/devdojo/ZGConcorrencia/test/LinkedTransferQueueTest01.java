package br.com.janaina.devdojo.ZGConcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
	public static void main(String[] args) throws InterruptedException {
		TransferQueue<Object> tq = new LinkedTransferQueue<>();

		System.out.println(tq.remainingCapacity());
	}
}
