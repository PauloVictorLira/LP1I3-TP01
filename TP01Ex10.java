/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit. */

import java.util.Scanner;

public class TP01Ex10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o valor em Celsius:");
		double celsius = sc.nextDouble();
		double fahrenheit = celsius * 1.8 + 32;
		System.out.println("Fahrenheit = " + fahrenheit);
		sc.close();
	}
	
}