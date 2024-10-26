class ContaCorrente {
    float saldo;
    String nome;

    public ContaCorrente(String nome){
        this.nome = nome;
        saldo = 0;
    }

    float verificaSaldo(){
        return saldo;
    }

    void depoSitaValorValor(float valor){
        if(valor > 0) {
            saldo += valor;
        }
    }

    void retiraValor(float valor){
        if(valor <= saldo){
            saldo -= valor;
        }
    }
}