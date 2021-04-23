/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.*/

import java.util.Scanner;

public class TP01Ex03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double diagonal;		
		System.out.println("Escreva a diagonal do quadrado:");
		diagonal = sc.nextDouble();		
		double area = 0.5 * Math.pow(diagonal, 2);
		System.out.println("Área = " + area);
		sc.close();
	}
	
}