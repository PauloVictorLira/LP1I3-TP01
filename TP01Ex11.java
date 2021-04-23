/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. */

import java.util.Scanner;

public class TP01Ex11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o diâmetro do círculo:");
		double diametro = sc.nextDouble();
		double area = Math.PI * Math.pow(diametro / 2, 2);
		System.out.println("Área = " + area);
		sc.close();
	}
	
}