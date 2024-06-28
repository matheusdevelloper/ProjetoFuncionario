package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    
    private String nome;
    private String cpf;
    private String cargo;
    private Double salario;
    private LocalDate dataContratacao;

    
    
    public Funcionario(String cargo, Double salario, LocalDate dataContratacao) {
        this.cargo = cargo;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
    }

    public Funcionario(String nome, String cpf, String cargo, Double salario, LocalDate dataContratacao) {
        this.nome = nome;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
     
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
        result = prime * result + ((salario == null) ? 0 : salario.hashCode());
        result = prime * result + ((dataContratacao == null) ? 0 : dataContratacao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (cargo == null) {
            if (other.cargo != null)
                return false;
        } else if (!cargo.equals(other.cargo))
            return false;
        if (salario == null) {
            if (other.salario != null)
                return false;
        } else if (!salario.equals(other.salario))
            return false;
        if (dataContratacao == null) {
            if (other.dataContratacao != null)
                return false;
        } else if (!dataContratacao.equals(other.dataContratacao))
            return false;
        return true;
    }

    public void exibirInformacoes() {
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("========== Informações do Funcionário ==========");
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.println("Data de Contratação: " + dataContratacao.format(fmt));
        System.out.println("=================================================");

    }

    @Override
    public String toString() {
        return "========== Informações do Funcionário ==========\n"
              +"Nome: "+nome+"\n"
              +"Cpf: "+cpf+"\n";
    }

    
     
    
    
}
