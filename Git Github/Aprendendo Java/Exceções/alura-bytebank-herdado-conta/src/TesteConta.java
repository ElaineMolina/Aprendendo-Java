
public class TesteConta {

	public static void main(String[] args) throws SaldoInsuficienteException{
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.00);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.00);

		cc.transfere(110, cp);
		
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());
	}

}
