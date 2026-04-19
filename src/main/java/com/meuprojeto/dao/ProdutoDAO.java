package com.meuprojeto.dao;

import com.meuprojeto.db.DB;
import entities.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {

    public void salvar(Produto p) {

        String sql = "INSERT INTO produto (nome, preco) VALUES (?, ?)";

        try (Connection conn = DB.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, p.getNome());
            ps.setString(2, p.getPreco());

            ps.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar produto", e);
        }
    }
}