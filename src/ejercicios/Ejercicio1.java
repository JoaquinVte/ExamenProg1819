package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int j = (int) (Math.random() * 10);

		for (int i = 0; i < 100; i++) {
			switch (i % j) {
			case 0:
				System.out.println(i + " es multiplo de " + j);
				break;
			default:
				System.out.println(i + " no es multiplo de " + j);
				break;
			}
		}
	}

}
