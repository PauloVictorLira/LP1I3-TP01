/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido. */

import java.util.Scanner;

public class TP01Ex18 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o valor do produto 1:");
		double produto1 = sc.nextDouble();
		System.out.println("Escreva o valor do produto 2:");
		double produto2 = sc.nextDouble();
		System.out.println("Escreva o valor do produto 3:");
		double produto3 = sc.nextDouble();
		System.out.println("Escreva o valor do produto 4:");
		double produto4 = sc.nextDouble();
		System.out.println("Escreva o valor do produto 5:");
		double produto5 = sc.nextDouble();
		System.out.println("Escreva o valor pago:");
		double pago = sc.nextDouble();
		double troco = pago - (produto1 + produto2 + produto3 + produto4 + produto5);
		System.out.println("Troco = R$" + troco);
		sc.close();
	}
	
}