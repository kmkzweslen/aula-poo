public class AcessaContaCorrente {
    public static void main(String[] args){
        ContaCorrente conta = new ContaCorrente("weslen");

        System.out.println("ANTES");
        System.out.println(conta.nome);
        System.out.println(conta.verificaSaldo());

        conta.nome = "Cleide";
        conta.depoSitaValorValor(10);

        System.out.println("DEPOIS");
        System.out.println(conta.nome);
        System.out.println(conta.verificaSaldo());

    }
}
