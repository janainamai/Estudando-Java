package br.com.janaina.devdojo.ZFThreads.test;

class ThreadRunnable implements Runnable {
	private String c;

	public ThreadRunnable(String c) {
		this.c = c;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 200; i++) {
			System.out.print(c);
		}
		Thread.yield();
	}
}

public class ThreadsTest03 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new ThreadRunnable("KA"));
		Thread t2 = new Thread(new ThreadRunnable("ME"));
		t1.start();
		t1.join();
		t2.start();
	}
}

