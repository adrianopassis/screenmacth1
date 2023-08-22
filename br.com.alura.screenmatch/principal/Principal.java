package principal;

import java.util.ArrayList;

import calculos.CalculadorDeTempo;
import calculos.FiltroRecomendado;
import modelos.Episodios;
import modelos.Filme;
import modelos.Serie;

public class Principal {
	public static void main(String[] args) {
		
		Filme meuFilme = new Filme("O Poderoso Chefão",1970);
		
		meuFilme.setDuracaoEmMinutos(180);
		meuFilme.setIncluidoNoPlano(true);
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(9);
		meuFilme.avalia(10);
		meuFilme.avalia(8);
		
		Filme favorito = new Filme("Matrix", 1999);	
		favorito.setDuracaoEmMinutos(135);
		favorito.setIncluidoNoPlano(true);
		favorito.exibeFichaTecnica();
		favorito.avalia(9);
		favorito.avalia(7);
		favorito.avalia(9);
		
		Filme outro = new Filme("John Wick", 2014);
		outro.setDuracaoEmMinutos(101);
		outro.setIncluidoNoPlano(true);
		outro.exibeFichaTecnica();
		outro.avalia(6);
		outro.avalia(8);
		outro.avalia(8);
		
		ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();
		listaDeFilmes.add(meuFilme);
		listaDeFilmes.add(favorito);
		listaDeFilmes.add(outro);
		
		System.out.println("--------------------------------------");
		System.out.println("Tamanho da lista: " + listaDeFilmes.size() + " filmes.");
		System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
		System.out.println("Segundo Filme: " + listaDeFilmes.get(1).getNome());
		System.out.println("Terceiro Filme: " + listaDeFilmes.get(2).getNome());
		System.out.println("toString do Filme: (" + listaDeFilmes.get(0)
		.toString() + ")" );
		System.out.println("--------------------------------------");
		

		
		
		Serie serie = new Serie("La casa de Papel", 2017);
		serie.setIncluidoNoPlano(true);
		serie.setAtiva(true);
		serie.setTemporadas(5);
		serie.setEpisodiosPorTemporada(10);
		serie.setMinutosPorEpisodio(45);	
		
		CalculadorDeTempo calculadora = new CalculadorDeTempo();
		calculadora.inclui(favorito);
		calculadora.inclui(outro);
		calculadora.inclui(serie);
		
		System.out.println("Nome da série: (" + serie.getNome() + ")" );
		System.out.println("Tempo total: " + calculadora.getTempoTotal() );
		
		
		Episodios primeiro = new Episodios();
		primeiro.setNumero(1);
		primeiro.setSerie(serie);
		primeiro.setTotalVisualizacoes(300);
		
		FiltroRecomendado filtro = new FiltroRecomendado();		
		filtro.filtrar(favorito);
		filtro.filtrar(outro);
		filtro.filtrar(primeiro);
		
		
		
		}
}
