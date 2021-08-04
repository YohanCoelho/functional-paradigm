package InterfacesFuncionais;

import java.util.function.Function;

public class Funcoes {
	public static void main(String[] args) {
		Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto)
				.reverse().toString();
		Function<String, Integer> converterStringParaInteiro = String -> Integer.valueOf(String) * 2;
		System.out.println(retornarNomeAoContrario.apply("Yohan"));
		System.out.println(converterStringParaInteiro.apply("20"));
	}	
}
