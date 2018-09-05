package modelo;// pacote

public class Aluno/*Classe aluno*/  extends Pessoa { //Herança
	
	String sexo; // variable
	int matricula; //variable
	
		// Metodo Construtor
		public Aluno(String nome, int idade, int matricula) {//metodo construtor 
			super(nome, idade);//atributo
			this.matricula = matricula;//variavel mais atributo
		}
	//  O metodo estudar, imprime mensagem na tela para o usuário
	public void estudar() {
		System.out.println("Aluno estudar. ");// aluno estudando
	}
	
}

//email: eudisozatunes@gmail.com

//- Comente o códico, (descreva), onde, quais são, qual a função, 
// o que faz dentro do codigo, como se relacionan, dos seguintes intens:

//=pacote
//=classe
//= método
//=atributo
//=varialveis
//=hereça