package br.com.janaina.devdojo.ZFThreads.test;

import br.com.janaina.devdojo.ZFThreads.domain.ContaBancaria;

public class ThreadSafeTest01 implements Runnable{
	private ContaBancaria conta = new ContaBancaria();

	public static void main(String[] args) {
		ThreadSafeTest01 threadTest = new ThreadSafeTest01();
		Thread t1 = new Thread(threadTest, "Hestia");
		Thread t2 = new Thread(threadTest, "Bell Cranel");
		t1.start();
		t2.start();
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			sacar(10);
			if(conta.getSaldo() < 0) {
				System.out.println("DEU RUIM");
			}
		}
	}
	
	private synchronized void sacar(int valor) {
		String thread = Thread.currentThread().getName();
		
		if (conta.getSaldo() >= valor) {
			System.out.println(thread + " est� indo sacar dinheiro");
			conta.sacar(valor);
			System.out.println(thread + " completou o saque, valor atual: " + conta.getSaldo());
		}
		else {
			System.out.println("Sem dinheiro para " + thread + " efetuar o saque ");
		}
	}
}