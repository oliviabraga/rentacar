package br.com.fiap.rentacar.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@Data --> Substitui o @Getter e @Setter
public class Marca {

    private Long id;
    private String nome;

}
