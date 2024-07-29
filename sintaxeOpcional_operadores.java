import java.util.Locale;
import java.util.Scanner;

public class sintaxeOpcional_operadores {

	public static void main(String[] args) {
/*** Exemplo pratico: Uma Operadora cobra 50 reais por um plano que da direito a 100 minutos de ligação. 
Cada minutoo que excedera franquia de 100 minutos custa 2 reais. Faça um programa para  ler a quantidade de 
minutos que uma pessoa consumiu, e mostre o valor a ser pago ***/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos minutos você usou para ligações:");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if(minutos > 100) {
			conta += (minutos- 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		sc.close();
	}

}
