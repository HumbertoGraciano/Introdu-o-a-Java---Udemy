import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas? ");
		int horas = sc.nextInt();
		
		if(horas <= 12) {
			System.out.println("Bom dia");
		}
		else {
			System.out.println("Boa tarde");
		}
		
		sc.close();
	}
}
