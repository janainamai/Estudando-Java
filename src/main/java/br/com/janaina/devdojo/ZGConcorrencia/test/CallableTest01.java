package br.com.janaina.devdojo.ZGConcorrencia.test;
 
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

class RandomNumberCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		int count = ThreadLocalRandom.current().nextInt(1, 11);
		for (int i = 0; i < count; i++) {
			System.out.printf("%s executando callable%n", Thread.currentThread().getName());
		}
		return String.format("%s finalizou, n�mero: %d", Thread.currentThread(), count);
	}
}

public class CallableTest01 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		RandomNumberCallable random = new RandomNumberCallable();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<String> future = executorService.submit(random);
		
		System.out.printf("Programa finalizado %s%n", future.get());
		executorService.shutdown();
	}
}
