import java.util.Locale;
import java.util.Scanner;

public class CalculadoraAreas {
	/* Fazer um programa Java que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
	a) a área do triângulo retângulo que tem A por base e C por altura.
	b) a área do círculo de raio C. (pi = 3.14159)
	c) a área do trapézio que tem A e B por bases e C por altura.
	d) a área do quadrado que tem lado B.
	e) a área do retângulo que tem lados A e B. */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		double a = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		double b = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		double c = sc.nextDouble();
		
		double areaTriangulo = ( a * c ) /2;
		double areaCirculo = Math.PI * Math.pow ( c, 2);
		double areaTrapezio = ((a + b) * c) / 2;
		double areaQuadrado = Math.pow(b, 2);
		double areaRetangulo = a * b;
		
		System.out.printf("A área do triângulo retângulo que tem A por base e C por altura: %.3f%n", areaTriangulo);
		System.out.printf("A área do círculo de raio C. (pi = 3.14159): %.3f%n", areaCirculo);
		System.out.printf("A área do trapézio que tem A e B por bases e C por altura: %.3f%n", areaTrapezio);
		System.out.printf("A área do quadrado que tem lado B: %.3f%n", areaQuadrado);
		System.out.printf("A área do retângulo que tem lados A e B: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
