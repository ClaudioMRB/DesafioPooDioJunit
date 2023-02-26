package one.digitalinnovation.DesafioPooDioJunit.src;

import java.time.LocalDate;

import one.digitalinnovation.DesafioPooDioJunit.src.br.com.dio.desafio.dominio.Bootcamp;
import one.digitalinnovation.DesafioPooDioJunit.src.br.com.dio.desafio.dominio.Curso;
import one.digitalinnovation.DesafioPooDioJunit.src.br.com.dio.desafio.dominio.Dev;
import one.digitalinnovation.DesafioPooDioJunit.src.br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {

		Curso curso1 = new Curso("Java", "Programacao orientada a objetos", 4);

		Curso curso2 = new Curso("Java", "Entendendo Metodos Java", 2);

		Mentoria mentoria = new Mentoria("Mentoria de java", "Tratamento de Excecoes em Java", LocalDate.now());

		Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descricao Bootcamp Java Developer", curso1, curso2,
				mentoria);
		

		Dev devCamila = new Dev("Camila", bootcamp);

		System.out.println(devCamila.toString());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos() + "\nXP:" + devCamila.calcularTotalXp());
		
		System.out.println();
		System.out.println("-------");
		System.out.println();
		Dev devJoao = new Dev("Joao", bootcamp);
		System.out.println(devJoao.toString());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteudos Concluidos Joao:" + devJoao.getConteudosConcluidos() + "\nXP:" + devJoao.calcularTotalXp());
		System.out.println();

	}

}
