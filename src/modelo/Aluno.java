package modelo;// pacote

public class Aluno/*Classe aluno*/  extends Pessoa { //Heran�a
	
	String sexo; // variable
	int matricula; //variable
	
		// Metodo Construtor
		public Aluno(String nome, int idade, int matricula) {//metodo construtor 
			super(nome, idade);//atributo
			this.matricula = matricula;//variavel mais atributo
		}
	//  O metodo estudar, imprime mensagem na tela para o usu�rio
	public void estudar() {
		System.out.println("Aluno estudar. ");// aluno estudando
	}
	
}

//email: eudisozatunes@gmail.com

//- Comente o c�dico, (descreva), onde, quais s�o, qual a fun��o, 
// o que faz dentro do codigo, como se relacionan, dos seguintes intens:

//=pacote
//=classe
//= m�todo
//=atributo
//=varialveis
//=here�a