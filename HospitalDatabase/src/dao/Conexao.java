package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospital", "root", "hospital123"
            );
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
            return null;
        }
    }
}
