package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {

    private String nome;
    private String cargo;
    private Double salario;
    private LocalDate dataContratacao;

    public Funcionario() {
    }

    public Funcionario(String nome, String cargo, Double salario, LocalDate dataContratacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    
    public void exibirInformacoes() {
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("========== Informações do Funcionário ==========");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.println("Data de Contratação: " + dataContratacao.format(fmt));
        System.out.println("=================================================");

    }
     
    
    
}
