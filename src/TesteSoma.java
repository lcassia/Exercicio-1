/****************************************************************************************************************************
 	Implementar, compilar e executar um programa para somar dos números inteiros.
	O aluno deve entregar um link (URL) para um projeto no Github contendo a solução para o problema descrito anteriormente.

****************************************************************************************************************************/

import java.util.Scanner;

public class TesteSoma {
	
	public static void main (String[] args) {
		
		// Declarando variaveis
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;
		
		Scanner Leitor = new Scanner(System.in);
		
		// Coletando informaçoes do usuario
		System.out.println("Digite dois numeros inteiros para soma:");
		num1 = Leitor.nextInt();
		num2 = Leitor.nextInt();
		
		// Calculando a soma de inteiros
		resultado = num1 + num2;
		
		System.out.println("O resultado é: " + resultado);
	
	} // Fim da main

} // Fim TesteSoma