package com.java;

public class Cliente implements Observer {
    private String nome;
    private Canal canal = new Canal();

    public Cliente (String nome){
        super();
        this.nome = nome;
    }

    @Override
    public void update(){
        System.out.println("Senhor(a), " + nome +" um novo livro chegou " + canal.titulo);
    }

    @Override
    public void notificarCliente(Canal ch){
        canal = ch;
    }
}
