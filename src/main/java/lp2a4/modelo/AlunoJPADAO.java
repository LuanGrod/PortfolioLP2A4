package lp2a4.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlunoJPADAO implements AlunoDAO{
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
	private EntityManager em = emf.createEntityManager();

	@Override
	public boolean create(AlunoPOJO aluno) {
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		return true;
	}

	@Override
	public AlunoPOJO retrieve(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(AlunoPOJO aluno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String matricula) {
		// TODO Auto-generated method stub
		return false;
	}

}