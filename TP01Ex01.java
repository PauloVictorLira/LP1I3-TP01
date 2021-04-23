/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área*/

import java.util.Scanner;

public class TP01Ex01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura;		
		System.out.println("Escreva a base do retângulo:");
		base = sc.nextDouble();		
		System.out.println("Escreva a altura do retângulo:");
		altura = sc.nextDouble();
		double area = base * altura;
		System.out.println("Área = " + area);
		sc.close();
	}
	
}