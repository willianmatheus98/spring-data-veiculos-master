package br.edu.unichristus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

	
	@Autowired
	private VeiculoRepository repoVeiculos;

	public void salvar(Veiculo v) {
		this.repoVeiculos.save(v);
		System.out.println("VEÍCULO PLACAS " + v.getPlacas() + " SALVO!");

	}
	
	public List<Veiculo> buscaPelaMarca(String marca){
		return this.repoVeiculos.findByMarcaNomeEquals(marca);
	}
	
	public List<Veiculo> buscaPelaMarcaAno(String marca, int ano){
		return this.repoVeiculos.findByMarcaNomeEqualsAndAnoGreaterThanEqual(marca, ano);
	}
	
	public List<Veiculo> buscaTodos(){
		return this.repoVeiculos.findAll();
	}
	

}
