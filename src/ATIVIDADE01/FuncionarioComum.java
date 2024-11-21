package ATIVIDADE01;

public class FuncionarioComum extends Funcionario {
    private double salarioMensal;

    public FuncionarioComum(String Nome, String Cpf, double salarioMensal){
        super (Nome, Cpf);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double CalcularSalario() {
        return 0;
    }
}
