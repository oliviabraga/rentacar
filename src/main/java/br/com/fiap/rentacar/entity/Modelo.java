package br.com.fiap.rentacar.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Modelo {

    private Long id;
    private String nome;
    private Double potencia;
    private Marca marca;

}
