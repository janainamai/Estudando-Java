package br.com.janaina.devdojo.Kdatas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Map;

public class LZones {
	public static void main(String[] args) {
		// buscando todas as zonas
		Map<String, String> shortIds = ZoneId.SHORT_IDS;
		System.out.println(shortIds);

		// buscando zona do meu sistema
		ZoneId.systemDefault();
		// saída: America/Sao_Paulo

		// pegando zona de Tokyo
		ZoneId.of("Asia/Tokyo");

		// buscando horário de agora na zona de Tokyo, porém ele não vem pronto, apenas
		// informa que o horário em Tokyo tem +9 horas em relação ao nosso.
		LocalDateTime now = LocalDateTime.now();
		now.atZone(ZoneId.of("Asia/Tokyo"));
		// saída: 2021-05-11T17:05:56.635130300+09:00[Asia/Tokyo]

		//setando zona para Tokyo que é +9h
		ZoneOffset offsetTokyo = ZoneOffset.of("+09:00");
		OffsetDateTime offsetDateTime = now.atOffset(offsetTokyo);
		System.out.println(offsetDateTime);
	}
}
