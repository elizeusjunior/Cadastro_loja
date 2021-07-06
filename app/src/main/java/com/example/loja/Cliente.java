package com.example.loja;

import java.io.Serializable;

public class Cliente implements Serializable {
    //atributos
    private String nome, cpf, telefone;

    //construtor

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    //getters
    public String getNome() {
        return nome;
    }
    //métodos
    public String mostrarCliente(){
        return "\nNome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone;
    }
}
