package br.com.janaina.devdojo.ZGConcorrencia.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest01 {
	private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	// imprime 'beep' a cada determinado tempo
	private static void beeper() {
		Runnable r = () -> {
			System.out.println(LocalTime.now().format(formatter) + " beep");
		};

		// executa o comando r, iniciando em 1seg, a cada 2seg continua executando, formato: segundos
		ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleWithFixedDelay(r, 2, 2, TimeUnit.SECONDS);
		
		executor.schedule(() -> {
			System.out.println("Cancelando o scheduleWithFixedDelay");
			// false para n�o interromper caso algum beep esteja em execu��o
			scheduleWithFixedDelay.cancel(false);
			executor.shutdown();
		// finalizar� ap�s 10seg
		}, 20, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {
		System.out.println(LocalTime.now().format(formatter));
		beeper();
	}
}