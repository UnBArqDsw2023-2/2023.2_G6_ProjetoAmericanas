package Model;

import Component.Produto;


public class Celular implements Produto
{
    @Override
    public void count()
    {
        System.out.println("Foram selecionados 2 celulares.");
    }
    @Override
    public void sumPrice()
    {
        System.out.println("O valor total dos celulares é de R$ 5000,00.");
    }
}