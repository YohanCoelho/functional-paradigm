package InterfacesFuncionais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {
	public static void main(String[] args) {
		String[] nomes = {"Yohan", "Yohan", "Coelho", "Programador", "Junior"};
		Integer[] numeros = {1, 2, 3, 4, 5};
		imprimirNomesFiltrados(nomes);
		imprimirDobroCadaItemDaLista(numeros);
		
		List<String> profissoes = new ArrayList<>();
		profissoes.add("Desenvolvedor");
		profissoes.add("Analista");
		profissoes.add("Testador");	
		profissoes.add("Analista de Sistemas");
		
		profissoes.stream()
				.filter(profissao -> profissao.startsWith("Analista"))
				.forEach(System.out::println);
	}
	
	public static void imprimirNomesFiltrados(String... nomes) {
		
		String nomesParaImprimir= "";
		for(int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("Yohan")) {
				nomesParaImprimir += "" + nomes[i]; 
			}
		}
		
		System.out.println("Nomes do Loop For: " +nomesParaImprimir);
		
		String nomesDaStream = Stream.of(nomes)
				.filter(nome -> nome.equals("Yohan"))
				.collect(Collectors.joining()); // Pega um array de String e transforma tudo em um só
		
		System.out.println("Nomes da Stream: " +nomesDaStream );
		
		Stream.of(nomes)
				.forEach(nome -> System.out.println("Imprimir todos os nomes pelo forEach: "+nome));
	}	
	
	public static void imprimirDobroCadaItemDaLista(Integer... numeros) {
		for(Integer numero : numeros) {
			System.out.println(numero*2);
		}
		
		System.out.println("------------------------");
		
		Stream.of(numeros).map(numero -> numero * 2)
							.forEach(System.out::println);
				
	}

	
}
