package br.edu.unichristus;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "TB_MARCAS")
@Data
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MARCA_ID")
	private Long marcaID;
	
	@Column(name = "NOME_MARCA", length = 20, nullable = false, unique = true)
	private String nome;
	
	@OneToMany(mappedBy = "marca", fetch =FetchType.EAGER)
	private List<Veiculo> veiculos;
	
	public Marca() {

	}

	public Marca(String nome) {
		this.nome = nome;
	}
	
	
	
}
