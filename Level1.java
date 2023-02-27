/** NIVEL 1 DE 5
 * 
 * RESUELVE EN EQUIPO LOS SIGUIENTES EJERCICIOS
 */
//Generar cosas pseudoaleatorias
import java.util.Random;
//Imprimir arreglos bomnitos
import java.util.Arrays;

public class Level1{
	
	/* Dado dos números a, b nos da la cantidad de números que hay
	   entre a y b. */
	public static int rango(int a, int b){
		return 0;
	}
	
	/* Dado un arreglo de tamaño n, encontrar el elemento que está en la posición n, o n-1*/
	public static Object mitad(Object[] arreglo){
		return null;
	}
	
	/* Dado un número n>0, guardar todos los números de 0 a n en un arreglo */
	public static int[] rango(int n){
		return new int[0];
	}
	
	/* Dado la base y la altura, calcular el área de un triángulo */
	public static double area(int base, int altura){
		return 0;
	}
	
	/* Dado el radio de una esfera, calcular el volumen */
	public static double esfera(int radio){
		return 0;
	}
	
	/* Extra: Reduce los ejercicios 1,2, 4 y 5 a una sola línea */
	
	public static void main (String[] args){
		Random r = new Random();
		int a = r.nextInt(1000);
		int b = r.nextInt(1000);
		/* Rango */
		System.out.println(String.format("Rango entre %d y %d: ",a, b) + rango(a, b));
		
		Object[] arr = new Object[a];
		for (int i = 0; i < a; i++){
			arr[i] = r.nextInt();
		}
		/* Mitad */
		System.out.println("La mitad del arreglo es: " + mitad(arr));
		
		/* Arreglo */
		System.out.println(String.format("El arreglo de números entre 0 y %d\n", b) + Arrays.toString(rango(b)));
		
		/* Area triángulo */
		System.out.println(String.format("Area del triángulo (%d, %d)\t%d", a, b, + area(a, b)));
		
		/* Volumen esfera */
		System.out.println("Volumen de una esfera de tamaño " + a + ": " + esfera(a));
	}
	
}