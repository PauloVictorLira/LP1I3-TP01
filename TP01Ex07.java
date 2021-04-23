/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados*/

import java.util.Scanner;

public class TP01Ex07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, base;		
		System.out.println("Escreva a base do retângulo:");
		base = sc.nextDouble();
		System.out.println("Escreva a altura do retângulo:");
		altura = sc.nextDouble();
		double media = Math.sqrt(base * altura);
		System.out.println("Média geomética = " + media);
		sc.close();
	}
	
}