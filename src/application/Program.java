package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria","Alex","Bob");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		//list.add(3); -> (Nao add a uma lista Coringa NAO SABE O TIPO - ERRO COMPILACAO)
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}