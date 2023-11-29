import caixachocolate.CaixaChocolate;
import videogame.VideoGame;
import celulares.Celular;
import code.composite.component.Produto;
import code.composite.composite.Composite;
import code.composite.composta.Produtos;

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
        produtos.remove(videoGame);
        produtos.count();
    }
}