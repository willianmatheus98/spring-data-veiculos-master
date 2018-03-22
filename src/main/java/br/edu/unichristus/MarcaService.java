package br.edu.unichristus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcaService {
	

		@Autowired
		private MarcaRepository repoMarcas;

		public void salvar(Marca m) {
			this.repoMarcas.save(m);
			System.out.println("VEÍCULO PLACAS " + m.getNome() + " SALVO!");

		}
		
		public Marca buscaMarca(String nome) {
			return this.repoMarcas.findByNomeEquals(nome);
		}
		
		public List<Marca> buscaTodos(){
			return this.repoMarcas.findAll();
		}
		
		public List<Marca> iniciaCom(String inicio){
			return this.repoMarcas.findByNomeStartsWith(inicio);
		}

	}

