package modelos;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel	 {
	
	public Filme(String nome, int AnoDeLancamento) {
		super(nome, AnoDeLancamento);
		
	}

	private String diretor;
	
	

	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		return (int) (pegaMedia() / 2);
	}
	
	@Override
	public String toString() {
		return "Filme: " + this.getNome() + 
				" (" + this.getAnoDelancamento() + ")" ;
	}
}
