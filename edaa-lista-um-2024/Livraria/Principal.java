
public class Principal {
    public static void main(String[] args){
        Livro livro = new Livro();
        
        livro.setNomeLivro("Harry Potter e o Calice de fogo");
        livro.setAutor("J.K.Rowlings");
        livro.setGenero("Fantasia");
        livro.setNdepaginas("758 paginas");

        System.out.println(livro.getNomeLivro());
        System.out.println(livro.getAutor());
        System.out.println(livro.getGenero());
        System.out.println(livro.getNdepaginas());

    }
}
