/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado*/

import java.util.Scanner;

public class TP01Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double aresta;		
		System.out.println("Escreva a aresta do quadrado:");
		aresta = sc.nextDouble();		
		double area = Math.pow(aresta, 2);
		System.out.println("Área = " + area);
		sc.close();
	}
	
}