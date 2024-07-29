import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSalario {

	public static void main(String[] args) {
// Faça um programa em java que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu codigo funcionario: ");
		int codigo = sc.nextInt();
		
		System.out.println("Digite seu valor de horas trabalhadas no mês: ");
		double horas = sc.nextDouble();
		
		System.out.println("Qual o valor em que voce recebe por hora: ");
		double valorHora = sc.nextDouble();
		
		double salario = horas * valorHora;
		
		System.out.println("Seu codigo de funcionario e: " + codigo);
		System.out.printf("Seu salario e de: U$ %.2f%n", salario);
		
		sc.close();
	}

}
