package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int entero,ini=0,i=0;
		float numeroF;
		int numero;
		boolean capicua;
		char[] n=new char[3];

		numero = entrada.nextInt();
		numeroF = 4;
		entero=(int) numeroF;
		entero++;
		numeroF=entero;

		while(ini<10) {
			System.out.println(n[i]);
		}
	 }
}
