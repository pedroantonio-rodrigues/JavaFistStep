import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		//cria uma lista do tipo string usando lista encadeada do tipo arrayList
		List<String> list = new ArrayList<> ();
		
		//adiciona elementos na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		System.out.println(list);
		System.out.println("----------------------");
		//adicionando novos elementos na lista
		// no exeplo na posiçao 2 o nome de marco 
		list.add(2, "Marco");
		System.out.println("----------------------");
		//ver o tamanho da lista 
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		//remover um elemento da lista
		list.remove(1);
		System.out.println("----------------------");
		//remove um elemento por predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);	
		}
		System.out.println("----------------------");
		// Encontra um elemento na lista por predicado
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("----------------------");
		// filtra um elemnto da lista 
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("----------------------");
		//filtra um nome na lista começando com a letra J se nao encontrar retorna nullo 
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
