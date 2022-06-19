package Algoritmo76_ImprimiNumeroSucesso;

import java.util.Scanner;

public class Algoritmo76_ImprimiNumeroSucesso {
	
	static int num ;

	public static void main(String[] args) {		
		algoritmo76_ImprimeNumeroSucessor(num);
	}

	private static void algoritmo76_ImprimeNumeroSucessor(int num) {				
		System.out.println("Digite um número: ");		
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();		
		System.out.println("Número sucessor:  " + (num + 1)%61);
	}

}
