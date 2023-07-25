package banco;

public class Principal {
	public static void main(String[] args) {
		ContaPoupanca conta = new ContaPoupanca();
		Conta contaHeranca = null;
		String tipoConta;
		Gerente gerente = new Gerente();
		Cliente novoCliente = new Cliente();
		SistemaInterno validarAcesso = new SistemaInterno();
		
		
		conta.deposita(100.0);
		
		System.out.println(conta.getSaldo());
		
		gerente.setNome("João da Silva");
		gerente.setSenha(7231);
		gerente.setSalario(5000.0);
		
		System.out.println(gerente.autentica(7231));
		System.out.println("Bonificação do funcionário: R$" + gerente.getBonificacao());
		
		tipoConta = "Conta Corrente";
		
		if(tipoConta == "Conta Corrente") {
			contaHeranca = new ContaCorrente();
		}
		else if(tipoConta == "Conta Poupança") {
			contaHeranca = new ContaPoupanca();
		}
		else
			System.out.println("Nem conta corrente e nem conta poupança criadas");
		
		contaHeranca.setSaldo(100);
		contaHeranca.saca(50);
		conta.saca(50);
		System.out.println("Saldo da contaHeranca" + contaHeranca.getSaldo());
		System.out.println("Saldo da conta comum" + conta.getSaldo());
	
		System.out.println("\n\nTestando tarnsferência da conta comum para a conta herança\n");
		contaHeranca.transfere(20, conta);
		System.out.println("Saldo da contaHeranca" + contaHeranca.getSaldo());
		System.out.println("Saldo da conta comum" + conta.getSaldo());
		
		System.out.println("\n\nVerificando o metodo de interface 'autenticavel'");
		novoCliente.setSenha(123);
		novoCliente.autentica(123);
		gerente.autentica(123);
		//Posso passar um objeto criado pelo tipo X para um parametro do tipo Y (interface) desde que o que se usar na implementação do metódo esteja assinado na interface 
		validarAcesso.login(gerente, 7231);
		
		
		
		
		
	}
}
