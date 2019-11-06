import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double c, f;

		System.out.println("Temperatura em C: ");
		c = leia.nextDouble();

		f = (c * 1.8) + 32;

		System.out.println("Temperatura em F: " + f);

		// declaração de variáveis
		int idade = 0;

		System.out.println("Forneça a idade:");
		idade = leia.nextInt();

		if (idade >= 18);
			System.out.println("Você é maior de idade.");

	}
}
