package algNumerosPosiNegZero;

import java.util.Scanner;

public class numeros {
	public static void main(String[] args) { 
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero Inteiro: \n");
		Integer numero = entrada.nextInt();
		
		if (numero > 0){ 
		System.out.println(numero +" � positivo"); 
		} else if (numero < 0) { 
		System.out.println(numero+" � negativo"); 
		} else {
		System.out.println(numero+" � igual a 0");
			}	
		}
	}