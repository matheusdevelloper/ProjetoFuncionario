package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



import entities.Funcionario;
import entities.GerenciamentoFuncionarios;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        GerenciamentoFuncionarios gFuncionario = new GerenciamentoFuncionarios();
        
        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Adicionar Funcionário\n"
                              +"2. Atualizar Funcionário\n"
                              +"3. Exibir    Funcionários\n"
                              +"4. Sair\n");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Funcionário: ");
                    String nome = sc.nextLine();

                    System.out.print("Cargo do Funcionário: ");
                    String cargo = sc.nextLine();

                    System.out.print("Salário do Funcionário: ");
                    Double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Data de admissão do funcionário (Formato: DD/MM/AAAA): ");
                    String dataStr = sc.nextLine();
                    LocalDate dataContratacao = LocalDate.parse(dataStr, fmt);

                    Funcionario _Funcionario = new Funcionario(nome, cargo, salario, dataContratacao);
                    gFuncionario.adicionarFuncionario(_Funcionario);
                    System.out.println();
                    sc.nextLine();
                    break;
                case 3:
                    gFuncionario.exibirFuncionarios();
                    System.out.println();
                    sc.nextLine();
                    break;
                case 4:
                    sc.close();
                    return;
                
                default:
                    break;
            }

        }while(true);
        
    }
}
