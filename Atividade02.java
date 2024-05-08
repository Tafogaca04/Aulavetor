package Vetor;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);


		String nome [] = new String [5];


		for (int i=0; i<5; i++) {
			System.out.println("Informe o " +" "+ i +" "+ " nome " );
			nome[i] = ler.next();

		}
		for (int i=0; i<5; i++) {
			System.out.println("Os nomes são:" + nome[i]);
		}
		ler.close();
	}

}
