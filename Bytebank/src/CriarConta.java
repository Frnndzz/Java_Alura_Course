
public class CriarConta {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
	
		contaDoPaulo.saldo = 200;
		
		Conta contaDaMaria = new Conta();
		
		contaDaMaria.saldo = 300;
		
		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDaMaria.saldo);
		
		contaDaMaria.transfere(500, contaDoPaulo);
	
		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDaMaria.saldo);
		
		
	}
	
}
