import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int A = sc.nextInt();
		
		if (A < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("POSITIVO");
		}
		sc.close();
	}

}
