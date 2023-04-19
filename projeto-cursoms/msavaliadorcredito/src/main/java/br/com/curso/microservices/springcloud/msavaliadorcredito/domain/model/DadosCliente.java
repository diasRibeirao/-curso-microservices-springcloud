package br.com.curso.microservices.springcloud.msavaliadorcredito.domain.model;

import lombok.Data;

@Data
public class DadosCliente {
    private Long id;
    private String nome;
    private Integer idade;
}
