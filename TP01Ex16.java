/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

16. Entrar via teclado com o valor de um �ngulo em graus, calcular e exibir as
seguintes fun��es trigonom�tricas: seno, cosseno, tangente e secante deste �ngulo.
Lembre-se que uma fun��o trigonom�trica trabalha em radianos. */

import java.util.Scanner;

public class TP01Ex16 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a vaor do �ngulo (em graus):");
		double angulo = sc.nextDouble();
		double sen, cos, tan, sec;
		angulo = Math.toRadians(angulo);
		sen = Math.sin(angulo);
		cos = Math.cos(angulo);
		tan = Math.tan(angulo);
		sec = 1 / Math.sin(angulo);
		System.out.println("Seno = " + sen);
		System.out.println("Coseno = " + cos);
		System.out.println("Tangente = " + tan);
		System.out.println("Secante = " + sec);
		sc.close();
	}
	
}