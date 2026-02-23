package com.projeto.factory;

class PagamentoPix implements MetodoPagamento {
	@Override
	public void processarPagamento(double valor) {
	    String mensagem = String.format("Processando pagamento de R$ %.2f via PIX...", valor);
	    System.out.println(mensagem);
	}
}