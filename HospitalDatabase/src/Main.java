import controller.CadastrarPaciente;
import controller.Lista_prioridade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Listar Pacientes por Prioridade");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    CadastrarPaciente.cadastrar();
                    break;
                case 2:
                    Lista_prioridade.listar();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
