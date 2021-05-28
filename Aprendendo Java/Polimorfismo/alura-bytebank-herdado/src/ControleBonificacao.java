
public class ControleBonificacao {

	private double soma;
	
	
		public void registro(Funcionario f) {
			this.soma += f.getBonificacao();
	}
	
	public double getSoma() {
		return soma;
	}
}
