package br.com.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.alura.screenmatch.service.ConsumoApi;


/*
Como estamos criando uma aplicação que vai rodar em linha de comando,
iniciamos com a implementação do CommandLineRunner e sobrescrevemos o método run().
*/
@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var api = new ConsumoApi();
		String url = "http://omdbapi.com/?t=gilmore+girls&Season=1&apikey=9613a928";
		var json = api.ObterDados(url);

		System.out.println(json);
	}

}
