/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados. */

import java.util.Scanner;

public class TP01Ex12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a altura do cone:");
		double altura = sc.nextDouble();
		System.out.println("Escreva o raio da base do cone:");
		double raio = sc.nextDouble();
		double volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
		System.out.println("Volume = " + volume);
		sc.close();
	}
	
}