//Gerente eh um Funcionario, Gerente herda da classe Funcionario, assina o contrato Autenticavel

public class Gerente extends Funcionario implements Autenticavel{
	
		private AutenticacaoUtil autenticador;
		
		public Gerente() {
			this.autenticador = new AutenticacaoUtil();
		}
	
	public double getBonificacao() {
		System.out.println("Chamando do m�todo de Bonificacao do GERENTE");
		return  super.getSalario(); //super =pois sal�rio vem da classe m�e e n�o desta "this"
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
