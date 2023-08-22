package modelos;

public class Serie extends Titulo{
	
	public Serie(String nome, int AnoDeLancamento) {
		super(nome, AnoDeLancamento);
		// TODO Auto-generated constructor stub
	}

	private int temporadas;
	private boolean ativa;
	private int episodiosPorTemporada;
	private int minutosPorEpisodio;
	
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}
	public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}
	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}
	public void setMinutosPorEpisodio(int minutosPorTemporada) {
		this.minutosPorEpisodio = minutosPorTemporada;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return temporadas * episodiosPorTemporada * minutosPorEpisodio ;
	}
	
	@Override
	public String toString() {
		return "Serie: " + this.getNome() 
		+ " (" + this.getAnoDelancamento() + ")";
	}
	
	

}
