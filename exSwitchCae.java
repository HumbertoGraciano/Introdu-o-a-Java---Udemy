import java.util.Scanner;

public class exSwitchCae {

	public static void main(String[] args) {
/*** Escreva um programa em Java que receba um c�digo de produto como entrada e determine sua categoria com base nos
tr�s primeiros d�gitos do c�digo. Utilize a seguinte tabela para determinar a categoria:

C�digo come�ando com "101": Alimentos
C�digo come�ando com "202": Eletr�nicos
C�digo come�ando com "303": Vestu�rio
Para outros c�digos: Categoria n�o identificada
***/
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("TABELA DE PRODUTOS DISPONIVEIS: \n 101: ALIMENTOS \n 202: ELETRONICOS \n 303: Vestuario \n");
		System.out.print("Digite o codigo do produto escolhido: ");
		String codigoProduto = sc.nextLine();
		
		String categoria;
		
		switch (codigoProduto.substring(0,3)) {
		case "101": 
			categoria = "Alimentos";
			break;
		
		case "202":
			categoria = "Eletronicos";
			break;
		case "303":
			categoria = "Vestuario";
			break;
		default:
				categoria = "Produto n�o encontrado";
		}
		sc.close();
		
		System.out.println("O codigo do produto escolhido � da categoria: " + categoria);
	}
}
