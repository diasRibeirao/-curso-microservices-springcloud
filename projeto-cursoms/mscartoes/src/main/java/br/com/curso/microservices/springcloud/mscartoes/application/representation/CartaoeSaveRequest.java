package br.com.curso.microservices.springcloud.mscartoes.application.representation;

import br.com.curso.microservices.springcloud.mscartoes.domain.BandeiraCartao;
import br.com.curso.microservices.springcloud.mscartoes.domain.Cartao;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartaoeSaveRequest {

    private String nome;
    private BandeiraCartao bandeira;
    private BigDecimal renda;
    private BigDecimal limite;

    public Cartao toModel(){
        return new Cartao(nome, bandeira, renda, limite);
    }

}
