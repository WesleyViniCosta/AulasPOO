import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double numero = 0, numero_maior =0, numero_menor=0,soma =0;
		System.out.println("Digite um número:");
		numero = leia.nextDouble();
		numero_maior = numero;
		numero_menor = numero;
		soma = soma + numero;
		for (int i = 0; i < 9; i++) {
			System.out.println("Digite um número:");
			numero = leia.nextDouble(); 
			soma = soma + numero;
			if (numero > numero_maior)
			       numero_maior = numero;
			else if (numero < numero_menor)
			       numero_menor = numero;
		}
		
     System.out.println("O maior número digitado foi: " + numero_maior);
     System.out.println("O menor número digitado foi: " + numero_menor);
     System.out.println("A média dos números digitados é: " + soma/10);
		
	}
}
