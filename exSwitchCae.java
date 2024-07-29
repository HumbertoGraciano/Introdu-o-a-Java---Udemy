import java.util.Scanner;

public class exSwitchCae {

	public static void main(String[] args) {
/*** Escreva um programa em Java que receba um código de produto como entrada e determine sua categoria com base nos
três primeiros dígitos do código. Utilize a seguinte tabela para determinar a categoria:

Código começando com "101": Alimentos
Código começando com "202": Eletrônicos
Código começando com "303": Vestuário
Para outros códigos: Categoria não identificada
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
				categoria = "Produto não encontrado";
		}
		sc.close();
		
		System.out.println("O codigo do produto escolhido é da categoria: " + categoria);
	}
}
