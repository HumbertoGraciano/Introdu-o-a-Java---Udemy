import java.util.Scanner;

public class exemplo_while {

	public static void main(String[] args) {
		/***
* fazer um programa que leia numeros inteiros até que um zero 
seja digitado. Ao final mostra a soma dos numeros lidos.***/

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		sc.close();
	}

}
