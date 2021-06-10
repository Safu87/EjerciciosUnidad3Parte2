import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio1Parte2{
	public static void main(String[] args) {
		int num, min = 1, max = 100;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese un numero: ");
		num = scanner.nextInt();

		 for(int i = 1; i <=num; i++) {
        int getRandomValue = ThreadLocalRandom.current().nextInt(min, max) + min;

        if ( getRandomValue % 2 == 0 ){
            System.out.println( getRandomValue + " ES PAR" );
        }
        else{
            System.out.println( getRandomValue + " ES IMPAR" );
        }

		}

		
	}
}