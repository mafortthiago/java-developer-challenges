import lombok.Getter;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected @Getter int numero;
	protected @Getter double saldo;
	protected @Getter Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) throws Exception {
		if(isSaldoDisponivel(valor)){
			saldo -= valor;
		} else {
			throw new Exception("Saldo insuficiente para essa operação!");
		}

	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) throws Exception {
		if(isSaldoDisponivel(valor)){
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			throw new Exception("Saldo insuficiente para essa operação!");
		}

	}
	public boolean isSaldoDisponivel(double valor){
		return this.saldo > valor;
	}


	@Override
	public String toString() {
		return " Agência: " + this.agencia + "\n Número: " + this.numero + "\n Saldo: " + this.saldo + "\n Cliente: " + this.cliente.getNome();

	}
}
