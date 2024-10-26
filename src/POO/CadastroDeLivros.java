package POO;

public class CadastroDeLivros {
    public static void main (String [] args){
        Livro livro = new Livro ();

        //livro.nome = "Como programar em java";
        livro.setNome("Como programar em java");
       // livro.descricao = "Primeiros passos...";
        livro.setDescricao("primeiros passos...");
       // livro.valor = 59.90;
        livro.setValor(59.90);
        // livro.isbn = "987-65-4321-12-3";
        livro.setIsbn("987-65-4321-12-3");
        livro.mostrarDetalhes();

        Autor autor = new Autor();

      //  autor.nome = "autor";
        autor.setNome("Autor");
        autor.setEmail("autor@gmai.com");
        autor.setCpf("123.456.678-90");
      //  autor.email = "autor@gmail.com";
     //   autor.cpf = "123.456.789.10"
        autor.mostrarDetalhes();




    }
}
