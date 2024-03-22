package alurasenac.farmacia.test;

import alurasenac.farmacia.dao.Conexao;
import alurasenac.farmacia.dao.ProdutoDao;
import alurasenac.farmacia.produto.Produto;
import alurasenac.farmacia.service.ProdutoService;

import java.sql.Connection;

public class TesteCadastroProduto {


    public static void main(String[] args) {
        ProdutoDao produtoDao = new ProdutoDao(Conexao.conectar(), new ProdutoService());


        Produto produto = new Produto();
        produto.setNome("Camila");
        produto.setPreco(10.2);
        produto.setFabricante("teste");
        produtoDao.salvar(produto);
    }
}

