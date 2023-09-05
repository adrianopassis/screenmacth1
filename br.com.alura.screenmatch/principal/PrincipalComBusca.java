package principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import excecao.ErroDeConversaoDeAnoException;
import modelos.Titulo;

public class PrincipalComBusca{
	public static void main(String[] args) throws IOException, InterruptedException{
		Scanner leitura = new Scanner(System.in);
		
		
		try {
			System.out.print("Digite um título de filme: ");
			String busca = leitura.nextLine();
		
			String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=d24533b1";
			
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest request = HttpRequest.newBuilder()
		         .uri(URI.create(endereco))
		         .build();
			HttpResponse<String> response = client
				 .send(request, BodyHandlers.ofString()); 
		 
			String json = response.body();
			System.out.println(json); 
		
			Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
				.create();
		
			TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
			System.out.println(meuTituloOmdb);
			Titulo meuTitulo = new Titulo(meuTituloOmdb);
 			System.out.println("**Título já convertido**");
 			System.out.println(meuTitulo);
		}catch (NumberFormatException e) {
			System.out.print("Aconteceu um erro: ");
			System.out.println(e.getMessage());
		}catch (IllegalArgumentException e) {
			System.out.println("Há algum erro de argumento na busca, verifique o endereço");
		}catch (ErroDeConversaoDeAnoException e) {
			System.out.println(e.getMensagem());
		}
		
		System.out.println("O programa finalizou corretamente!");

		
	}
}
