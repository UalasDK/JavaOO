package excecao;

public class ErrorMemoria {
//Dentro da superclasse throwable temos a Error e a Exception, exceções podem ser tratadas em Java, erros não
	public static void main(String[] args) {
		Excecao teste;
		for(int i = 1000000; i < 900000000; i++) {
			teste = new Excecao();
			System.out.println("Teste feito" + i + "  " + teste);
			int[][] matriz = new int[i][i];
			int [][] matriz2 = new int[1][1];
			int [][] matriz3 = new int[1][1];
			int [][] matriz4 = new int[1][1];
			int [][] matriz5 = new int[1][1];
			int [][] matriz6 = new int[1][1];
			int [][] matriz7 = new int[1][1];
			int [][] matriz8 = new int[1][1];
			int [][] matriz9 = new int[1][1];
			int [][] matriz10 = new int[1][1];
		}

	}

}
