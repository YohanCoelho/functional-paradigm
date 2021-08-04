package InterfacesFuncionais;

public class FuncaoAltaOrdem {
	public static void main(String[] args) {
		Calculo SOMA = (a, b) -> a + b;
		Calculo SUBTRACAO = (a, b) -> a - b;
		Calculo DIVISAO = (a, b) -> a % b;
		Calculo MULT = (a, b) -> a * b;

		System.out.println(executarOperacao(SOMA, 1, 3)); // 4
		System.out.println(executarOperacao(SUBTRACAO, 4, 5)); // -1
		System.out.println(executarOperacao(DIVISAO, 6, 7)); // 6
		System.out.println(executarOperacao(MULT, 8, 9)); // 72

	}

	public static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}
}

interface Calculo {
	public int calcular(int a, int b);
}