import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Vamos somar a area do raio");
		double area, raio, pi = 3.14159;
		
		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();
	
		area = raio * raio * pi;
		
		System.out.printf("O valor da area é de: %.4f%n", area);
		sc.close();
		
	}

}
