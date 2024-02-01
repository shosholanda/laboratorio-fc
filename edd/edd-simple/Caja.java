/*
 * Estructura de datos simple para guardar datos dentro de Cajas.
 * Las cajas solo guardan un dato y otras cajas para poder guardar
 * más información dentro de esas cajas.

 * Podemos hacer cosas raras como que una caja se guarde a sí misma adentro,
 * o que dos cajas se guarden entre ellas, no estamos limitados al mundo real.
 * pero debemos hacer cosas lógicas la mayor parte del tiempo.
 * @author Davidshiro Pichu
 */
public class Caja {

    /* La información a guardar */
    private String texto;
    /* Aparte, una caja puede guardar una caja dentro de sí misma */
    private Caja caja;

    /* Constructor único
     * Se asigna el texto que tendrá dentro la caja.
     */
    public Caja(String texto){
	this.texto = texto;
    }

    /* Meter una caja c adentro de esta caja.
     * por lógica, debe ser una caja no vacía, o nula
     */
    public void meteCaja(Caja c){
	if (c == null)
	    return;
	else
	    this.caja = c;
    }

    /* Representación en cadena de cajas dentro de cajas
     * en la terminal (solo texto)
     */
    public String toString(){
	/* Solo hay texto */
	if (caja == null)
	    return " [" + this.texto + "] \n";
	else {
	    /* Hay cajas dentro de cajas,
	     * Tenemos que entrar a cada caja para "abrirla" y anotar el contenido
	     */
	    String s = " [" + this.texto + "] ";
	    Caja c = caja; //empiezo desde la caja que está adentro de esta caja
	    int nivel = 1; //en qué nivel se encuentra la caja
	    while (c != null){
		s = s + "\n" + agregaEspacios(nivel*3) + "|-->" + " [" + c.texto + "] ";
		c = c.caja;
		nivel++;
	    }
	    s += "\n";
	    return s;
	}
    }

    /**
     * Método privado para agregar espacios a la izquierda y así visualizar
     * el anidamiento de cajas dentro de cajas.
     * LOs métodos privados solo se usan para ayudar a otros métodos de ESTA misma clase.
     */
    private String agregaEspacios(int numEspacios){
	String espacios = "";
	// Agregar x espacios seguidos
	for (int i = 0; i < numEspacios; i++){
	    espacios = espacios + " ";
	}
	return espacios;
    }

}
