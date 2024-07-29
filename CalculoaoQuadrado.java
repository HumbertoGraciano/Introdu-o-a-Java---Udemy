import java.util.Scanner;

public class CalculoaoQuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		int resultado = num * num;
		System.out.println("O resultado do numero ao quadrado é: " + resultado);
	
		sc.close();
	}

}
