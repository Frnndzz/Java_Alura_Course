
public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		
		
		Conta segundaConta = primeiraConta;
		
		
		
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
		
		
		
	}

}
