/**
 * 
 */
package dam_refactorizacion;

/**
 * Clase que almacena los parametros y funcionalidad de la cuenta
 */
public class CCuenta {
	/*Variable que almacena el nombre del titular de la cuenta*/
    private String nombre;
    /*Variable que almacena el numero de cuenta*/
    private String cuenta;
    /*Variable que almacena el saldo disponible*/
    private double saldo;
    /*Variable que almacena el tipo de interes de la cuenta*/
    private double tipoInteres;
    /**
     * Constructor vacio de la clase cuenta
     */
    public CCuenta()
    {
    }
    /**
     * Constructor de la clase cuenta
     * @param nom: nombre del titular
     * @param cue: numero de cuenta
     * @param sal:saldo disponible
     * @param tipo:tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * Metodo publico que informa del saldo
     * @return: saldo disponible
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Metodo publico que me permite aumentar la cantidad indicada al saldo
     * @param cantidad: valor que quiero sumar
     * @throws Exception: excepcion para controlar cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Metodo publico que me permite disminuir el sueldo por la cantidad
     * @param cantidad: valor que quiero restar
     * @throws Exception: excepcion para controlar cantidades negativas
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**
     * @return nombre
     */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo que asigna al nombre un nuevo nombre
	 * @param nombre: variable que guarda el nombre del usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
     * @return cuenta
     */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Metodo que asigna a cuenta una nueva cuenta
	 * @param cuenta: variable que guarda el numero de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
     * @return saldo
     */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Metodo que asigna al saldo un nuevo saldo
	 * @param saldo: variable numerica que guarda el saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
     * @return tipoInteres
     */
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * Metodo que asigna al tipoInteres un nuevo tipoInteres
	 * @param tipoInteres: variable numerica que guarda el tipo de interes
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

}
