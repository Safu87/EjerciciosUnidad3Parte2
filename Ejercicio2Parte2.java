import java.util.*;

public class Ejercicio2Parte2{
	public static void main(String[] args) {
		int num;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		num = scanner.nextInt();

		for ( int i = num ; i >= 1 ; i--) {
			System.out.println(i);
		}

	}
}