
public class Candidato {
	private int num, votos;
	private String nome;
	
	public Candidato ( int num, String nome) {
		this.num = num;
		this.nome = nome;
		votos = 0;
	}
	public int getNum() {
		return num;
	}
	public int getVotos() {
		return votos;
	}
	public String getNome() {
		return nome;
	}
	public void incVoto() {
		votos++;
	}
	
	public String toString() {
		return  "Numero: " + getNum()+"\n" + 
				"Nome  : " + getNome() + "\n" + 
				"Votos : " + getVotos() +"\n";
	}
}
