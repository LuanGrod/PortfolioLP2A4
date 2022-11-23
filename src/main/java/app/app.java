package app;

import java.util.List;

import modelo.DisciplinaHasAluno;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class app {
	public static void main (String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MtM");
		EntityManager em = emf.createEntityManager();
		
		List<DisciplinaHasAluno> alunos = em.createQuery("FROM AlunoDisciplina", DisciplinaHasAluno.class).getResultList();
		System.out.println(alunos);
	}
}