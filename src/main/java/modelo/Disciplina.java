package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="disciplina")
public class Disciplina {
	
	@Id
	@Column
	private Integer id;
	
	@Column
	private String nome;
	
	@ManyToMany(mappedBy = "disciplinas")
	private List<Aluno> alunos;

	public Integer getCodigo() {
		return id;
	}

	public void setCodigo(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}