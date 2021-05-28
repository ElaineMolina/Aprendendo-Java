//Gerente eh um Funcionario, Gerente herda da classe Funcionario, assina o contrato Autenticavel

public class Gerente extends Funcionario implements Autenticavel{
	
		private AutenticacaoUtil autenticador;
		
		public Gerente() {
			this.autenticador = new AutenticacaoUtil();
		}
	
	public double getBonificacao() {
		System.out.println("Chamando do método de Bonificacao do GERENTE");
		return  super.getSalario(); //super =pois salário vem da classe mãe e não desta "this"
	}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); 
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
