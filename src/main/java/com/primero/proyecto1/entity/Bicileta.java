package com.primero.proyecto1.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Entity
@Table(name = "Bicicletas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder*/

@Entity
@Table(name = "Bicicletas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bicileta {
    @Id //el campo id va a ser mi identificador unico
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //de que manera se genera el id, QUE ME LO HAGA DE UNO EN UNO
    private long id;
    private String tipo; //ruta, mtb, etc
    private String marca;
    private String modelo;
    private int precio;
    private String codigo;
}
