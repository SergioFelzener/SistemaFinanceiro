
public class Conta {
	int agencia;
	int codigo;
	String cpf;
	double saldo = 0;
	
	public Conta(int agencia, int codigo, String cpf) {
		this.agencia = agencia;
		this.codigo = codigo;
		this.cpf = cpf;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void creditar(double valor) {
		saldo += valor;
	}
	
	public void debitar(double valor) {
		saldo -= valor;
	}
}