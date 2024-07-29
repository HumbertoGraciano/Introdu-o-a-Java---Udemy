import java.util.Locale;
import java.util.Scanner;

public class exPratico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char a;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(0);
		
		System.out.println("Vamos validar seus dados abaixo, digite eles:");
		System.out.println("Qual seu nome: " + x);	
		System.out.println("Qual a sua idade: " + y);
		System.out.printf("Qual a sua altura: %.2f%n", z);
		System.out.println("Confirme aqui a primeira letra de seu nome: " + a);
		
		sc.close();
	}

}
