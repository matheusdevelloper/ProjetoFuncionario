package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
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

                    System.out.print("Nome do funcionário: ");
                    String nome = sc.nextLine();

                    System.out.print("Cpf: ");
                    String cpf = sc.nextLine().replace(".", "").replace("-", "");

                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();

                    System.out.print("Salário: ");
                    Double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Data de admissão do funcionário (Formato: DD/MM/AAAA): ");
                    String dataStr = sc.nextLine();
                    LocalDate dataContratacao = LocalDate.parse(dataStr, fmt);

                    Funcionario _Funcionario = new Funcionario(nome, cpf, cargo, salario, dataContratacao);
                    gFuncionario.adicionarFuncionario(_Funcionario, cpf);
                    System.out.println();
                    sc.nextLine();
                    break;

                case 2:

                    System.out.print("Digite o CPF do funcionário a ser atualizado: ");
                    String id_cpf = sc.nextLine().replace(".", "").replace("-", "");
                    System.out.println();
                    gFuncionario.atualizarDadosFuncionario(id_cpf);
                    
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
