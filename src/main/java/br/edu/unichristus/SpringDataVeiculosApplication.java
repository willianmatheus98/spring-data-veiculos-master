package br.edu.unichristus;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe de execução da aplicação Spring Boot
 * 
 * @author Willian, Kaliary and Kaio
 *
 */
@SpringBootApplication
public class SpringDataVeiculosApplication implements CommandLineRunner {

	/**
	 * ATIVIDADE PRÁTICA - SPRING DATA
	 */

	@Autowired
	private VeiculoService servicoVeiculos;
	
	@Autowired
	private MarcaService servicoMarcas;
	
	@Override
	public void run(String... args) throws Exception {

		/** 1 - INSERIR UM NOVO VEÍCULO PARA A MARCA CITROEN */
		
		Veiculo v1 = new Veiculo(2001,"ZZZ-0000");
		v1.setMarca(servicoMarcas.buscaMarca("Citroen"));
		servicoVeiculos.salvar(v1);
		
		/** 2 - LISTAR OS VEÍCULOS DA MARCA CHEVROLET */
		
		List<Veiculo> chevs = servicoVeiculos.buscaPelaMarca("Chevrolet");
		for (Veiculo veiculo : chevs) {
			System.out.println(veiculo);
		}
		
		/** 3 - LISTAR OS VEÍCULOS DA MARCA FIAT POSTERIORES A 2009 */
		
		List<Veiculo> chevs2 = servicoVeiculos.buscaPelaMarcaAno("Fiat", 2009);
		for (Veiculo veiculo : chevs2) {
			System.out.println(veiculo);
		}
		
		/** 4 - LISTAR TODAS AS MARCAS QUE INICIAM COM A LETRA F */
		
		List<Marca> marc = servicoMarcas.iniciaCom("F");
		for (Marca marca : marc) {
			System.out.println(marca);
		}
		
		/** 5 - LISTAR TODAS AS MARCAS COM OS SEUS VEÍCULOS */
		
		List<Marca> todos = servicoMarcas.buscaTodos();
		for (Marca marca : todos) {
			System.out.println(marca);
		}
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataVeiculosApplication.class, args);
	}
}
