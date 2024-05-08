package Vetor;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);

		int soma =0;
		int valor[] = new int [5];


		for (int i=0; i<5; i++) {
			System.out.println("Informe o " +" "+ i +" "+ " valor " );
			valor[i] = ler.nextInt();


			soma = soma+valor[i];
		}   
		


		if (soma>15){
			System.out.println("O resultado é " + soma);
		}

		else {

			System.out.println("O resultado é maior que 15" );
		}
		ler.close();
	}

}
