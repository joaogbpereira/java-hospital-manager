package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dao.Conexao;

public class Lista_prioridade {
    public static void listar() {
        Connection conn = Conexao.conectar();
        String sql = "SELECT * FROM pacientes ORDER BY prioridade ASC";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            System.out.println("=== Lista de Pacientes por Prioridade ===");
            while (rs.next()) {
                String nome = rs.getString("nome");
                int prioridade = rs.getInt("prioridade");
                String cpf = rs.getString("cpf");
                String dataAdmissao = rs.getString("data_admissao");

                System.out.println("Nome: " + nome +
                                   " | Prioridade: " + prioridade +
                                   " | CPF: " + cpf +
                                   " | Data de Admissão: " + dataAdmissao);
            }

        } catch (SQLException exception) {
            System.out.println("Erro na listagem: " + exception.getMessage());
        }
    }
}
