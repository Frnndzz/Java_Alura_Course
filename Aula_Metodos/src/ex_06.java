import java.util.Scanner;

public class ex_06 {

	static Scanner entrada = new Scanner(System.in);
	static int vendas[][] = new int[5][4];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String produtos[] = new String[] { "Perfumaria", "Maquiagem", "Cabelo", "Rosto" };
		String regioes[] = new String[] { "Sul", "Sudeste", "Centro Oeste", "Norte", "Nordeste" };
		int[] vendasProduto = new int[4];

		vendas = totVendas(produtos, regioes);
		vendasProduto = vendasProduto(vendas);

		for (int i = 0; i < 4; i++) {
			System.out.println("Total de produtos de "+produtos[i]+" vendidos: "+vendasProduto[i]);
		}

		System.out.println("");
		
		exibeMaiorVenda(produtos, regioes, vendas);
		
		System.out.println("");
		
		maiorMenorVenda(produtos, vendasProduto);
	}

	public static int[][] totVendas(String[] produtos, String[] regioes) {
		int vendidos[][] = new int[5][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Digite a quantidade de produtos de " + produtos[i] + " vendidos na região "
						+ regioes[j] + ": ");
				vendidos[j][i] = entrada.nextInt();
			}
		}
		return vendidos;
	}

	public static int[] vendasProduto(int[][] vendas) {
		int[] vendasProduto = new int[4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				vendasProduto[i] += vendas[j][i];
			}
		}
		return vendasProduto;
	}

	public static void exibeMaiorVenda(String[] produtos, String[] regioes, int[][] vendas) {
		int maiorVenda = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (vendas[i][maiorVenda] < vendas[i][j]) {
					maiorVenda = j;
				}
			}
			System.out.println(regioes[i]+": "+produtos[maiorVenda]);
			maiorVenda = 0;
		}
		
	}

	public static void maiorMenorVenda(String[] produtos, int[] vendasProduto) {
		int maiorVenda = 0;
		int menorVenda = 0;
		
		for (int i = 0; i < 4; i++) {
			if (vendasProduto[i] > vendasProduto[maiorVenda]) {
				maiorVenda = i;
			} else if (vendasProduto[i] < vendasProduto[menorVenda]) {
				menorVenda = i;
			}
		}
		System.out.println("Maior: "+produtos[maiorVenda]);
		System.out.println("Menor: "+produtos[menorVenda]);
	}



}
