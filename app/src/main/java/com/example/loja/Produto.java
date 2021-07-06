package com.example.loja;

import java.io.Serializable;

public class Produto implements Serializable {
    //atributos
    private String produto, quantidade;

    //constrututor

    public Produto(String produto, String quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    //getters

    public String getProduto() {
        return produto;
    }
    //métodos
    public String mostrarProduto(){
        return "\nProduto: " + produto + "\nQuantidad: " + quantidade;
    }
}
