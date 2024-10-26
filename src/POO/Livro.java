package POO;

public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public  void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    void mostrarDetalhes(){
         System.out.println("---------------------");
         System.out.println("Nome: " + this.nome);
         System.out.println("descrição: " + this.descricao);
         System.out.println("valor: " + this.valor);
         System.out.println("ISBN: " + this.isbn);

     }


}
