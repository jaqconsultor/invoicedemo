package com.yourcompany.farmacia.model;
 
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.extensiones.*;

import lombok.*;


@Entity @Getter @Setter
/*@View(
members="descripcion,listaDeInventario" // Muestra únicamente numero y nombre en la misma línea
)*/
@Tab(name="TipoDeProductos",baseCondition = "${esServicio} = false")
@Tab(name="TipoDeServicios",baseCondition = "${esServicio} = true")
public class TipoDeInventario extends Incrementable2 {
	
	@ListProperties("id, descripcion, codigoDelProducto, principioActivo, nombreComercial, descripcionDelProducto, codigoDeBarra, presentacion, dosificacion, minima, maxima, existencia, precioDeVenta")
    @OneToMany(mappedBy="tipoDeInventario")
    Collection<CargaDeInventario> listaDeInventario;
	
    //@OnChange(MostrarOcultarCrearFactura.class) // A�ade esto
	boolean esServicio;
	
    //boolean esPositivo;
    
}





