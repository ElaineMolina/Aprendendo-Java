//editor de vídeo é um funcionário, editor de vídeo herda da classe funcionário
public class EditorVideo  extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando o método de Bonificacao do Editor de Vídeo");
		return  150;
		
	}
}
