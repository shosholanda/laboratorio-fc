
/**
 * Nivel 1 de 5. Resuelve en equipo el código con un algoritmo que sea correcto.
 * Solo una persona escribe el código.
 * Para probar el programa, debes compilar y ejecutar con javac y java esta clase.
 * @author Davidshiro Pichu
 */
public class Level1 {
    
    /**
     * Divide 2 números reales de la forma a/b. La divisón debe estar definida.
     */
    public static double divide(double a, double b){
        return 0;
    }

    /**
     * Nos dice cuántas letras tiene la cadena s.
     */
    public static int tamaño(String s){
        return 0;
    }

    /**
     * Dado el radio de una esfera, nos da su volumen.
     */
    public static double esfera(double radio){
        return 0;
    }

    /**
     * Nos dice cuántos números naturales hay entre a y b. 
     */
    public static int rango(int a, int b){
        return -1;
    }

    /**
     * Nos da el numero más grande entre a y b. No puedes usar Math.max()
     */
    public static int max(int a, int b){
        return 0;
    }

    /**
     * Punto extra: reduce el código de los métodos a una sola línea.
     */
    public static void main(String[] args) {
        /* Pruebas */
        int a = 10;
        int b = 5;

        /* Divide */
        System.out.println("Pruebas divide");
        System.out.println("" + a + "/" + b + " = " + divide(a, b)); // 2.0
        System.out.println("" + a + "/" + b + " = " + divide(-5, 4)); // -1.25
        System.out.println("" + a + "/" + b + " = " + divide(Integer.MAX_VALUE, 0)); //No debe tronar el programa
        System.out.println();


        /* Tamaño */
        System.out.println("Pruebas tamaño");
        String s = "Parangaricutirimicuaro";
        System.out.println(s);
        System.out.println(tamaño(s)); // 22
        s = "0123456789";
        System.out.println(s);
        System.out.println(tamaño(s)); // 10
        System.out.println();

        /* esfera */
        System.out.println("Pruebas volumen de la esfera");
        double r = 5/3;
        System.out.println("Volumen de una esfera de radio " + r + " es: " + esfera(r));
        r = -1;
        System.out.println("Volumen de una esfera de radio " + r + " es: " + esfera(r));
        System.out.println();
        
        /* Rango */
        System.out.println("Pruebas de Rango");
        System.out.println("Hay " + rango(a, b) + " números entre " + a + " y " + b); // 5
        System.out.println("Hay " + rango(-a, -b)+ " números entre " + (-a) + " y " + (-b)); // 5
        System.out.println("Hay " + rango(0, 99) + " números entre 0 y 99" ); // 100
        System.out.println("Hay " + rango(-10, 10) + " números entre -10 y 10"); // 20
        System.out.println();

        /* Max */
        System.out.println("El número más grande entre " + a + " y " + b + " es: " + max(a, b)); // a
        System.out.println("El número más grande entre " + (-a) + " y " + b + " es: " + max(a, b)); // b
        System.out.println("El número más grande entre " + a + " y " + (-b) + " es: " + max(a, b)); //a
        System.out.println("El número más grande entre " + (-a) + " y " + (-b) + " es: " + max(a, b)); // b
    }
}
