package br.com.curso.microservices.springcloud.mscartoes.application;

import br.com.curso.microservices.springcloud.mscartoes.domain.ClienteCartao;
import br.com.curso.microservices.springcloud.mscartoes.infra.repository.ClienteCartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {

    private final ClienteCartaoRepository repository;

    public List<ClienteCartao> listCartoesByCpf(String cpf){
        return repository.findByCpf(cpf);
    }
}
