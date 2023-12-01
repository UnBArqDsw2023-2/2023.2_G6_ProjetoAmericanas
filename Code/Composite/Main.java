import Component.Produto;
import Composta.Produtos;
import Model.*;

public class Main {
    public static void main (String[] args){
        Produtos produtos = new Produtos();
        Produto caixaChocolate = new CaixaChocolate();
        Produto videoGame = new VideoGame();
        Produto celular = new Celular();
        produtos.add(caixaChocolate);
        produtos.add(videoGame);
        produtos.add(celular);
        produtos.count();
        produtos.sumPrice();
        System.out.println("-------------------removing-------------------");
        produtos.remove(videoGame);
        produtos.count();
        produtos.sumPrice();
    }
}