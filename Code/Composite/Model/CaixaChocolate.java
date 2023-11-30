package Model;

import Component.Produto;

public class CaixaChocolate implements Produto
{
    @Override
    public void count()
    {
        System.out.println("Foram selecionadas 2 caixas de chocolate.");
    }
}