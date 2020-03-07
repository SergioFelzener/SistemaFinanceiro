
public class Banco {
	String nome;
	int codigo;
	Conta[] contas = new Conta[10];
	int quantidadeDeContas = 0;

	public Banco(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public void criarConta(Conta conta) {
		contas[quantidadeDeContas] = conta;
		quantidadeDeContas++;
		conta.creditar(100.0);
	}

	public void transfereValor(Conta origem, Conta destino, double valor) {
		origem.debitar(valor);
		destino.creditar(valor);
	}
}

