package lp20200402;

import java.util.Scanner;

public class ListaExtra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
	/*	
		//QUEST�O 01, 07 DA LISTA1
		//ACERTEI S� FALTOU 1 DETALHE
				
				
				
				/*	
				int x, a , b;
				
				System.out.println("Digite o valor a ser testado: ");
				x = leitor.nextInt();
				System.out.println("Digite o valor de a: ");
				a = leitor.nextInt();
				System.out.println("Digite o valor de b: ");
				b = leitor.nextInt();
				
				if(a >= b) {
					System.out.println("Dados inv�lidos! O valor de A deve ser menor que o valor de B!");
				}
				else {
				
					if(x >= a && x <= b) {
						System.out.println("O valor de x que �: " + x + " est� dentro do intervalo: [" + a + "," + b + "]");
					}else {
						System.out.println("O valor de x que �: " + x + " N�O est� dentro do intervalo: [" + a + "," + b + "]");
					}
				
				}
			
			
				
				
		//QUESTAO 02, QUESTAO 09 DA LISTA1
		//2) Dados tr�s valores A, B e C, construa um programa que imprima os valores 
			//de forma ascendente (do menor para o maior). 
		//ACERTEI DO MEU JEITO
		// DO JEITO DO PROF: (acho que at� ele errou)
				
				int a, b, c, aux;
		
				System.out.println("Digite um valor inteiro:");
				a = leitor.nextInt();
				System.out.println("Digite outro valor inteiro:");
				b = leitor.nextInt();
				System.out.println("Digite mais um valor inteiro:");
				c = leitor.nextInt();
				
				
				//Ordena��o simples
				//a b c
				//5 3 1
				//3 5 1 (trocou a com b)
				//3 1 5 (trocou b com c)
				//1 3 5 (trocou a com b)
				
				
				if (a > b) {
					aux = b;
					b = a;
					a = aux;
				}
				if (b > c) {
					aux = c;
					c = b;
					b = aux;
				}
				if (a > b) {
					aux = b;
					b = a;
					a = aux;
				}
				
				System.out.println("Os valores em ordem ficam  a: " + a + ", b: " + b + ", c:" + c);
				
				
		//QUEST�O 03
		//Uma loja est� levantando o valor total de todas as mercadorias em estoque. Escreva
		//um algoritmo que permita a entrada das seguintes informa��es: 
		//a) o n�mero total de mercadorias no estoque; 
		//b) o valor de cada mercadoria. 
		//Ao final imprimir o valor total em estoque e a m�dia de valor das mercadorias.
				
				int qtdEstoque;
				float valorItem = 0, valorTotal=0, media;
				
				System.out.println("Digite a quantidade de produtos no estoque:");
				qtdEstoque = leitor.nextInt();
				
				for(int i=1; i<=qtdEstoque; i++) {
					System.out.println("Digite o valor do item/mercadoria:");
					valorItem = leitor.nextFloat();
					valorTotal = valorTotal + valorItem; //a ordem das itera��es importa muito!!! tipo questao 11 da lista1
					
					
				}
				
				
				media = valorTotal/qtdEstoque;
				
				System.out.println("Valor total em estoque: " + valorTotal);
				System.out.println("M�dia de valor das mercadorias: " + media);
				
				
		//QUEST�O 04, ATIVIDADE DEPOIS, IF E ELSE SIMPLES
				
				
				
				
		//QUEST�O 05
		//5) A lot�rica do seu estado precisa disponibilizar n�meros para apostas, onde o
		//apostador ir� selecionar um n�mero inteiro entre 1 e 10. Considerando que o sistema
		//disponibiliza 10 possibilidades de apostas, ent�o ser�o 10 possibilidades de selecionar
		//um n�mero entre 1 e 10. Exemplo de cartela:
		//(1, 1 2 3 4 5 6 7 8 9 10)
		//(2, 1 2 3 4 5 6 7 8 9 10)
		//(3, 1 2 3 4 5 6 7 8 9 10)
		//(4, 1 2 3 4 5 6 7 8 9 10)
		//(5, 1 2 3 4 5 6 7 8 9 10)
		//(6, 1 2 3 4 5 6 7 8 9 10)
		//(7, 1 2 3 4 5 6 7 8 9 10)
		//(8, 1 2 3 4 5 6 7 8 9 10)
		//(9, 1 2 3 4 5 6 7 8 9 10)
		//(10, 1 2 3 4 5 6 7 8 9 10)
		//Escreva um algoritmo que imprima na tela as seguintes sequ�ncias de n�meros
		//conforme o modelo acima, at� que o primeiro n�mero (antes da v�rgula, que identifica
		//o n�mero da aposta), tamb�m chegue a 10.
				
						
				for(int i = 1; i <= 10; i++) {
					System.out.print("(" + i + ",");
							
						for(int j = 1; j <= 10; j++) {
							System.out.print(" " + j + " ");
							}
							
					System.out.println(")");
							
						}
			
				
		//QUESTAO 06
		//6) O sistema de programa��o de eventos de um empresa necessita que o usu�rio
		//selecione um valor de Hora e Minutos para inserir uma programa��o. Dentro desse
		//contexto, o sistema deve permitir a exibi��o de uma lista de horas e minutos (em
		//formato brasileiro, ou seja, de 00:00 at� 23:59), com a possibilidade de definir o
		//intervalo de minutos de 10 em 10 minutos, de 15 em 15 minutos ou de 30 em 30
		//minutos entre cada hora a ser exibida. Al�m dessa configura��o por intervalor de
		//minutos, o seu sistema deve permitir tamb�m a defini��o de hora inicial e hora final.
				
				//Escreva um algoritmo que leia do usu�rio o tipo de intervalo desejado (10, 15 ou 30), a
				//hora inicial e a hora final da disponibilidade da agenda e imprima na tela toda a
				//sequ�ncia de horas e minutos poss�veis de um rel�gio para essa configura��o.
						
						
				
					int horaInicial, horaFinal, intervaloMin;
					
					System.out.println("Digite a hora inicial de abertura da agenda: ");
					horaInicial = leitor.nextInt(); //testar se est� entre 0 e 23
							
					System.out.println("Digite a hora final da agenda: ");
					horaFinal = leitor.nextInt(); //testar se est� entre 0 e 23
					
					System.out.println("Informe o intervalo de minutos para a genda (10, 15 ou 30):");
					intervaloMin = leitor.nextInt();
					
					if (intervaloMin == 10 || intervaloMin == 15 || intervaloMin == 30) {
					
						if (horaInicial >= horaFinal) {
							System.out.println("Hora inicial e final inv�lidas!");
						}else {
							
							for (int h = horaInicial; h<horaFinal; h++) {
								
								for(int m = 0; m <= 59; m = m + intervaloMin) {
									System.out.println(String.format("%02d", h) + ":" + String.format("%02d", m));
								}
								
							}
							
						}
						
					}else {
						System.out.println("Intervalo n�o permitido!");
					}
					
					
				*/

	
	
	
	}

}
