package caelum.teste;

public class Conta {
	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else
			return false;
	}

	public boolean deposita(double valor) {
		this.saldo += valor;
		return true;
	}

	public double getSaldo() {
		return this.saldo;
	}
	/**
	 * Comentário de testes
	 * @return
	 */

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

}
