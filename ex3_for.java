import java.util.Scanner;

public class ex3_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número de casos de teste: ");
		int numCasosTeste = scanner.nextInt();

		for (int i = 0; i < numCasosTeste; i++) {
			System.out.println("\nDigite os valores do caso de teste " + (i + 1) + ":");
			System.out.print("Valor 1: ");
			double valor1 = scanner.nextDouble();
			System.out.print("Valor 2: ");
			double valor2 = scanner.nextDouble();
			System.out.print("Valor 3: ");
			double valor3 = scanner.nextDouble();

			double mediaPonderada = calcularMediaPonderada(valor1, valor2, valor3);
			System.out.println("Média Ponderada: " + mediaPonderada);
		}

		scanner.close();
	}

	public static double calcularMediaPonderada(double valor1, double valor2, double valor3) {
		return (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
	}
}
