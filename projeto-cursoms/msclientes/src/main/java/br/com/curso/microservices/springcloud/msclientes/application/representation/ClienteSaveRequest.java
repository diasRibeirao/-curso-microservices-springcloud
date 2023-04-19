package br.com.curso.microservices.springcloud.msclientes.application.representation;

import br.com.curso.microservices.springcloud.msclientes.domain.Cliente;
import lombok.Data;

@Data
public class ClienteSaveRequest {

    private String cpf;
    private String nome;
    private Integer idade;

    public Cliente toModel() {
        return new Cliente(cpf, nome, idade);
    }

}
