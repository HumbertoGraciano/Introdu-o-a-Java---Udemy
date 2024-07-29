import java.util.Scanner;

public class expreCondTernaria {

	public static void main(String[] args) {
		// Exemplo de EXPRESSÃO CONDICIONAL TERNARIA
		
		Scanner sc = new Scanner(System.in);
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.println(desconto);
		sc.close();
	}

}
