package ATIVIDADE01;

abstract class Funcionario {
    private String nome;
    private String Cpf;

    public Funcionario(String nome, String cpf) {
    }

    public abstract double CalcularSalario ();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", Cpf='" + Cpf + '\'' +
                '}';
    }
}

public class calcularSalario {

}


