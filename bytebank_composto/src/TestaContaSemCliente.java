
public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "marcela";
		
		contaDaMarcela.deposita(200);
		
		System.out.println(contaDaMarcela.titular.nome);
		

		System.out.println(contaDaMarcela.getSaldo());
		
	}
	
}
