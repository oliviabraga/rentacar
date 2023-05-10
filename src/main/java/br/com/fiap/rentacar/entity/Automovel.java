package br.com.fiap.rentacar.entity;

import br.com.fiap.rentacar.enums.TipoCombustivel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Automovel {
    private Long id;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private TipoCombustivel tipoCombustivel;
    private Modelo modelo;
    private List<Acessorio> acessorios;
}
