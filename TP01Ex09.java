/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

9. Calcular e exibir a tens�o de um determinado circuito eletr�nico a partir dos
valores da resist�ncia e corrente el�trica que ser�o digitados. Utilize a lei de Ohm. */

import java.util.Scanner;

public class TP01Ex09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double resistencia, corrente;		
		System.out.println("Escreva o valor da resist�ncia:");
		resistencia = sc.nextDouble();
		System.out.println("Escreva o valor da corrente:");
		corrente = sc.nextDouble();
		double tensao = resistencia * corrente;
		System.out.println("Tens�o = " + tensao);
		sc.close();
	}
	
}