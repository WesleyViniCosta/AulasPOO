import java.util.Scanner;

public class Programa_ex_vetor_1_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int [] v;
		v = new int[5];

		for (int i = 0; i < v.length; i++) {
			System.out.print("v["+i+"]: ");
			v[i] = leia.nextInt();
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println("\n");

		System.out.println("Relatório de números pares:");
		for (int i = 0; i < v.length; i++) {
			if ( v[i] % 2 == 0 ) System.out.print(v[i] + " ");
		}
		System.out.println("\n");
		
		int menor = v[0];
		for (int i = 1; i < v.length; i++) {
			if ( v[i] < menor ) menor = v[i];
		}
		System.out.println("Menor foi " + menor);
	
		
		
		
	}
}
