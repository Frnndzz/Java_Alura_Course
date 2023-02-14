import java.util.Scanner;

public class Exemplo5 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1 = 0, n2 = 0, media = 0;
		
		System.out.println("Digite a nota 1: ");
		n1 = entrada.nextInt();
		System.out.println("Digite a nota 2: ");
		n2 = entrada.nextInt();
		
		media = media(n1,n2);
		
		analise(media);
		
	}
	
	public static double media(double n1, double n2) {
		
		double media = 0;
		
		media = (n1 + n2) / 2;
		
		return n1 + n2;
	}

	public static void analise(double media) {
		
		if (media >= 6) {
			System.out.println("Aprovado");
			bonus();
		} else {
			System.out.println("Reprovado");
		}
	}
	
	public static void bonus() {
		
		System.out.println("Você recebeu 20% de bolsa");
	}
	
}
