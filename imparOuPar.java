import java.util.Scanner;

public class imparOuPar {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero e o programa ira te dizer se ele é Impar ou Par");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.printf("Este numero é Par", numero);
		}
		else {
			System.out.println("Este numero é Impar");
		}
		sc.close();
	}
}
