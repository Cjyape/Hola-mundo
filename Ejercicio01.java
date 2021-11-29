package tarea1;

/**
 * Provincias de Andalucía.
 * @author : Cristian J. Valdivieso Valenzuela
 */
public class Ejercicio01 {
    
    // Definición del enum
    public enum prov_andalucia{ALMERIA,CADIZ,CORDOBA,GRANADA,HUELVA,JAEN,MALAGA,SEVILLA}

    // Programa principal
    public static void main(String[] args) {
          
        System.out.println ("PROVINCIAS DE ANDALUCÍA");
        System.out.println ("-----------------------");
        System.out.println ("Provincia 1 : "+prov_andalucia.ALMERIA);
        System.out.println ("Provincia 2 : "+prov_andalucia.CADIZ);
        System.out.println ("Provincia 3 : "+prov_andalucia.CORDOBA);
        System.out.println ("Provincia 4 : "+prov_andalucia.GRANADA);
        System.out.println ("Provincia 5 : "+prov_andalucia.HUELVA);
        System.out.println ("Provincia 6 : "+prov_andalucia.JAEN);
        System.out.println ("Provincia 7 : "+prov_andalucia.MALAGA);
        System.out.println ("Provincia 8 : "+prov_andalucia.SEVILLA);
        System.out.println (" ");
        
        // Vamos mostrando cada uno de los posibles valores del enum
        // (no hace falta estructurar el programa en entrada/procesamiento/salida)

    }
    
}
