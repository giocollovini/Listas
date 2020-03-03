package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("-->>>Mostrar o tamanho de uma Lista<<<--");
		System.out.println(list.size());
		
		System.out.println();
		System.out.println("-->>>Mostrar o conteudo de uma Lista<<<--");
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("-->>>Excluir os itens da Lista que iniciam com letra M<<<--");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("-->>>Achar indices de itens da Lista<<<--");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println();
		System.out.println("-->>>Mostrar os itens da Lista que iniciam com letra A<<<--");
		List<String> result = list.stream().filter(y -> y.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("-->>>Mostrar saida quando não encontra um item na Lista<<<--");
		String name = list.stream().filter(z -> z.charAt(0) == 'J').findFirst().orElse(null);
				
		System.out.println(name);		

	}

}
