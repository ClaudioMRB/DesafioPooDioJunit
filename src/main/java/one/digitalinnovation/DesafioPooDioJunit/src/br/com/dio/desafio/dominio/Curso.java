package one.digitalinnovation.DesafioPooDioJunit.src.br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

	public Curso() {

	}

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super();
		this.cargaHoraria = cargaHoraria;
		super.setDescricao(descricao);
		super.setTitulo(titulo);
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "\nNome do curso: " + getTitulo() + "\nDescricao:  " + getDescricao() + "\nCarga Horaria: "
				+ cargaHoraria + "\n";
	}

}
