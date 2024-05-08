package Vetor;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int [5];
		int b[] = new int [5];
		int c[] = new int [10];

		Scanner ler = new Scanner (System.in);

		for (int i=0; i<5; i++) {
			System.out.println("Informe um valor " + i +"..:" );
			a[i] = ler.nextInt();
			c[i] = a[i];
}
		
		for (int i=0; i<5; i++) {
			System.out.println("Informe um valor " + i +"..:" );
			b[i] = ler.nextInt();
			c[i+5] = b [i];
}
		for (int i=0; i<10; i++) {
	
			System.out.println("O setor C é igual:" + c[i]);
	}
	}
}
