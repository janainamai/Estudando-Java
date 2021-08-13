package br.com.janaina.devdojo.ZFThreads.domain;

public class ThreadWithRunnable implements Runnable {
	private char c;

	public ThreadWithRunnable(char c) {
		this.c = c;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 200; i++) {
			System.out.print(c);
		}
	}

}
