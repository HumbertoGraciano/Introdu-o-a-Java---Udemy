import java.util.Locale;
import java.util.Scanner;

public class CalculadoraAreas {
	/* Fazer um programa Java que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
	a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
	b) a �rea do c�rculo de raio C. (pi = 3.14159)
	c) a �rea do trap�zio que tem A e B por bases e C por altura.
	d) a �rea do quadrado que tem lado B.
	e) a �rea do ret�ngulo que tem lados A e B. */

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
		
		System.out.printf("A �rea do tri�ngulo ret�ngulo que tem A por base e C por altura: %.3f%n", areaTriangulo);
		System.out.printf("A �rea do c�rculo de raio C. (pi = 3.14159): %.3f%n", areaCirculo);
		System.out.printf("A �rea do trap�zio que tem A e B por bases e C por altura: %.3f%n", areaTrapezio);
		System.out.printf("A �rea do quadrado que tem lado B: %.3f%n", areaQuadrado);
		System.out.printf("A �rea do ret�ngulo que tem lados A e B: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
