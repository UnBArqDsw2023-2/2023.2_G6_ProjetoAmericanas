package Model;

import Component.Produto;


public class Celular implements Produto
{
    @Override
    public void count()
    {
        System.out.println("Foram selecionados 2 celulares.");
    }
}