
public class Pessoa {

	protected String nome;
	protected int idade;
	
	public Pessoa( String n, int i) {
		nome = n;
		this.setIdade(i);
	}
	
	public Pessoa() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {	
		if ( idade >= 0 ) this.idade = idade;
	}
	
	public void exibe() {
		System.out.println("---------------------------");
		System.out.println("Nome : " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("---------------------------");
	}
	
	public void aniversario(){
		idade++;
	}
	
	//public abstract void mostra();
	
//	public void setNome( String nome ) {
//		this.nome = nome;
//	}
//	
//	public String getNome() {
//		return nome;
//	}
	
	
	
}
