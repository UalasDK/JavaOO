package excecao;

public class CatchComOu {
	
	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + " / " + denom[i] + " = " + numeros[i] / denom[i]);
			}
			//A partir do Java7 podemos utilizar o OR, tem que ser o OR bit a bit para dar certo (|)
			catch(ArithmeticException | ArrayIndexOutOfBoundsException erro) {
				System.out.println("aconteceu um erro" + erro);
			}
			finally {
				System.out.println("\nEsta linha está no finally e por isto sempre será impressa após o try e os catch");
			}
		}
	}

}
