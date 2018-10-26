package ejercicios;

public class Ejercicio2 {
	public static void main (String[] args){
	
		double tempYesterday = 9.5;
		double tempToday = 11.2;
		
		if((tempToday - tempYesterday) > 0){
			System.out.println("starts to get hot");
		} else {
			System.out.println("starts to get cold");
		}
		System.out.println("analysis completed");
	}
}
