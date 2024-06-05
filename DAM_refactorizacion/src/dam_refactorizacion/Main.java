/**
 * 
 */
package dam_refactorizacion;

/**
 * Clase que almacena la funcionalidad principal de CCuenta
 * @author ClaseDam
 * @since 3-9-2023
 * @version 1.18 
 */
public class Main {

	/**
	 * metodo principal
	 * @param args parametros generales del main
	 */
	public static void main(String[] args) {
		 CCuenta miCuenta;
		 float cantidad=0.0f;;
	        double saldoActual;

	        miCuenta = new CCuenta("Beatriz Perez","1000-2365-85-1230456789",200,0);
	        saldoActual = miCuenta.estado();
	        System.out.println("El saldo actual es"+ saldoActual );
	        
	        
	        miCuenta(miCuenta, cantidad);
	    }
	/**
	 * Metodo para controlar la funcionalidad de clase cuenta
	 * @param miCuenta: variale que almacena los valores del ojeto cuenta
	 * @param cantitdad: variable numerica que guarda la cantidad a extraer
	 */
	public static void miCuenta(CCuenta miCuenta, float cantitdad) {
		try {
		    miCuenta.retirar(2300);
		} catch (Exception e) {
		    System.out.print("Fallo al retirar");
		}
		try {
		    System.out.println("Ingreso en cuenta");
		    miCuenta.ingresar(695);
		} catch (Exception e) {
		    System.out.print("Fallo al ingresar");
		}
	}

	}


