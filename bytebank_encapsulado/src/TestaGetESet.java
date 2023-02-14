
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta(123, 12313);
		
		Cliente paulo = contaDoPaulo.getTitular();
		
		contaDoPaulo.getTitular().setNome("paulo");
		
		
		
		
	}
	
	
}
