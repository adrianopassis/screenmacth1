package principal;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

public class PrincipalComLista{
	
	public static void main(String[] args) {
		Filme meuFilme = new Filme("O Poderoso Chefão",1970);
		meuFilme.avalia(9);
		
		Filme favorito = new Filme("Matrix", 1999);	
		favorito.avalia(8);
		
		Filme outro = new Filme("John Wick", 2014);
		outro.avalia(8);
		
		Serie serie = new Serie("La Casa de Papel", 2017);
		
		ArrayList<Titulo> lista = new ArrayList<Titulo>();
		lista.add(meuFilme);
		lista.add(favorito);
		lista.add(outro);
		lista.add(serie);		
	
		for (Titulo item : lista) {
			System.out.println(item.getNome());
			if(item instanceof Filme filme && filme.getClassificacao() > 2) {
				System.out.println("Classificação: " + filme.getClassificacao());

			}
					
		}
		imprime();
		ArrayList<String> buscaPorArtistas = new ArrayList<>();
		buscaPorArtistas.add("Adam Sandler");
		buscaPorArtistas.add("Wagner Moura");
		buscaPorArtistas.add("Maria Machado");
		Collections.sort(buscaPorArtistas);
		System.out.println("Lista de artitsas Ordenados");
		System.out.println(buscaPorArtistas);
		
		imprime();
		System.out.println("Lista de Títulos Ordenados");
		Collections.sort(lista);
		System.out.println(lista);
		imprime();
		lista.sort(Comparator.comparing(Titulo::getAnoDelancamento));
		System.out.println("Ordenando por ano");
		System.out.println(lista);
	
	}

	public static void imprime() {
		System.out.println("-------------------------------------------------");
	}
}
