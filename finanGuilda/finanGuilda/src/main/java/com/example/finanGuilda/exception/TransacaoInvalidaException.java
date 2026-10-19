package br.com.finanGuilda.exception;

public class TransacaoInvalidaException extends RuntimeException {
    public TransacaoInvalidaException(String mensagem) {
        super(mensagem);
    }
}