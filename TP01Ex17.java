/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln. */

import java.util.Scanner;

public class TP01Ex17 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um valor X:");
		double x = sc.nextDouble();
		System.out.println("Escreva um valor y:");
		double y = sc.nextDouble();
		double potencia = Math.pow(x, y);
		System.out.println("X ^ Y = " + potencia);
		sc.close();
	}
	
}