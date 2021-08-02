
public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.00);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.00);

		cc.transfere(10, cp);
		
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());
	}

}
