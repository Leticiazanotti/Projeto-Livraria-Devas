package LivrariaDevas;

import java.util.Scanner;

public class LivrariaTeste {

	public static void main(String[] args) {
		
			
			LivrariaDevas lv = new LivrariaDevas("Bom Dia, Verônica","Raphael Montes e Ilana Casoy","Policial e Mistério",1234,30,"Digital");
			LivrariaDevas lv2 = new LivrariaDevas("Razão e Sensibilidade","Jane Austen","Romance",1234,30,"Físico");
			LivrariaDevas lv3 = new LivrariaDevas("Eu,Robô","Isaac Asimov","Futuro Distópico",1234,39.90,"teste");
			
			Terror terror = new Terror("","","",0,0,"","teste");
			Romance romance = new Romance("","","",0,0,"","Persuasão");
			Ficcao ficcao = new Ficcao("","","",0,0,"","teste");
			
			System.out.println("*****LIVRARIA DEVAS*****");
			System.out.println("Digite o gênero do livro: ");
			System.out.println("1- Terror");
			System.out.println("2 - Romance");
			System.out.println("3 - Ficção");
			
			int op;
			Scanner leia = new Scanner(System.in);
			
			do {
				System.out.println("\nEscolha uma opção: ");
				op = leia.nextInt();
				
			if(op == 1)
			{
				
				lv.imprimirInfo();
				terror.imprimirNovaInfo3();
				
			} else if (op == 2)
			{
				
				lv2.imprimirInfo();
				romance.imprimirNovaInfo();
				
			} else if (op == 3)
			{
				
				lv3.imprimirInfo();
				ficcao.imprimirNovaInfo2();
					
				
			} else if (op != 1 && op != 2 && op !=3 && op!=0){
				System.out.println("\nEssa opção não existe, tente novamente: ");
				System.out.println("\nDigite o gênero do livro: ");
				System.out.println("\n1 - Terror");
				System.out.println("\n2 - Romance");
				System.out.println("\n3 - Ficção");
				System.out.println("\n4 - Finalizar compra");
				
			}
			
			
			
		
			} while(op!=0);
			System.out.println("Obrigado por utilizar nosso sistema!!!");
			
	
	
	}

}
