package br.com.janaina.devdojo.ZFThreads.test;

import br.com.janaina.devdojo.ZFThreads.domain.ThreadWithRunnable;

public class ThreadsTest01 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadWithRunnable('A'));
		Thread t2 = new Thread(new ThreadWithRunnable('B'));
		Thread t3 = new Thread(new ThreadWithRunnable('C'));
		Thread t4 = new Thread(new ThreadWithRunnable('D'));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class NewThread extends Thread {
	private char c;

	public NewThread(char c) {
		this.c = c;
	}

	// esse � o c�digo que ser� executado por esta thread
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 200; i++) {
			System.out.print(c);
		}
	}
}