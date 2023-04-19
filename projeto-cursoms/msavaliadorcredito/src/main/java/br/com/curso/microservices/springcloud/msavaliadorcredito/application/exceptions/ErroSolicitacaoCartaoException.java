package br.com.curso.microservices.springcloud.msavaliadorcredito.application.exceptions;

public class ErroSolicitacaoCartaoException extends RuntimeException{
    public ErroSolicitacaoCartaoException(String message) {
        super(message);
    }
}