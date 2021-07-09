package br.com.generation.heranca;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class ImprimeAnimal {



		public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);

			Cachorro dog1 = new Cachorro();
			Cavalo horse1 = new Cavalo();
			Preguica preguica = new Preguica();

			dog1.setDeveCorrer("SIM");
			dog1.setIdade(3);
			dog1.setNome("Jhow");
			dog1.setSom("CACHORRO?! Eu não sou cachorro não!");

			horse1.setDeveCorrer("SIM");
			horse1.setIdade(10);
			horse1.setNome("Pégasus");
			horse1.setSom("KABOOOOOONG");

			preguica.setNome("Gertrudes");
			preguica.setIdade(12);
			preguica.setDevePendurar("SIM");
			preguica.setSom("Só mais cinco minutinhos........");



			/*System.out.println("Qual o nome o cachorro: ");
			dog1.setNome(entrada.nextLine());*/ // O usuário informa (set) o nome

			/*JOptionPane.showMessageDialog(null, dog1.getNome()); --> pop up mensagem do sistema*/
			System.out.println(".+´`-_-=( CACHORRO )=-_-´`+.");
			System.out.println("Nome: " + dog1.getNome());		
			System.out.println("Idade: " + dog1.getIdade() + " anos.");
			System.out.println("Corre?: " + dog1.getDeveCorrer());
			System.out.println(dog1.getSom() + "\n\n");

			System.out.println(".+´`-_-=( CAVALO )=-_-´`+.");
			System.out.println("Nome: " + horse1.getNome());
			System.out.println("Idade: " + horse1.getIdade() + " anos.");
			System.out.println("Corre?: " + horse1.getDeveCorrer());
			System.out.println(horse1.getSom() + "\n\n");

			System.out.println(".+´`-_-=( PREGUIÇA )=-_-´`+.");
			System.out.println("Nome: " + preguica.getNome());
			System.out.println("Idade: " + preguica.getIdade() + " anos.");
			System.out.println("Sobe em árvore?: " + preguica.getDevePendurar());
			System.out.println(preguica.getSom());

			entrada.close();
			
		}
}




