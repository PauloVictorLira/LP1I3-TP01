/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

4. A partir dos valores da base e altura de um tri�ngulo, calcular e exibir sua �rea. */

import java.util.Scanner;

public class TP01Ex04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura;		
		System.out.println("Escreva a base do tri�ngulo:");
		base = sc.nextDouble();		
		System.out.println("Escreva a altura do tri�ngulo:");
		altura = sc.nextDouble();
		double area = base * altura / 2;
		System.out.println("�rea = " + area);
		sc.close();
	}
	
}