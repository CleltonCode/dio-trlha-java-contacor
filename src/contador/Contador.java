package contador;

import java.util.Scanner;

import excecao.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro parametro inteiro");
		int primeiroParametro = sc.nextInt();
		
		System.out.println("Entre com o segundo parametro inteiro");
		int segundoParametro = sc.nextInt();
		
		try {
			contar(primeiroParametro, segundoParametro);
		} catch (ParametrosInvalidosException e) {
			System.err.println("Erro: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
	
	static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
	
		if (primeiroParametro > segundoParametro) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contagem = segundoParametro - primeiroParametro;
		
		System.out.println("Total de iterações " + contagem);
		
		for(int i = 0; i < contagem; i++) {
			System.out.println("Iteração - " +  i);
		}
	}
}
