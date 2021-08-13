package br.com.janaina.devdojo.ZFThreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
	// uma lista de emails com limite de 10
	private final Queue<String> emails = new ArrayBlockingQueue<>(10);
	
	// para indicar se a lista tem email ou n�o
	// ser� uma chave para abrir a classe caso ela possua emails
	private boolean open = true;
	
	public boolean isOpen() {
		return open;
	}
	
	// retorna se existe algum email a ser enviado
	public int pendingEmails() {
		// sincronizando para duas threads n�o acessem o mesmo objeto ao mesmo tempo
		synchronized (emails) {
			return emails.size();
		}
	}
	
	public void addMemberEmail(String email) {
		synchronized (this.emails) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " adicionou email na lista");
			this.emails.add(email);
			
			// notificar as threads que existe um email novo
			this.emails.notifyAll();
		}
	}
	
	public String retrieveEmail() throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " checando se existem emails");
		synchronized (this.emails) {
			// se n�o tiver emails, quero que a thread fique esperando
			while(this.emails.size() == 0) {
				if(!open) return null;
				System.out.println(Thread.currentThread().getName() + "sem emails, modo de espera...");
				// s� podemos utilizar wait quando a nossa thread est� dentro de um bloco sincronizado
				this.emails.wait();
			}
			return this.emails.poll();
		}
	}
	
	public void close() {
		open = false;
		synchronized (this.emails) {
			System.out.println(Thread.currentThread().getName() + " notificando que n�o pegamos mais emails");
		}
	}
}
