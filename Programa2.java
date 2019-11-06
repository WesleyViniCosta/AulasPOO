import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double x, y;

		System.out.print("X: ");
		x = leia.nextDouble();
		System.out.print("Y: ");
		y = leia.nextDouble();

		if ( (x != 0) && (y != 0) )
		{
			System.out.println("Nenhuma das situações");
		}
		else
		{
			if ( (y == 0) && ( x != 0)  )
			{
				System.out.println("Eixo X");
			}
			else
			{
				if ( ( x == 0) && (y == 0) )
				{
					System.out.println("Origem");
				}
				else
				{
					System.out.println("Eixo Y");
				}
			}
		}

	}
}
