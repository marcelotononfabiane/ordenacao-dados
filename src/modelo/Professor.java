//pacote
package modelo;

public class Professor /*classe*/ extends Pessoa {/*Heran�a*/
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
	System.out.println("O professor "+nome+" est� ensinando.");
}
}
//email: eudisozatunes@gmail.com

//- Comente o c�dico, (descreva), onde, quais s�o, qual a fun��o, 
//o que faz dentro do codigo, como se relacionan, dos seguintes intens:

//=pacote
//=classe
//= m�todo
//=atributo
//=varialveis
//=here�a