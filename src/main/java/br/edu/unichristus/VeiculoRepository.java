package br.edu.unichristus;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
	
	public List<Veiculo> findByMarcaNomeEquals(String marca);
	
	public List<Veiculo> findByMarcaNomeEqualsAndAnoGreaterThanEqual(String marca, int ano);
	
	public List<Veiculo> findAll();
	
}
