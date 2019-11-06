import java.util.Scanner;

public class Liata_1_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double n1, n2;

		System.out.print("Nota 1: ");
		n1 = leia.nextDouble();
		System.out.print("Nota 2: ");
		n2 = leia.nextDouble();

		System.out.println("Média = " + media( n1, n2));

	}
	
	public static double media ( double a, double b) {
		return (a + b )/2;
	}
}
