
public class Main {

	public static void main(String[] args) {
		Cliente thiago = new Cliente("Thiago");
		IConta cc = new ContaCorrente(thiago);
		IConta poupanca = new ContaPoupanca(thiago);

		cc.depositar(120);
        try {
            cc.transferir(11, poupanca);
        } catch (Exception e) {
			System.out.println(e.getMessage());
        }

        cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
