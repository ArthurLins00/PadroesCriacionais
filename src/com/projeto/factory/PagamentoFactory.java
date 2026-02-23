package com.projeto.factory;

public class PagamentoFactory {
    public static MetodoPagamento criarPagamento(String tipo) {
        if (tipo.equalsIgnoreCase("PIX")) {
            return new PagamentoPix();
        } else if (tipo.equalsIgnoreCase("BOLETO")) {
            return new PagamentoBoleto();
        }
        throw new IllegalArgumentException("Forma de pagamento não suportada.");
    }
}