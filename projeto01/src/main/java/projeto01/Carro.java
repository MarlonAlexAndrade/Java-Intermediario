package projeto01;

public class Carro extends Veiculo{
	
	@Override
	public void Andando() {
		System.out.print("Andando de carro");
	}
	
	@Override
	public void Freiando() {
		System.out.print("Freiando de carro");
	}
}
