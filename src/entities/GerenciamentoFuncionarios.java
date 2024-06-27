package entities;

import java.util.ArrayList;

public class GerenciamentoFuncionarios {

    private ArrayList<Funcionario> funcionario = new ArrayList<>();

    public GerenciamentoFuncionarios() {
    
    }

    public void adicionarFuncionario(Funcionario _funcionario){
        funcionario.add(_funcionario);
    }

    public void exibirFuncionarios(){
        for (Funcionario f : funcionario) {
            f.exibirInformacoes();
        }
    }

    public void atualizarFuncionario(int id, Funcionario _Funcionario){
        
    }
    
    

}
