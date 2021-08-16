package br.com.janaina.devdojo.ZGConcorrencia.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import br.com.janaina.devdojo.ZGConcorrencia.service.StoreService;

public class CompletableFutureTest01 {
	public static void main(String[] args) {
		StoreService storeService = new StoreService();
		searchPricesAsyncCompletableFuture(storeService);
	}

	private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
		long start = System.currentTimeMillis();

		CompletableFuture<Double> pricesAsyncFuture1 = storeService.getPricesAsyncCompletableFuture("Store 4");
		CompletableFuture<Double> pricesAsyncFuture2 = storeService.getPricesAsyncCompletableFuture("Store 1");
		CompletableFuture<Double> pricesAsyncFuture3 = storeService.getPricesAsyncCompletableFuture("Store 2");
		CompletableFuture<Double> pricesAsyncFuture4 = storeService.getPricesAsyncCompletableFuture("Store 3");

		// com o join não precisamos tratar as exceçõs
		// assim o código fica um pouco mais organizado
		System.out.println(pricesAsyncFuture1.join());
		System.out.println(pricesAsyncFuture2.join());
		System.out.println(pricesAsyncFuture3.join());
		System.out.println(pricesAsyncFuture4.join());

		long end = System.currentTimeMillis();
		System.out.printf("Time passed to searchPricesSync %d%n", (end - start));
		// não precisamos mais do shutdown
	}

	private static void searchPricesAsyncFuture(StoreService storeService) {
		long start = System.currentTimeMillis();

		Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("Store 4");
		Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("Store 1");
		Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("Store 2");
		Future<Double> pricesAsyncFuture4 = storeService.getPricesAsyncFuture("Store 3");

		try {
			System.out.println(pricesAsyncFuture1.get());
			System.out.println(pricesAsyncFuture2.get());
			System.out.println(pricesAsyncFuture3.get());
			System.out.println(pricesAsyncFuture4.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.printf("Time passed to searchPricesSync %d%n", (end - start));
		StoreService.shutdown();
	}

	private static void searchPricesSync(StoreService storeService) {
		long start = System.currentTimeMillis();
		System.out.println(storeService.getPricesSync("Store 1"));
		System.out.println(storeService.getPricesSync("Store 2"));
		System.out.println(storeService.getPricesSync("Store 3"));
		System.out.println(storeService.getPricesSync("Store 4"));
		long end = System.currentTimeMillis();

		System.out.printf("Time passed to searchPricesSync %d%n", (end - start));
	}
}