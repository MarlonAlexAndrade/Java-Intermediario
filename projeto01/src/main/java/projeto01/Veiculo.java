package projeto01;

public class Veiculo {
	private String nome;
	private int ano;
	private String modelo;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public  void Andando() {
		System.out.print("Veiculo andando");
	}
	
	public void Freiando() {
		System.out.print("Veiculo freiando");
	}
}
