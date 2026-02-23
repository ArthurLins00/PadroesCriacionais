package com.projeto.factory;

class PagamentoBoleto implements MetodoPagamento {
	@Override
	public void processarPagamento(double valor) {
	    String mensagem = String.format("Processando pagamento de R$ %.2f via Boleto...", valor);
	    System.out.println(mensagem);
	}
}