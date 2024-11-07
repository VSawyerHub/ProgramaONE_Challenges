package com.example.demo.infra.exception;

public class Validation extends RuntimeException {
    public Validation(String mensagem) {
        super(mensagem);
    }

}
