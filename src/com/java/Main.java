package com.java;

public class Main {

    public static void main(String[] args) {

        Canal t1 = new Canal();
        Cliente s1 = new Cliente("jose");
        Cliente s2 = new Cliente("maria");
        Cliente s3 = new Cliente("carlos");

        t1.cliente(s1);
        t1.cliente(s2);
        t1.cliente(s3);

        s1.notificarCliente(t1);
        s2.notificarCliente(t1);
        s3.notificarCliente(t1);

        t1.notificarProduto("Um novo livro chegou! O nome do vento, custando apenas 40R$.");

    }
}
