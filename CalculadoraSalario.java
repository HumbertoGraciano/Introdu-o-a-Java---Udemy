import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSalario {

	public static void main(String[] args) {
// Fa�a um programa em java que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
//decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu codigo funcionario: ");
		int codigo = sc.nextInt();
		
		System.out.println("Digite seu valor de horas trabalhadas no m�s: ");
		double horas = sc.nextDouble();
		
		System.out.println("Qual o valor em que voce recebe por hora: ");
		double valorHora = sc.nextDouble();
		
		double salario = horas * valorHora;
		
		System.out.println("Seu codigo de funcionario e: " + codigo);
		System.out.printf("Seu salario e de: U$ %.2f%n", salario);
		
		sc.close();
	}

}
