/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

6. Calcular e exibir a m�dia aritm�tica de quatro valores quaisquer que ser�o
digitados.*/

//import java.util.Locale;
import java.util.Scanner;

public class TP01Ex06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//sc.useLocale(Locale.US);
		double valor1, valor2, valor3, valor4;		
		System.out.println("Insira o valor 1:");
		valor1 = sc.nextDouble();
		System.out.println("Insira o valor 2:");
		valor2 = sc.nextDouble();
		System.out.println("Insira o valor 3:");
		valor3 = sc.nextDouble();
		System.out.println("Insira o valor 4:");
		valor4 = sc.nextDouble();
		double media = (valor1 + valor2 + valor3 + valor4) / 4;
		System.out.println("M�dia aritm�tica = " + media);
		sc.close();
	}
	
}