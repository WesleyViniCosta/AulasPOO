
public class Estudante extends Pessoa {

	private int mat;
	private String curso;

	public Estudante(String nome, int idade, int mat, String c) {
		super(nome, idade);
		this.mat = mat;
		curso = c;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		if (mat > 0)
			this.mat = mat;
		else
			System.out.println("Matrícula inválida!");
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void exibe() {
		super.exibe();
		System.out.println("------- Estudante ---------");
		System.out.println("Mat. : " + mat);
		System.out.println("Curso: " + curso);
		System.out.println("---------------------------\n");
	}
	
	public void mostra() {
		System.out.println("Método mostra()");
	}
	
}
