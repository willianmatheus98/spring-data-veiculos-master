package br.edu.unichristus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "TB_VEICULOS")
@Data
public class Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VEICULO_ID")
	private Long veiculoID;

	@Column(name = "ANO_VEICULO", nullable = false)
	private Integer ano;

	@Column(name = "PLACAS_VEICULO", nullable = false, length = 8, unique = true)
	private String placas;

	public Veiculo() {

	}

	public Veiculo(Integer ano, String placas) {
		this.ano = ano;
		this.placas = placas;
	}
	
	@ManyToOne
	@JoinColumn(name="MARCA_ID")
	Marca marca;
	
	
	@Override
	public String toString() {

		return "Veiculo [veiculoID=" + veiculoID + ", ano=" + ano + ", placas=" + placas + ", marca=" + marca.getNome() + "]";
	}
	

	
}
