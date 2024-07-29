import java.util.Locale;
import java.util.Scanner;

public class ValorPecas {

	public static void main(String[] args) {
//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		
		// Configurando o uso de ponto como separador decimal
		 Locale.setDefault(Locale.US);
	     Scanner sc = new Scanner(System.in);

	   // Informa��es sobre a primeira pe�a
	     System.out.println("C�digo da primeira pe�a: ");
	     int codigoPeca1 = sc.nextInt();

	     System.out.println("Quantidade de pe�as: ");
	     int quantidadePeca1 = sc.nextInt();

	     System.out.println("Valor da pe�a: ");
	     double valorPeca1 = sc.nextDouble();

	  // Informa��es sobre a segunda pe�a
	     System.out.println("C�digo da segunda pe�a: ");
	     int codigoPeca2 = sc.nextInt();

	     System.out.println("Quantidade de pe�as: ");
	     int quantidadePeca2 = sc.nextInt();

	     System.out.println("Valor da pe�a: ");
	     double valorPeca2 = sc.nextDouble();

	   // Calculando valores
	     double totalPeca1 = quantidadePeca1 * valorPeca1;
	     double totalPeca2 = quantidadePeca2 * valorPeca2;
	     double valorPagar = totalPeca1 + totalPeca2;

	   // Exibindo o valor a ser pago com duas casas decimais
	     System.out.printf("O valor a pagar � de: R$ %.2f%n", valorPagar);

	        sc.close();
	    }
	}