package com.projeto.singleton;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private static Carrinho instancia;
    private List<String> produtos;

    private Carrinho() {
        produtos = new ArrayList<>();
    }

    public static Carrinho getInstancia() {
        if (instancia == null) {
            instancia = new Carrinho();
        }
        return instancia;
    }

    public void adicionarProduto(String produto) {
        produtos.add(produto);
        System.out.println(produto + " adicionado ao carrinho.");
    }

    public void exibirProdutos() {
        System.out.println("Produtos no carrinho: " + produtos);
    }
}