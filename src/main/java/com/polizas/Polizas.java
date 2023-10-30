package com.polizas;
 
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import com.extensiones.*;

import lombok.*;

@Entity @Getter @Setter
public class Polizas extends Incrementable2 {
	
    
String cedulaTitutar;
String nombreTitutar;

String cedulaBeneficiario;
String nombreBeneficiario;

@ManyToOne( // La referencia se almacena como una relaciï¿½n en la base de datos
        fetch=FetchType.LAZY, // La referencia se carga bajo demanda
        optional=true) // La referencia puede estar sin valor
    @DescriptionsList // Asï¿½ la referencia se visualiza usando un combo
    Sexo sexo; // Una referencia Java convencional

LocalDate fechaDeNacimiento;

@ManyToOne( // La referencia se almacena como una relaciï¿½n en la base de datos
        fetch=FetchType.LAZY, // La referencia se carga bajo demanda
        optional=true) // La referencia puede estar sin valor
    @DescriptionsList // Asï¿½ la referencia se visualiza usando un combo
    Parentezco parentesco; // Una referencia Java convencional

	
}





