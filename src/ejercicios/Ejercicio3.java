package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada;
		int cantidad;
		String[] palabras;
		
		System.out.println("Dime el tamaño del vector:");
		entrada = new Scanner(System.in);
		cantidad = entrada.nextInt();
		
		palabras = new String[cantidad];
		
		rellenar(palabras);
		mostrar(palabras);
		System.out.println("Hay " + contarPalabras(palabras) + " palabra que empiezan por 'a'.");
		
		entrada.close();
	}

	public static void rellenar(String[] palabras){
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0;i<palabras.length;i++){
			System.out.println("Dame la " + (i+1) +"º palabra:");
			palabras[i]=entrada.next();
		}
		entrada.close();
	}
	
	public static int contarPalabras(String[] palabras){
		int cantidad=0;
		
		for(int i=0;i<palabras.length;i++){
			if(palabras[i].charAt(0)=='a') cantidad++;
		}
		
		return cantidad;
	}
	
	public static void mostrar(String[] palabras){
		for(int i=0;i<palabras.length;i++){
			System.out.print(palabras[i] + " ");
		}
		System.out.println();
	}
}
