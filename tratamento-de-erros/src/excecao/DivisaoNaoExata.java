package excecao;

public class DivisaoNaoExata extends Exception {
	private int num1;
	private int num2;
	
	public DivisaoNaoExata(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "Resultado de " + num1 + " / " + num2 + "não é um inteiro";
	}
	
	

}
