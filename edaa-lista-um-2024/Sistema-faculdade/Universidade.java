public class Universidade {
    private String nome;
    private String rua;

    public Universidade(String nome, String rua){
        this.nome = nome;
        this.rua = rua;
    }

    public String getNome(){
        return nome;
    }
    public String getRua(){
        return rua;
    }

    public String mudarRua(String novaRua){
        rua = novaRua;
        return rua;
    }
}
