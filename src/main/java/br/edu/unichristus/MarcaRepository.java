package br.edu.unichristus;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
	
	public List<Marca> findByNomeStartsWith(String inicio);
	
	public Marca findByNomeEquals(String nome);
	
	public List<Marca> findAll();
}
