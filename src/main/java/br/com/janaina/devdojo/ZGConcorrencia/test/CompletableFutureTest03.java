package br.com.janaina.devdojo.ZGConcorrencia.test;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import br.com.janaina.devdojo.ZGConcorrencia.service.StoreService;
import br.com.janaina.devdojo.ZGConcorrencia.service.StoreServiceDeprecated;

public class CompletableFutureTest03 {
	public static void main(String[] args) {
		StoreServiceDeprecated serviceDeprecated = new StoreServiceDeprecated();
		searchPricesAsyncCompletableFuture(serviceDeprecated);
	}

	private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated serviceDeprecated) {
		long start = System.currentTimeMillis();
		List<String> stores = List.of("Store 1", "Store 2", "Store 3");
		
		// executando o método síncrono de forma assíncrona
		List<CompletableFuture<Double>> completableFutures = stores.stream()
			.map(s -> CompletableFuture.supplyAsync(() -> serviceDeprecated.getPricesSync(s)))
			.collect(Collectors.toList());
		
		List<Double> prices = completableFutures.stream()
			.map(CompletableFuture::join)
			.collect(Collectors.toList());
		
		System.out.println(prices);
		long end = System.currentTimeMillis();
		System.out.printf("Time passed to searchPricesSync %d%n", (end - start));
	}

}