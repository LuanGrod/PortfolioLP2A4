package modelo;

import java.io.Serializable;
import javax.persistence.*;
import modelo.Aluno;
import modelo.Disciplina;

/**
 * Entity implementation class for Entity: DisciplinaHasAluno
 * pq ta assim eu nn sei
 */
@Entity

public class DisciplinaHasAluno implements Serializable {

	
	private Aluno aluno;
	private Disciplina disciplina;
	private int nota;
	private static final long serialVersionUID = 1L;

	public DisciplinaHasAluno() {
		super();
	}   
	public Aluno getAluno() {
		return this.aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}   
	public Disciplina getDisciplina() {
		return this.disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}   
	public int getNota() {
		return this.nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
   
}
