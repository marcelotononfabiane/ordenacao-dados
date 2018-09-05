//pacote
package modelo;

public class Professor /*classe*/ extends Pessoa {/*Herança*/
//variavel

int salario;
 
//metodo construtor

public Professor(String nome, int idade, int salario) {
	//atributo do metodo construtor
super(nome, idade);
//variavel mais atributo
	this.salario = salario; 
	}
//metodo ensinar
public void ensinar(String nome) { 
//print do atributo nome do professor
	System.out.println("O professor "+nome+" está ensinando.");
}
}
//email: eudisozatunes@gmail.com

//- Comente o códico, (descreva), onde, quais são, qual a função, 
//o que faz dentro do codigo, como se relacionan, dos seguintes intens:

//=pacote
//=classe
//= método
//=atributo
//=varialveis
//=hereça