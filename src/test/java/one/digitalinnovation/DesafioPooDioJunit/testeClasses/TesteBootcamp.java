package one.digitalinnovation.DesafioPooDioJunit.testeClasses;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import one.digitalinnovation.DesafioPooDioJunit.src.br.com.dio.desafio.dominio.Bootcamp;
import one.digitalinnovation.DesafioPooDioJunit.src.br.com.dio.desafio.dominio.Curso;
import one.digitalinnovation.DesafioPooDioJunit.src.br.com.dio.desafio.dominio.Mentoria;

public class TesteBootcamp {

	@Test
	void testesCursos() {
		Curso curso1 = new Curso("Java", "Programacao orientada a objetos", 4);
		Curso curso2 = new Curso("Java", "Entendendo Metodos Java", 2);
		Mentoria mentoria = new Mentoria("Mentoria de java", "Tratamento de Excecoes em Java", LocalDate.now());
		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descricao Bootcamp Java Developer", curso1, curso2,
				mentoria);

		Assertions.assertEquals("Java", curso1.getTitulo());
		Assertions.assertEquals("Programacao orientada a objetos", curso1.getDescricao());
		Assertions.assertEquals(4, curso1.getCargaHoraria());

		Assertions.assertEquals("Java", curso2.getTitulo());
		Assertions.assertEquals("Entendendo Metodos Java", curso2.getDescricao());
		Assertions.assertEquals(2, curso2.getCargaHoraria());

	}

	@Test
	void testeDataLocal() {
		Bootcamp bootcamp = new Bootcamp();

		Assertions.assertEquals(LocalDate.now(), bootcamp.getDataInicial());
		
	}

}
