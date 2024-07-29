import java.util.Scanner;

public class ex_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		// determina a quantidade de vezes
		int N = sc.nextInt();
		
		int soma = 0;
		// Estrutura reptitiva enquanto
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;		
		}
		System.out.println(soma);
		sc.close();
		
	}

}
