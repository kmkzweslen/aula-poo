package ATIVIDADE01;

public class FuncionarioComissionado extends Funcionario {


    public FuncionarioComissionado(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double CalcularSalario() {
        return 0;
    }
}
