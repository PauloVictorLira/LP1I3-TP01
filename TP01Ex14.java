/*Paulo Victor Lira Silva	CB 3003906
Juan de Sousa Fucks			CB 300404X

14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.*/

import java.util.Scanner;

public class TP01Ex14 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
        System.out.print("Escreva a a aresta do cubo: ");
        double aresta = sc.nextDouble();
        System.out.print("Escreva o valor do raio da esfera: ");
        double raio = sc.nextDouble();
        double volume = Math.pow(aresta, 3) - Math.pow(raio, 3) * Math.PI * 4 / 3;
        System.out.print("Volume livre = " + volume);
        sc.close();
	}
	
}