package banco;

public class ContaCorrente extends Conta {
	
	ContaCorrente(){
		//Construtor
		System.out.println("Conta corrente criada");
	}
	
	
	public boolean saca(double valor) {
		if (this.getSaldo() >= (valor + 0.10)) {
			super.saca(valor + 0.10);
			return true;
		} else
			return false;
	}
	
	public void transfere(double valor, Conta contaDestino) {
		super.saca(valor);
		contaDestino.deposita(valor);
	}

}