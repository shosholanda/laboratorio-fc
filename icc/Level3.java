/* Imprimir Arreglos como listas */
import java.util.Arrays;
/* Generar números PSEUDO-ALEATORIOS */
import java.util.Random;

/**
 * Nivel 3 de 5. Resuelve en equipo el código con un algoritmo que sea correcto.
 * Solo una persona escribe el código.
 * Para probar el programa, debes compilar y ejecutar con javac y java esta clase.
 * @author Davidshiro Pichu
 */
public class Level3 {
    
    /* Dado un arreglo de números, saber cual número máximo */
	public static int minMax(int[] arreglo){
		return 0;
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
        System.out.println("El elemento máximo en el siguiente arreglo es:");
		System.out.println(Arrays.toString(arr));
		System.out.println(minMax(arr)); //Depende del resultado
        System.out.println();
		
		/* Repeticion */
		String s = "El rey de parangaricutirimicuaro se quiere desparangaructirimicuarizar, el que lo desparangaricutirimicuarize un buen desparangaricutirimicuarizador será.";
		
		System.out.println(s);
		System.out.println("El caracter que más se repite es: " + String.valueOf(repeticion(s))); //r
		System.out.println();

		/* Promedio */
		System.out.println("El promedio de \n" + Arrays.toString(arr) + "\nes: " + promedio(arr)); // depende
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("El promedio de \n" + Arrays.toString(arr) + "\nes: " + promedio(arr)); // 5.5
		
	}
}
