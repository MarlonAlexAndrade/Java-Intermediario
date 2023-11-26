package hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.model.Pessoa;
import hibernate.util.hibernateUtil;

public class PessoaDAO {
	public void criarPessoa(Pessoa pessoa) {
		Transaction transaction = null;
		
		try(Session session = hibernateUtil.getSession().openSession()){
			
		}
	}
}
