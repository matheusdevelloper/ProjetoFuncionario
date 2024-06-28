package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoFuncionarios {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public GerenciamentoFuncionarios() {
    
    }

    public void adicionarFuncionario(Funcionario _funcionario, String cpf){

        boolean funcionarioExiste = funcionarios.stream().anyMatch(funcionario -> funcionario.getCpf().equals(cpf));
        
        if(funcionarioExiste){
            System.out.println();
            System.out.println("Funcionário já existe!");
        }else {
            funcionarios.add(_funcionario);
            System.out.println();
            System.out.println("Funcionário adicionado com sucesso!");
            System.out.println();
        }
    }

    public void exibirFuncionarios(){
       
        for (Funcionario f : funcionarios) {
            f.exibirInformacoes();
        }
    }

    public void atualizarDadosFuncionario(String id_cpf){

                boolean funcionarioExiste = funcionarios.stream().anyMatch(funcionario -> funcionario.getCpf().equals(id_cpf));
                if(!funcionarioExiste){
                    System.out.println();
                    System.out.println("Funcionario inexistente!");
                    System.out.println();
                }else {
                    
                    for(Funcionario f : funcionarios){
                        System.out.print(f.toString());
                    }

                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();

                    System.out.print("Salário: ");
                    Double salario = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Data de admissão do funcionário (Formato: DD/MM/AAAA): ");
                    String dataStr = sc.nextLine();
                    LocalDate dataContratacao = LocalDate.parse(dataStr, fmt);
                    System.out.println("=================================================");

                    for(Funcionario f : funcionarios){
                        if(f.getCpf().equals(id_cpf)){
                            f.setCargo(cargo);
                            f.setSalario(salario);
                            f.setDataContratacao(dataContratacao);
                        }
                        
                    }

                    System.out.println();
                    System.out.println("Funcionário atualizado com sucesso!");
                    System.out.println();
                }
         

    }
    
 

}
