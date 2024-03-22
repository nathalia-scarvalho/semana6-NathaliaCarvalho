package alurasenac.farmacia.service;

import alurasenac.farmacia.dao.Conexao;

import java.sql.Connection;

public class ProdutoService {
    public void cadastrarNovoProduto(String nome, double preco, String fabricante) {
        try (Connection conexao = Conexao.conectar()) {
            System.out.println("Conexão realizada com sucesso!");

        } catch (Exception e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
