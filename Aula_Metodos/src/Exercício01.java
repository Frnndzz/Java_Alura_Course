import java.util.Scanner;

public class Exercício01 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int acomodacao = 0, qtdDiarias = 0;
		double valor;

		System.out.println("Digite o nome: ");
		nome = entrada.next();

		while (acomodacao < 1 || acomodacao > 3) {
			System.out.println("1 - Standard");
			System.out.println("2 - Luxo");
			System.out.println("3 - Super Luxo");
			System.out.println("Digite o tipo de acomodação: ");
			acomodacao = entrada.nextInt();
		}

		System.out.println("Digite a quantidade de diárias: ");
		qtdDiarias = entrada.nextInt();

		valor = valor(acomodacao, qtdDiarias);

		System.out.println("Valor: R$" + valor);
		System.out.println("");

		pagamento(valor);

	}

	public static double valor(int acomodacao, int qtdDiarias) {

		double valor = 0;

		if (acomodacao == 1) {
			valor = qtdDiarias * 300;
		} else if (acomodacao == 2) {
			valor = qtdDiarias * 450;
		} else {
			valor = qtdDiarias * 600;
		}

		return valor;

	}

	public static void pagamento(double valor) {

		String pagamento;

		System.out.println("V - A vista");
		System.out.println("P - A prazo");
		System.out.println("Digite a forma de pagamento: ");
		pagamento = entrada.next();

		while (!pagamento.equalsIgnoreCase("V") && !pagamento.equalsIgnoreCase("P")) {
			System.out.println("V - A vista");
			System.out.println("P - A prazo");
			System.out.println("Digite a forma de pagamento corretamente: ");
			pagamento = entrada.next();
		}

		if (pagamento.equalsIgnoreCase("V")) {
			System.out.println("Valor final: R$" + valor * 0.9);
		} else {
			System.out.println("Valor fianl: R$" + valor);
		}

	}

}
