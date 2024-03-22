package alurasenac.farmacia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import alurasenac.farmacia.produto.Produto;
import alurasenac.farmacia.service.ProdutoService;

public class ProdutoDao {

    private ProdutoService produtoService;
    private Connection conexao;

    public ProdutoDao(Connection conexao, ProdutoService service) {
        this.conexao = conexao;
        this.produtoService = service;
    }

    public void salvar(Produto produto) {
        String sql = "INSERT INTO produto (nome, preco, fabricante) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setString(3, produto.getFabricante());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar o produto no banco de dados", e);
        }
    }

//    public void salvar(Produto produto) {
//        produtoService.cadastrarNovoProduto(produto.getNome(),produto.getPreco(),produto.getFabricante());
//    }


}
