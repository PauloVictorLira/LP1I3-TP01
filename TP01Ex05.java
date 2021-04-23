/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado. */

import java.util.Scanner;

public class TP01Ex05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double diametro;		
		System.out.println("Escreva o diâmetro da esfera:");
		diametro = sc.nextDouble();
		double volume = 4 / 3 * Math.PI * (Math.pow(diametro / 2, 3));
		System.out.println("Volume = " + volume);
		sc.close();
	}
	
}