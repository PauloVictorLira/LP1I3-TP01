/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

13. Calcular e exibir a velocidade final (em km/h) de um autom�vel, a partir dos
valores da velocidade inicial (em m/s), da acelera��o (m/s�) e do tempo de percurso
(em s) que ser�o digitados.*/

import java.util.Scanner;

public class TP01Ex13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a velocidade inicial (m/s):");
		double vInicial = sc.nextDouble();
		System.out.println("Escreva a acelera��o (m/s�):");
		double aceleracao = sc.nextDouble();
		System.out.println("Escreva o tempo do percurso (s):");
		double tempo = sc.nextDouble();
		double vFinal = vInicial + aceleracao * tempo;
		System.out.println("Velocidade final = " + vFinal + " m/s");
		sc.close();
	}
	
}