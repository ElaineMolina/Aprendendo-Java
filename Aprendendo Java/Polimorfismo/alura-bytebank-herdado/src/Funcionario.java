//n?o pode instanciar dessa classe, porque ? abstrata
public abstract class Funcionario { //abstract est? relacionado com heran?a
	
	 private int senha;

     public void setSenha(int senha) {
         this.senha = senha;
     }

     public boolean autentica(int senha) {
         if(this.senha == senha) {
             return true;
         } else {
             return false;
         }
     }
     
	private String nome;
	private String cpf;
	private double salario; //protected = p?blico para os filhos
	
	
	//m?todo sem corpo, n?o h? implementa??o aqui
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
