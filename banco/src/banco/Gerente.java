package banco;

public class Gerente extends Funcionario implements Autenticavel {
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	Gerente() {
		//Construtor
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso Permitido, senha do gerente confere");
			return true;
		}
		else {
			System.out.println("Acesso Negado, senha errada para gerente");
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getSenha() {
		return this.senha;
	}
	
	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
	}
}