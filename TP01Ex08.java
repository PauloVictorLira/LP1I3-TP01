/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros*/

import java.util.Scanner;

public class TP01Ex08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double milha, quilometro;		
		System.out.println("Escreva o valor da milha marítima:");
		milha = sc.nextDouble();
		quilometro = milha * 1.852;
		System.out.println("Quilômetros = " + quilometro);
		sc.close();
	}
	
}