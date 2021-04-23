/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$). */

import java.util.Scanner;

public class TP01Ex15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva a cotação do dólar:");
		double cotacao = sc.nextDouble();
		System.out.println("Escreva a quantidade em dólares:");
		double dolares = sc.nextDouble();
		double reais = dolares * cotacao;
		System.out.println("R$" + reais);
		sc.close();
	}
	
}