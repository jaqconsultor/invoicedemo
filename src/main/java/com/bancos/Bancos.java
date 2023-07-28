package com.bancos;
 
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.extensiones.*;

import lombok.*;

@Entity @Getter @Setter
public class Bancos extends Incrementable2 {
	
	@ListProperties("id, descripcion, codigoDelProducto, nombreComercial, precioDeVenta")
    @OneToMany(mappedBy="bancoAsociado")
    Collection<Cuentas> listaDeCuentas;
	
    //@OnChange(MostrarOcultarCrearFactura.class) // A�ade esto
	boolean esServicio;
    
}





