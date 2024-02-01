/*
 * Clase main para ejecutar cosas con cajas.
 */
public class Main {

    /* El abc de Java */
    public static void main (String [] args){
	Caja c1 = new Caja("Hola mundo");
	Caja c2 = new Caja("Hola, soy la segunda caja");
	
	System.out.println(c1);
	System.out.println(c2);

	c1.meteCaja(c2);
	System.out.println(c1);

	Caja c3 = new Caja("Davidshiro Pichu");
	c2.meteCaja(c3);
	System.out.println(c1.toString());
	/*
	 * Juega con el código!
	 * Cómo puedes añadir una caja c4 adentro de c3?
	 * Qué sucede si guardo c1 dentro de ella misma?
	 * Qué sucede si guardo dentro de c1 a c2, y dentro de c2 a c1?
	 * Cómo es que puedo acceder a toda la información desde c1? 
	 */
    }
}
