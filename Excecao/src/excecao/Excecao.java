package excecao;

public class Excecao {
	
	Excecao() {
		
	}
	
	public static void main(String[] args) {
		int[] vetor = new int[4];
		
		try {
			System.out.println("Antes da Exception");
			vetor[4] = 1;
			System.out.println("Esse texto não será impresso");
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exeção ao acessar um índice de vetor que não existe" + exception);
		}
		System.out.println("Continua imprimindo após Try");
	}

}
