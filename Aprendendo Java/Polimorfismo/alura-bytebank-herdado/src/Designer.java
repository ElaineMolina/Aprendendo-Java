//Designer é um funcionário, Designer herda da classe funcionário
public class Designer  extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando o método de Bonificacao do Designer");
		return  200;
		
	}
}
