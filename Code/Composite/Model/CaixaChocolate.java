package Model;

import Component.Produto;

public class CaixaChocolate implements Produto
{
    @Override
    public void count()
    {
        System.out.println("Foram selecionadas 2 caixas de chocolate.");
    }
    @Override
    public void sumPrice()
    {
        System.out.println("O valor total das caixas de chocolate é de R$ 20,00.");
    }
}