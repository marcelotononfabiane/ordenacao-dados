//pacote
package modelo; 

//classe de teste
public class Teste {
//metodo principal para execução da classe e outras classes
	public static void main(String[] args) {
	// metodo para chamar classe pessoa
		Pessoa p1 = new Pessoa("Um, dois, TrÊs", 99);
		//atributo
p1.nome = " Daiane goncalves Santana";
	//metodo falar	
p1.falar();//metodo falar
		// metodo para chamar classe aluno
		Aluno a1 = new Aluno("Henrique Nunes Batista", 68, 20);
//atributo		
a1.sexo = "M";
//metodo estudar
		a1.estudar();
//metodo falar
		a1.falar();
//print do atributo nome mais o objeto p1
		
		System.out.println("O nome da pessoa é:" +p1.nome);
		// metodo para chamar classe professor
		Professor prof1 = new Professor("Joao Silva Campos", 69, 2000);
//metodo falar		
prof1.falar();
//metodo ensinar
		prof1.ensinar(prof1.nome);
		
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