package br.com.janaina.devdojo.ZFThreads.test;

import javax.swing.JOptionPane;

import br.com.janaina.devdojo.ZFThreads.domain.EmailDeliveryService;
import br.com.janaina.devdojo.ZFThreads.domain.Members;

public class EmailDeliveryTest01 {
	public static void main(String[] args) {
		Members members = new Members();
		Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
		Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
		
		jiraya.start();
		kakashi.start();
		
		while(true) {
			String email = JOptionPane.showInputDialog("Entre com o seu email:");
			if(email == null || email.isEmpty()) {
				members.close();
				break;
			}
			members.addMemberEmail(email);
		}
	}
}
