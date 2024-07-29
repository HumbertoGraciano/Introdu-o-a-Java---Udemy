import java.util.Scanner;

public class ValorDiferenca {

	public static void main(String[] args) {
// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, Diferenca;
		System.out.println("DIGITE OS VALORES DOS PRODUTOS E IREMEOS CALCULAR A DIFERENÇA DELES");
		System.out.println("VALOR PRODUTO A: ");
		A = sc.nextInt();
		System.out.println("VALOR PRODUTO B: ");
		B = sc.nextInt();
		System.out.println("VALOR PRODUTO C: ");
		C = sc.nextInt();
		System.out.println("VALOR PRODUTO D: ");
		D = sc.nextInt();
		
		Diferenca = A * B - C * D;
		
		System.out.println("A DIFERENCA E DE: "+ Diferenca);
		
		sc.close();
	}

}
