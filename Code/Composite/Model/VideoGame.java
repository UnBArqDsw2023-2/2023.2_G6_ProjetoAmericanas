package Model;

import Component.Produto;

public class VideoGame implements Produto
{
    @Override
    public void count()
    {
        System.out.println("Foram selecionados 2 videogames.");
    }
}
