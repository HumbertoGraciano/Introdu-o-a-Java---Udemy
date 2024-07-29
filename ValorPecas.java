import java.util.Locale;
import java.util.Scanner;

public class ValorPecas {

	public static void main(String[] args) {
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		// Configurando o uso de ponto como separador decimal
		 Locale.setDefault(Locale.US);
	     Scanner sc = new Scanner(System.in);

	   // Informações sobre a primeira peça
	     System.out.println("Código da primeira peça: ");
	     int codigoPeca1 = sc.nextInt();

	     System.out.println("Quantidade de peças: ");
	     int quantidadePeca1 = sc.nextInt();

	     System.out.println("Valor da peça: ");
	     double valorPeca1 = sc.nextDouble();

	  // Informações sobre a segunda peça
	     System.out.println("Código da segunda peça: ");
	     int codigoPeca2 = sc.nextInt();

	     System.out.println("Quantidade de peças: ");
	     int quantidadePeca2 = sc.nextInt();

	     System.out.println("Valor da peça: ");
	     double valorPeca2 = sc.nextDouble();

	   // Calculando valores
	     double totalPeca1 = quantidadePeca1 * valorPeca1;
	     double totalPeca2 = quantidadePeca2 * valorPeca2;
	     double valorPagar = totalPeca1 + totalPeca2;

	   // Exibindo o valor a ser pago com duas casas decimais
	     System.out.printf("O valor a pagar é de: R$ %.2f%n", valorPagar);

	        sc.close();
	    }
	}