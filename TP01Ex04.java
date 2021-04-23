/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. */

import java.util.Scanner;

public class TP01Ex04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura;		
		System.out.println("Escreva a base do triângulo:");
		base = sc.nextDouble();		
		System.out.println("Escreva a altura do triângulo:");
		altura = sc.nextDouble();
		double area = base * altura / 2;
		System.out.println("Área = " + area);
		sc.close();
	}
	
}