
public class TestePessoa {

	public static void main(String[] args) {
		
		System.out.println( Math.sin( Math.PI ) );
		
		
		Pessoa p, p2;
		p  = new Pessoa();
		p2 = new Pessoa("Beltrano", 35);
		
		//p.nome = "Fulano";
		p.setNome("Fulano");
		p.setIdade(21);
		System.out.println( p.getNome() );
		System.out.println( p.getIdade() );
		
		System.out.println( p2.getNome() );
		System.out.println( p2.getIdade() );
		System.out.println("\n\n");
		p.exibe();
		System.out.println();
		p2.exibe();
		p.aniversario();
		p.exibe();
		
		
		
	}

}
