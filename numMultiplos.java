import java.util.Scanner;

public class numMultiplos {
	public static void main(String[] args) {
/***Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
ordem crescente ou decrescente. ***/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos descobrir  se os valores s�o multiplos");
		System.out.println("Digite um numero para letra A");
		int A = sc.nextInt();
		
		System.out.println("Digite um numero para letra B");
		int B = sc.nextInt();
		
		if( A % B == 0 || B % A == 0) {
			System.out.println("S�o multiplos");
		}
		else {
			System.out.println("N�o s�o multiplos");
		}
		sc.close();
		
	}

}
