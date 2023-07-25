package br.com.caelum.contas.main;
import caelum.teste.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta novaConta = new Conta();

		novaConta.deposita(100.00);

		System.out.println(novaConta.getSaldo());

		novaConta.saca(25.00);

		System.out.println(novaConta.getSaldo());

	}
}
