import java.util.Scanner;

public class Liata_1_05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n;
		Candidato c;
		
		c = new Candidato(123, "Fulano");
		
		System.out.println( c );
		
		System.out.print("Digite um número para votar: ");
		n = leia.nextInt();
			
		if ( c.getNum() == n ) c.incVoto();
		
		System.out.println( "Numero: " + c.getNum() );
		System.out.println( "Nome  : " + c.getNome() );
		System.out.println( "Votos : " + c.getVotos() );
		
	}
	
}
