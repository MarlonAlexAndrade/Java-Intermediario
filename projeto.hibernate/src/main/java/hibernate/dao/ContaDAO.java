package hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.model.Conta;
import hibernate.model.Pessoa;
import hibernate.util.HibernateUtil;

public class ContaDAO {
	public Conta getContaById(long id) {
		Transaction transaction = null;
		Conta conta = null;

		try (Session session = HibernateUtil.getSession().openSession()) {
			transaction = session.beginTransaction();

			conta = session.get(Conta.class, id);
			// SELECT * FROM conta WHERE id = 2;

			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return conta;
	}

	public List<Conta> getContas() {
		Transaction transaction = null;
		List<Conta> contas = null;

		try (Session session = HibernateUtil.getSession().openSession()) {
			transaction = session.beginTransaction();

			contas = session.createQuery("FROM Conta c").list();

			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return contas;
	}

	public void criaConta(Conta conta) {
		Transaction transaction = null;

		try (Session session = HibernateUtil.getSession().openSession()) {
			transaction = session.beginTransaction();

			session.save(conta);

			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	public void alteraConta(Conta conta) {
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSession().openSession()) {
			
			transaction = session.beginTransaction();
			
			session.update(conta);
			
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		}
	}
}
