/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

7. Calcular e exibir a m�dia geom�trica de dois valores quaisquer que ser�o
digitados*/

import java.util.Scanner;

public class TP01Ex07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, base;		
		System.out.println("Escreva a base do ret�ngulo:");
		base = sc.nextDouble();
		System.out.println("Escreva a altura do ret�ngulo:");
		altura = sc.nextDouble();
		double media = Math.sqrt(base * altura);
		System.out.println("M�dia geom�tica = " + media);
		sc.close();
	}
	
}