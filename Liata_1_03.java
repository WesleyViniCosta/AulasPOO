import java.util.Scanner;

public class Liata_1_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] v = {4, 3, 6, 8, 4, 2};

		System.out.println("Quantidade acima da média = " +
								QTD_ACIMA_MEDIOA(v) );
	}
	
	public static int QTD_ACIMA_MEDIOA ( int [] vet ) {
		int qtd=0, soma=0;
		double media;
		for (int i = 0; i < vet.length; i++) {
			soma = soma + vet[i];
		}
		media = (double)soma / vet.length;
		System.out.println(media);
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > media) qtd++;
		}
		return qtd;
	}
}
