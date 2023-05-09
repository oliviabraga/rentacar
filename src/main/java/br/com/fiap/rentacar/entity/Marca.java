package br.com.fiap.rentacar.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data --> Substitui o @Getter e @Setter
@Setter
@Getter
public class Marca {

    private Long id;
    private String nome;

}
