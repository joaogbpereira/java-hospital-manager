package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import dao.Conexao;

public class CadastrarPaciente {
    public static void cadastrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Paciente ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Data de admissão (YYYY-MM-DD): ");
        String dataAdmissao = scanner.nextLine();

        System.out.print("Prioridade (1 = Emergência, 2 = Urgência, 3 = Eletivo): ");
        int prioridade = scanner.nextInt();

        String sql = "INSERT INTO pacientes (nome, cpf, data_admissao, prioridade) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, dataAdmissao);
            stmt.setInt(4, prioridade);

            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Paciente cadastrado com sucesso!");
            } else {
                System.out.println("Erro ao cadastrar paciente.");
            }

        } catch (SQLException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }
}
