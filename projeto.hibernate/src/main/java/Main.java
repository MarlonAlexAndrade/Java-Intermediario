import java.util.List;

import hibernate.dao.ContaDAO;
import hibernate.model.Conta;

public class Main {

	public static void main(String[] args) {
		try {
			Conta novaConta = new Conta(); // Criando classe que com objeto que vai salvar no banco
			ContaDAO dao = new ContaDAO(); // Classe que vai salavar a conta no banco
			
			/*novaConta.nome = "Conta de Luz";
			novaConta.dataVencimento = "30/12/2023";
			novaConta.dataPagamento = "";
			
			dao.criaConta(novaConta);
			
			List<Conta> contas = dao.getContas();
			
			for(Conta conta : contas) {
				System.out.println("Nome: " + conta.nome);
				System.out.println("Data Vencimento: " + conta.dataVencimento);
				System.out.println("Data Pagamento: " + conta.dataPagamento);
			}*/
			
			Conta conta = dao.getContaById(1);
			conta.nome = "Conta de Água";
			
			dao.alteraConta(conta);
			
			System.out.print("Nome: " + conta.nome);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
