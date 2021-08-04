package InterfacesFuncionais;

import java.util.function.Supplier;

public class Suppliers {
	public static void main(String[] args) {
		Supplier<Pessoa> suppliers = () -> new Pessoa();
		
		System.out.println(suppliers.get());
	}
}

class Pessoa {
	private String nome;
	private Integer idade;
	
	public Pessoa() {
		nome = "Yohan Coelho";
		idade = 20;
	}

	@Override
	public String toString() {
		return "Pessoa \nnome = " + nome + " \nidade = " + idade;
	}
	
}