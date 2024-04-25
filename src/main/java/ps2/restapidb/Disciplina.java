package ps2.restapidb;

import javax.persistence.*;

@Entity
@Table(name="disciplinas")
public class Disciplina {
	@Id @GeneratedValue
	private long id;
	private String nome;
	private int horario;
		
	public Disciplina() {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int gethorario() {
		return horario;
	}
	public void sethorario(int horario) {
		this.horario = horario;
	}

}