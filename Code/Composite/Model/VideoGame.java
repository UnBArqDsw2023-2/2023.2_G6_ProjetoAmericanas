package Model;

import Component.Produto;

public class VideoGame implements Produto
{
    @Override
    public void count()
    {
        System.out.println("Foram selecionados 2 videogames.");
    }
    @Override
    public void sumPrice()
    {
        System.out.println("O valor total dos videogames é de R$ 2000,00.");
    }
}
