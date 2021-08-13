package br.com.janaina.devdojo.ZFThreads.test;

import br.com.janaina.devdojo.ZFThreads.domain.ThreadWithRunnable;

public class ThreadsTest02 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadWithRunnable('A'), "T1A");
		Thread t2 = new Thread(new ThreadWithRunnable('B'), "T2B");
		Thread t3 = new Thread(new ThreadWithRunnable('C'), "T3C");
		Thread t4 = new Thread(new ThreadWithRunnable('D'), "T4D");
		
		// podemos dar prioridade a uma thread, mas na maioria das vezes isso n�o muda nada
		
		t4.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("##########" + Thread.currentThread().getName());
		
		//uma das poucas garantias que temos com threads, � referente ao sleep
		//podemos colocar uma thread para 'dormir' por determinado per�odo em ms
		//precisamos fazer isso com try & catch pois se ela n�o dormir durante o per�odo determinado, temos uma exce��o
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 
