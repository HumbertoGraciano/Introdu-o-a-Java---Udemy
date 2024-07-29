import java.util.Scanner;

public class Soma2Valores {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa 

		Scanner sc = new Scanner (System.in);
		
		int a, b, soma;
		
		System.out.print(" Digite os valores: ");
		a = sc.nextInt ();
		b = sc.nextInt ();
		
		soma = a + b;
		
		System.out.println("A soma dos valores e de: " + soma);
		
		sc.close();
	}

}
