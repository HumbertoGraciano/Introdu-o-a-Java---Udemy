import java.util.Scanner;

public class imparOuPar {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero e o programa ira te dizer se ele � Impar ou Par");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.printf("Este numero � Par", numero);
		}
		else {
			System.out.println("Este numero � Impar");
		}
		sc.close();
	}
}
