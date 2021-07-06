package com.example.loja;

import java.io.Serializable;

public class Venda implements Serializable {
    //atributos
    private String produto, quantidade, cliente;

    //construtor
    public Venda(String produto, String quantidade, String cliente) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.cliente = cliente;
    }

    //getters
    public Venda(String produto) {
        this.produto = produto;
    }

    //métodos
    public String mostrarVenda(){
        return "\nProduto: " + produto + "\n Quantidade: " + quantidade + "\nCliente: " + cliente;
    }
}
