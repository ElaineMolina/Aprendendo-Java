//Quando uma classe herda de outra, ela não recebe seus construtores automaticamente
public class ContaPoupanca extends  Conta{
	
		public ContaPoupanca(int agencia, int numero) {
			super( agencia, numero);
		}

		@Override
		public void deposita(double valor) {
			super.saldo += valor;
			
		}

}
