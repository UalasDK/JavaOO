package excecao;

public class MultiplosCatch {

	public MultiplosCatch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + denom[i] + " = " + numeros[i] / denom[i]);
			}
			catch(ArithmeticException erroDivZero) {
				System.out.println("Erro ao tentar dividir por 0");
			}
			catch(ArrayIndexOutOfBoundsException erroPosArray) {
				System.out.println("Erro ao tentar acessar posição não existente no vetor");
			}
		}

	}

}
