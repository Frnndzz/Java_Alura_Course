import java.util.Scanner;

public class Exemplo1 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int escolha = 1;

		while (escolha >= 1 && escolha <= 4) {
			System.out.println("1 - Adição / 2 - Subtração / 3 - Multiplicação / 4 - Divisão / 5 - Fim do programa");
			escolha = entrada.nextInt();

			if (escolha == 1) {
				adicao();
			} else if (escolha == 2) {
				subtracao();
			} else if (escolha == 3) {
				multiplicacao();
			} else if (escolha == 4) {
				divisao();
			}
			System.out.println("");

		}

	}

	public static void adicao() {

		int num1 = 0, num2 = 0;

		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();

		System.out.println(num1 + num2);

	}

	public static void subtracao() {

		int num1 = 0, num2 = 0;

		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();

		System.out.println(num1 - num2);

	}

	public static void multiplicacao() {

		int num1 = 0, num2 = 0;

		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();

		System.out.println(num1 * num2);

	}

	public static void divisao() {

		int num1 = 0, num2 = 0;

		System.out.println("Digite o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = entrada.nextInt();

		System.out.println(num1 / num2);

	}

}
