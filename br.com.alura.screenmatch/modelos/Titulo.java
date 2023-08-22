package modelos;

public class Titulo implements Comparable<Titulo> {
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacao;
	private int totalDeVendas;
	private int duracaoEmMinutos;
	private double totalDeAvalicoes;
	
	public Titulo(String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public void exibeFichaTecnica() {
		System.out.println("--------------------------------------");
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
		System.out.println("Duração em minutos: " + duracaoEmMinutos);
		System.out.println("Incluído no plano: " + incluidoNoPlano);
	}
	
	public void avalia(double nota){
		somaDasAvaliacao += nota;
		totalDeAvalicoes ++;
	}
	
	public double pegaMedia() {
		return somaDasAvaliacao/totalDeAvalicoes;
	}
	
	public String getNome() {
		return nome;
	}

	/*public void setNome(String nome) {
		this.nome = nome;
	}*/

	public int getAnoDelancamento() {
		return anoDeLancamento;
	}

	/*public void setAnoDelancamento(int anoDelancamento) {
		this.anoDeLancamento = anoDelancamento;
	}*/

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public double getSomaDasAvaliacao() {
		return somaDasAvaliacao;
	}

	public void setSomaDasAvaliacao(double somaDasAvaliacao) {
		this.somaDasAvaliacao = somaDasAvaliacao;
	}

	public int getTotalDeVendas() {
		return totalDeVendas;
	}

	public void setTotalDeVendas(int totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public double getTotalDeAvalicoes() {
		return totalDeAvalicoes;
	}

	public void setTotalDeAvalicoes(double totalDeAvalicoes) {
		this.totalDeAvalicoes = totalDeAvalicoes;
	}

	@Override
	public int compareTo(Titulo outroTitulo) {
		return this.getNome().compareTo(outroTitulo.getNome());
	}

	
	
}
