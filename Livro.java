public class Livro {
    
    private String NomeLivro;
    private String autor;
    private String genero;
   private String Ndepaginas;

    public String getNomeLivro() {
        return NomeLivro;
    }
    public void setNomeLivro(String nomeLivro) {
        NomeLivro = nomeLivro;
    }
   
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    } 
    
    public String getNdepaginas() {
        return Ndepaginas;
    }
    public void setNdepaginas(String ndepaginas) {
        Ndepaginas = ndepaginas;
    }
}
