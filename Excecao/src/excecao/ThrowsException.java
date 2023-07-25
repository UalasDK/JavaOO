package excecao;

import java.util.Scanner;

public class ThrowsException {
	//Neste exemplo uamos o Throws num método que criamos obrigando que quem use este metódo ou faça o tratamento ou também usa o Throws para mandar para outro nível trtar
	public static void main(String[] args) {
		System.out.println("Entre com um número decimal\n");
		try {
			double num = lerNumero();
			System.out.println("Você digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}
		
	}
	
	public static double lerNumero() throws Exception {
		Scanner scan =  new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
