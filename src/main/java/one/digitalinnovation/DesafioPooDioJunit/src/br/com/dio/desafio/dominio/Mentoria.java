package one.digitalinnovation.DesafioPooDioJunit.src.br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	public Mentoria() {
	}

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super();
		this.data = data;
		super.setTitulo(titulo);
		super.setDescricao(descricao);
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "\nMentoria: " + getTitulo() + "\ndescricao: " + getDescricao() + "\ndata: " + data + "\n";
	}

}
