//não pode instanciar dessa classe, porque é abstrata
public abstract class Funcionario { //abstract está relacionado com herança
	
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
	private double salario; //protected = público para os filhos
	
	
	//método sem corpo, não há implementação aqui
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
