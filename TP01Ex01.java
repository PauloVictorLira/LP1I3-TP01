/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

1. Entrar via teclado com a base e a altura de um ret�ngulo, calcular e exibir sua
�rea*/

import java.util.Scanner;

public class TP01Ex01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura;		
		System.out.println("Escreva a base do ret�ngulo:");
		base = sc.nextDouble();		
		System.out.println("Escreva a altura do ret�ngulo:");
		altura = sc.nextDouble();
		double area = base * altura;
		System.out.println("�rea = " + area);
		sc.close();
	}
	
}