
/**
 * Nivel 2 de 5. Resuelve en equipo el código con un algoritmo que sea correcto.
 * Solo una persona escribe el código.
 * Para probar el programa, debes compilar y ejecutar con javac y java esta clase.
 * @author Davidshiro Pichu
 */
public class Level2 {
    
    /* Dado un número n > 0, decir si es primo o no 
     * Hint: usa el método de abajo
    */
	public static boolean esPrimo(int n){
		return false;
	}

    /**
     * Nos dice si a es dividido por b sin dejar punto decimal.
     * Ej. 2/2 = 1 (true). 2/3 = 0.666__ (false)
     */
    public static boolean dividido(int a, int b){
        return true;
    }

    /**
     * Nos dice de qué tipo es el objeto que le pasamos
     * Hint: usa el operador instanceof
     */
    public static String tipo(Object o){
        return "Object";
    }

    /**
     * Concatena n veces la letra c en una misma cadena.
     */
    public static String duplica(int n, char x){
        return "";
    }

    /**
     * Punto extra: crea un switch para el método tipo
     */
    public static void main(String[] args) {
        /* Pruebas */
        int a = 1998;
        int b = -2309;

        /* Primicidad */
        System.out.println("Es primo 3?: " + esPrimo(3)); //Si
        System.out.println("Es primo 15485863?: " + esPrimo(15485863)); // Sí
		System.out.println("Es primo 13297431?: " + esPrimo(13297431)); // No

        /* dividido */
        System.out.println("8 divide enteramente a 4? " + Level1.divide(8, 4) + " -" + dividido(8, 4)); //true
        System.out.println("231 divide enteramente a 2? " + Level1.divide(231, 2) + " -" + dividido(231, 2)); //true
        System.out.println("3 divide enteramente a 10? " + Level1.divide(3, 10) + " -" + dividido(3, 10)); //false
        System.out.println();

        /* Tipo */
        Object o = new Object();
        String s = "Holaaaa";
        double d = Math.PI;
        boolean i = Math.E > 0;
        char c = '0';

        System.out.println(s + " es de tipo " + tipo(s)); // String
        System.out.println("" + o + " es de tipo: " + tipo(o)); //Object
        System.out.println("" + a + " es de tipo: " + tipo(a)); //Integer
        System.out.println("" + d + " es de tipo: " + tipo(d)); //Double
        System.out.println("" + c + " es de tipo: " + tipo(c)); //Char
        System.out.println("" + i + " es de tipo: " + tipo(i));//Boolean
        System.out.println();

        /* Duplica */
        System.out.println("Duplicar 4 veces la letra b: " + duplica(4,'b'));
        System.out.println(duplica(100, 'a'));
        System.out.println("Se acabó el semestre :)");
    }
}
