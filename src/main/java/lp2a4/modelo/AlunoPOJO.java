package lp2a4.modelo;

import java.time.LocalDate;

/**
 * Por se tratar de um CRUD sem regras de negócio, o objeto implementado é um simples POJO.
 * 
 * Em outras circunstâncias pode ser necessário utilizam uma classe que possua outros métodos.
 * 
 * Para entender melhor essa discussão poderá procurar por modelo anêmico X modelo rico.
 * 
 * @author diego
 *
 */
public class AlunoPOJO {
	private String matricula;
	private String nome;
	private String endereco;
	private String dataIngresso;
	private String dataConclusao;

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataIngresso() {
		return dataIngresso;
	}
	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	public String getDataConclusao() {
		return dataConclusao;
	}
	public void setDataConclusao(String dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	@Override
	public String toString() {
		return "AlunoPOJO [matricula=" + matricula + ", nome=" + nome + ", endereco=" + endereco + ", dataIngresso="
				+ dataIngresso + ", dataConclusao=" + dataConclusao + "]";
	}

}
