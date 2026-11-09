package org.example.mediator;

public class Produto {

    private String nome;
    private Vendedor vendedor;

    public Produto(String nome, Vendedor vendedor){
        this.nome = nome;
        this.vendedor = vendedor;
    }

    public String getNome() {
        return nome;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
}
