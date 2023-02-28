/** NIVEL 3 DE 5
 * 
 * RESUELVE EN EQUIPO LOS SIGUIENTES EJERCICIOS
 */
//Generar cosas pseudoaleatorias
import java.util.Random;
//Imprimir arreglos bomnitos
import java.util.Arrays;

public class Level3 {
	
	/* Dado un arreglo de números, saber cual es el mínimo y máximo */
	public static String minMax(int[] arreglo){
		return null;
	}
	
	/* Encontrar el carácter que más se repite de una cadena */
	public static char repeticion(String cadena){
		return (char)0;
	}
	
	/* Dado un arreglo de números, encontrar promedio */
	public static double promedio(int[] arreglo){
		return 0;
	}
	
	/* Extra: Reutiliza el código del método 1 para el método 2 */
	
	public static void main(String[] args){
		Random r = new Random();
		/* Crea un arreglo de números aleatorios */
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++){
			arr[i] = r.nextInt(1000);
		}
		
		/* Min maxwell */
		System.out.println(minMax(arr));
		System.out.println(Arrays.toString(arr));
		
		/* Repeticion */
		String s = "El rey de parangaricutirimicuaro se quiere desparangaructirimicuarizar, el que lo desparangaricutirimicuarize un buen desparangaricutirimicuarizador será.";
		
		System.out.println(s);
		System.out.println("El caracter que más se repite es: " + String.valueOf(repeticion(s)));
		
		/* Promedio */
		System.out.println("El promedio de " + Arrays.toString(arr) + " es: " + promedio(arr));
		
	}
	
}