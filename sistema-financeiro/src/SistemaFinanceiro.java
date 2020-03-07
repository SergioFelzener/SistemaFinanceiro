
public class SistemaFinanceiro {
	public static void main(String[] args) {
		Banco banco1 = new Banco("taAi", 1);
		ContaCorrente conta1 = new ContaCorrente(1, 1000, "124.124.123-33");
		ContaCorrente conta2 = new ContaCorrente(2, 2001, "224.124.122.10");
		ContaPoupanca conta3 = new ContaPoupanca(3, 2002, "224.124.124.10");
		
		banco1.criarConta(conta1);
		banco1.criarConta(conta2);
		banco1.criarConta(conta3);
		
		banco1.transfereValor(conta1, conta3, 25.00);
		
		
		System.out.println("Saldo da conta 1 : " + conta1.getSaldo());
		System.out.println("Saldo da conta 2 : " + conta1.getSaldo());
		System.out.println("Saldo da conta 3 : " + conta3.getSaldo());
		
	}

}
