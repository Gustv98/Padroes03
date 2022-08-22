package com.java;

import java.util.ArrayList;
import java.util.List;

public class Canal implements Subject {
    List<Cliente> qtd = new ArrayList<>();
    public String titulo;

    @Override
    public void cliente(Cliente sub){
        qtd.add(sub);
    }


    @Override
    public void notificar(){
        for(Cliente sub : qtd){
            sub.update();
        }
    }

    @Override
    public void notificarProduto(String titulo){
        this.titulo = titulo;
        notificar();
    }
}
