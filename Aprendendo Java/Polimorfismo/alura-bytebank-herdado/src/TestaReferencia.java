
public class TestaReferencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.00);
		
		//Funcionario f = new Funcionario(); //não funciona mais porque deixamos a classe funcionários como abstract
		//f.setSalario(2000.00);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.00);
				
		Designer d = new Designer();
		d.setSalario(2000.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g1);
		controle.registro(ev);
		controle.registro(d);
		
		System.out.println(controle.getSoma());
		
		

	}

}
