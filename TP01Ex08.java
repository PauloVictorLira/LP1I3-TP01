/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

8. Sabendo que uma milha mar�tima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quil�metro possui mil metros, fazer um programa para
converter milhas mar�timas em quil�metros*/

import java.util.Scanner;

public class TP01Ex08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double milha, quilometro;		
		System.out.println("Escreva o valor da milha mar�tima:");
		milha = sc.nextDouble();
		quilometro = milha * 1.852;
		System.out.println("Quil�metros = " + quilometro);
		sc.close();
	}
	
}