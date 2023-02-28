/** NIVEL 4 DE 5
 * 
 * RESUELVE EN EQUIPO LOS SIGUIENTES EJERCICIOS
 */
public class Level4 {
	
	/* Dar la tabla de verdad de la proposión: A && (B || C) 
	   guardar todas las posibles combinaciones en un string.*/
	public static String tabla(){
		boolean[] valores = {true, false};
		String s = "| A | B | C | A && (B || C) |\n";
		//código
		return s;//+ "| 0 | 0 | 0 |		0	    |\n";
	}
	
	/* Dada una cadena, decir si es palíndromo o no, ignorando los espacios, mayúsculas, minúsculas o saltos de línea.*/
	public static boolean palindromo(String cadena){
		return false;
	}
	
	/* Extra: Propón una cadena que sea palíndromo de al menos 10 letras y no sea anitalavalatina */
	
	public static void main(String[] args){
		String s = "Luz azul";
		System.out.println(String.format("%s es palíndromo? %b", s, palindromo(s)));
		s = "Anita la gorda lagartona no traga la droga latina";
		System.out.println(String.format("%s es palíndromo? %b", s, palindromo(s)));
		
		System.out.println("La tabla de verdad de A && (B || C) es: \n" + tabla());
	}
	
	
}