package br.com.janaina.devdojo.ZGConcorrencia.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTest01 {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Double> dollarRequest = executorService.submit(new Callable<Double>() {
			@Override
			public Double call() throws Exception {
				TimeUnit.SECONDS.sleep(2);
				return 4.35D;
			}
		});
		
		doSomething();
		Double dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
		System.out.println("Dollar: " + dollarResponse);
		executorService.shutdown();
	}

	private static void doSomething() {
		System.out.println(Thread.currentThread().getName());
		long sum = 0;
		for (int i = 0; i < 1_000_000; i++) {
			sum += 1;
		}
	}
}
