/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;


    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método para asignar el nombre del cliente
     * @param nom nombrel del cliente
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * Método para obtener nombre del cliente
     * @return nombre cliente
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método para obtener el saldo de la cuenta
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para obtener número de cuenta
     * @return núm de cuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }
    
    /**
     * Método para ingreso de dinero
     * @param cantidad de dinero a ingresar
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero
     * @param cantidad de dinero a retirar
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


   

    
    // ENCAPSULACIÓN GETTERS Y SETTERS
    
    /**
     * Getter de nombre
     * @return nombre cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de nombre
     * @param nombre de cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter de cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter de saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter de saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Getter de tipo de interés
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter de tipo de interés
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
