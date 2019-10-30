package aula3;

import java.util.Scanner;

public class Aula3 {

    public static void main(String[] args) {

    	Candidato c = new Candidato("Wesley Costa", 17);
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o número do seu candidato: ");
        int numCan = scan.nextInt();
       
        if(numCan == 17) {
        	c.recebeVotos();
        }

        System.out.println(c);
    }
}