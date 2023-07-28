package com.bancos;

import java.math.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;

import com.extensiones.*;

import lombok.*;

@View(members= // Esta vista no tiene nombre, por tanto será la vista usada por defecto
"  Datos [ codigoDelProducto; nombreComercial; " +
" ] ;" +
"  Valores [ precioDeVenta; " +
" ] ;" +
"  Tipo [ cuentaAsociada;" +
" ]; " 
)
@Entity  // Esto marca la clase Cliente como una entidad
@Getter @Setter // Esto hace los campos a continuación públicamente accesibles
public class CuentasMovimientos extends Incrementable4 {
	
	@Column(length = 25)
	@DefaultValueCalculator(ConsecutivoCuentas.class) // A�o actual	//@ReadOnly // El usuario no puede modificar el valor
	@ReadOnly
	@SearchKey
	Double codigoDelProducto;	

    @Column(length=255) // La longitud de columna se usa a nivel UI y a nivel DB
    String nombreComercial;
    
    @Min(0)
    BigDecimal precioDeVenta;    

    @ManyToOne( // La referencia se almacena como una relación en la base de datos
            fetch=FetchType.LAZY, // La referencia se carga bajo demanda
            optional=true) // La referencia puede estar sin valor
        @DescriptionsList // Así la referencia se visualiza usando un combo
       Cuentas cuentaAsociada; // Una referencia Java convencional

        
}