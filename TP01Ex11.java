/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

11. A partir do di�metro de um c�rculo que ser� digitado, calcular e exibir sua �rea. */

import java.util.Scanner;

public class TP01Ex11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o di�metro do c�rculo:");
		double diametro = sc.nextDouble();
		double area = Math.PI * Math.pow(diametro / 2, 2);
		System.out.println("�rea = " + area);
		sc.close();
	}
	
}