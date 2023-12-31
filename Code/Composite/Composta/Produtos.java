package Composta;

import java.util.ArrayList;
import java.util.List;
import Component.Produto;

public class Produtos implements Produto {
    private List<Produto> produtos = new ArrayList<Produto>();

    public void add(Produto produto) {
        produtos.add(produto);
    }
    public void remove(Produto produto) {
        produtos.remove(produto);
    }
    @Override
    public void count() {
        for (Produto produto : produtos) {
            produto.count();
        }
    }
    @Override
    public void sumPrice() {
        for (Produto produto : produtos) {
            produto.sumPrice();
        }
    }
}
