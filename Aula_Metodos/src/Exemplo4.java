import java.util.Scanner;

public class Exemplo4 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n1 = 0, n2 = 0, r = 0;
	
	System.out.println("Digite n1: ");
	n1 = entrada.nextInt();
	System.out.println("Digite n2: ");
	n2 = entrada.nextInt();
	
	r = adicao(n1, n2);
		
	System.out.println("Resultado: "+r);
	}

	public static int adicao(int n1, int n2) {
		int r = 0;
		
		r = n1 + n2;
		
		return r;
	}
	
	
	
}
