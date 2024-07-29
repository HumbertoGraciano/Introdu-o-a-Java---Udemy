import java.util.Scanner;

public class ex2_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int quantidadeValores = sc.nextInt();

		int dentroIntervalo = 0;
		int foraIntervalo = 0;

		// Pedir ao usuário para inserir os valores e verificar se estão dentro ou fora
		// do intervalo
		for (int i = 0; i < quantidadeValores; i++) {
			System.out.print("Digite o valor #" + (i + 1) + ": ");
			int valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				dentroIntervalo++;
			} else {
				foraIntervalo++;
			}
		}

		// Exibir o resultado
		System.out.println("Valores dentro do intervalo: " + dentroIntervalo + " (in)");
		System.out.println("Valores fora do intervalo: " + foraIntervalo + " (out)");

		sc.close();
	}

}
