package com.projeto.main;

import com.projeto.singleton.Carrinho;
import com.projeto.factory.MetodoPagamento;
import com.projeto.factory.PagamentoFactory;

public class Principal {
    public static void main(String[] args) {
        
        System.out.println("=== TESTANDO SINGLETON (CARRINHO) ===");

        Carrinho meuCarrinho = Carrinho.getInstancia();
        meuCarrinho.adicionarProduto("Notebook Acer");
        meuCarrinho.adicionarProduto("Mouse HyperX");
        
        Carrinho outroAcessoAoCarrinho = Carrinho.getInstancia();
        outroAcessoAoCarrinho.exibirProdutos();
        
        System.out.println("\n=== TESTANDO FACTORY METHOD (PAGAMENTO) ===");
        double valorTotal = 3500.00;
        
        MetodoPagamento pagamento = PagamentoFactory.criarPagamento("PIX");
        pagamento.processarPagamento(valorTotal);
        
        MetodoPagamento pagamentoBoleto = PagamentoFactory.criarPagamento("BOLETO");
        pagamentoBoleto.processarPagamento(500.00);
        
        MetodoPagamento pagamentoCredito = PagamentoFactory.criarPagamento("CREDITO");
        pagamentoCredito.processarPagamento(1000.00);
    }
}