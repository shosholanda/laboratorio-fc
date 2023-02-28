/** NIVEL 2 DE 5
 * 
 * RESUELVE EN EQUIPO LOS SIGUIENTES EJERCICIOS
 */
public class Level2{
	
	/* Dado un número n > 0, decir si es primo o no */
	public static boolean esPrimo(int n){
		return false;
	}
	
	/* Ver si un número n >0 es divisible enteramente (no deja residuo) por x SIN UTILIZAR el operador / ó * */
	public static boolean divide(int num, int div){
		return false;
	}	
	
	/* Dado una cadena s, decir si es un correo electrónico o no */
	public static boolean esCorreo(String s){
		return false;
	}
	
	/* Pasar de años a minutos */
	public static int añosMinutos(int años){
		return 0;
	}
	
	/* Extra: Escribe en una sola línea los ejercicios 3 y 4 */
	
	public static void main (String[] args){
		System.out.println("Es primo?: " + esPrimo(15485863));
		System.out.println("Es primo?: " + esPrimo(13297431));
		
		System.out.println("Es divisible 70/7?\t" + divide(70, 7));
		System.out.println("Es divisible 120,932/98?\t" + divide(120932, 98));
		
		/* Correo */
		System.out.println("Es correo?: " + esCorreo("davidshiro.pichu@ciencias.unam.mx"));
		System.out.println("Es correo?: " + esCorreo("a@b.c"));
		System.out.println("Es correo?: " + esCorreo("@"));
		
		System.out.println("24 años en minutos son: " + añosMinutos(24));
		System.out.println("1 siglo en minutos son: " + añosMinutos(100));
	}
	
}