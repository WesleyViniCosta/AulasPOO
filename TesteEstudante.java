
public class TesteEstudante {

	public static void main(String[] args) {
		
		
		// Pessoa p, p2;
		// p  = new Pessoa();
		// p2 = new Pessoa("Beltrano", 35);
		
		Estudante e;
		e = new Estudante("AAAAA", 19, 123456, "Eng. Comp.");
		
		System.out.println("---- Estudante ----");
		System.out.println( e.getNome() );
		System.out.println( e.getIdade() );
		System.out.println( e.getMat() );
		System.out.println( e.getCurso() );
		System.out.println("---- --------- ----");
		
		e.exibe();
		
		e.mostra();
		
		/* p.nome = "Fulano";
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
		*/
		
		
	}

}
