package banco;

public class SistemaInterno {
	
	public void login(Autenticavel funcOrClient, int senha) {
		if(funcOrClient.autentica(senha)) {
			System.out.println("Recebendo um objeto através de um parâmetro do tipo da interface Autenticavel (Autenticou)");
		}
		else {
			System.out.println("Recebendo um objeto através de um parâmetro do tipo da interface Autenticavel (Não autenticou)");
		}
	}

}
