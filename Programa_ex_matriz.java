import java.util.Scanner;

public class Programa_ex_matriz {

	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int [][] m = { 	{1,2} , {3, 4, 5}, {6} };
		//m = new int[8][5];

		
		System.out.println(m.length);
		linha2(3);
		System.out.println(m[2].length);
		linha2(8);
 
		//m[0][0] = 55;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		linha();
	}	
	
	public static void linha() {
		System.out.println("----------------------------");
	}
	
	public static void linha2( int n ) {
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println();
	}


}
