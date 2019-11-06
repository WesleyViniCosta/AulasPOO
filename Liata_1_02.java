import java.util.Scanner;

public class Liata_1_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n;

		System.out.print("Código do mês: ");
		n = leia.nextInt();
		System.out.println("Mês = " + mes( n ));

	}
	
	public static String mes ( int cod ) {
		String m="";
		String [] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
							"Jul", "Ago", "Set", "Out", "Nov", "Dez" }; 
		if ( (cod>0) && (cod<=12) ) m = meses[cod-1];
		return m;
	}
}
