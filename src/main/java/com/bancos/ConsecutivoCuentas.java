package com.bancos; // En el paquete 'calculadores'
 
import javax.persistence.*;

import org.openxava.calculators.*; // Para usar 'ICalculator'
import org.openxava.jpa.*;
 
public class ConsecutivoCuentas implements ICalculator {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Object calculate() throws Exception {
    	Double numero;
        Query query = XPersistence.getManager().createQuery(
                "select max(f.codigoDelProducto) from " +
                " Cuentas " + 
                " f ");
            Double ultimoNumero = (Double) query.getSingleResult();
            numero = ultimoNumero == null ? 1 : ultimoNumero + 1;
        return numero;
    }
}