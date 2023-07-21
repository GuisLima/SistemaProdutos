package db;

import java.util.List;
import java.util.ArrayList;
import sistema.Produtos;

public class ProdutoDb {
    private List<Produtos> produtosList = new ArrayList<>();

    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void addNovoProduto(Produtos produto) {
        produtosList.add(produto);
    }

}