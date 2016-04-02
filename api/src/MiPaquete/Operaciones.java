package MiPaquete;

/**
 * Esta es la clase Operaciones que permite realizar operaciones básicas numericas
 * como son la suma,resta y multiplicacion.
 * 
 * @author (Ander Navarro) 
 * @version (1.0.0)
 * @since   JDK1.0
 * @see "Operaciones basicas"
 * @serial SMI constante con valor 5322.234 es de tipo decimal
 */

public class Operaciones {
	
	private int a;
    private int b;
    static final double SMI = 5322.234;
    
    /**
     * Constructor de la clase Operaciones 
     * @param a variable que actua como numero entero 
     * @param n variable que actua como numero entero   
     */   
    public Operaciones(int a,int b){
    	this.a = a;
    	this.b = b;
   	}
    
    /**
     * Constructor de la clase Operaciones inicializa todos los valores a 0
     */  
    public Operaciones (){
    	int a = 0;
    	int b = 0;
    }
    
    /**
     * este metodo nos permite realizar la suma de dos numeros enteros
     * @return la suma de ambos numeros
     * @since   1.0
     * @throws ArithmeticException si el resultado no es entero
     */
    
    public int calculaSuma(){
    	return a+b;
    }
    
    /**
     * este método nos permite realizar la resta de dos numeros enteros
     * @return la suma de ambos numeros
     * @since   1.0
     * @see "Orden de prieridad en la resta"
     * @exception ArithmeticException si el resultado no es entero
     */
    
    public int calculaResta(){
    	return a-b;
    }
    
    /**
     * este método nos permite realizar la multiplicacion de tres numeros 
     * @return la suma de ambos numeros
     * @since   1.0
     * @param parametro-otro numero mas con el cual haremos la multiplicacion
     * @throws ArithmeticException si el resultado no es un int
     */ 
    public int multiplicaNumero(int parametro){
    	return a*b*parametro;
    }
    
    
}