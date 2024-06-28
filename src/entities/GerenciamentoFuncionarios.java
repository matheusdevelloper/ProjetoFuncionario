package entities;

import java.util.ArrayList;

public class GerenciamentoFuncionarios {

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
        }
    }

    public void exibirFuncionarios(){
       
        for (Funcionario f : funcionarios) {
            f.exibirInformacoes();
        }
    }

    public void atualizarFuncionario(int id, Funcionario _Funcionario){
        
    }
    
    

}
