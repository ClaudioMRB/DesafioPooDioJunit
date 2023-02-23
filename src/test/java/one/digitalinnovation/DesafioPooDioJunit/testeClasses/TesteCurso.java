package one.digitalinnovation.DesafioPooDioJunit.testeClasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import one.digitalinnovation.DesafioPooDioJunit.src.br.com.dio.desafio.dominio.Curso;

public class TesteCurso {

	@Test
	void testeCargaHoraria() {
		Curso curso1 = new Curso("Java", "Programação orientada a objetos", 4);
		Curso curso2 = new Curso("Java", "Entendendo Métodos Java", 2);
		
		Assertions.assertEquals(4, curso1.getCargaHoraria());
		Assertions.assertEquals(2, curso2.getCargaHoraria());
	
	  }
	
	@Test
	void testeTitulo() {
		Curso curso1 = new Curso("Java", "Programação orientada a objetos", 4);
		Curso curso2 = new Curso("Java", "Entendendo Métodos Java", 2);
		
		Assertions.assertEquals("Java", curso1.getTitulo());
		Assertions.assertEquals("Java", curso2.getTitulo());
		
	  }
	
	@Test
	void testeDescrição() {
		Curso curso1 = new Curso("Java", "Programação orientada a objetos", 4);
		Curso curso2 = new Curso("Java", "Entendendo Métodos Java", 2);
		
		Assertions.assertEquals("Programação orientada a objetos", curso1.getDescricao());
		Assertions.assertEquals("Entendendo Métodos Java", curso2.getDescricao());
	  }
	
	
	
	
}
