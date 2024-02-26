import java.text.MessageFormat;

public class Disciplina{
    private Aluno aluno;
    private double presencaDiaria;
    private String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Disciplina(Aluno aluno, double presencaDiaria){
        this.aluno = aluno;
        this.presencaDiaria = presencaDiaria;
    }
    
    public Disciplina() { }

    public Aluno getAluno(){
        return aluno;
    }
    public double getPresencaDiaria(){
        return presencaDiaria;
    }
    
    public void lancarPresencaDiariaAluno(int qtdeAulaVista, Aluno aluno){
        presencaDiaria = qtdeAulaVista;
        System.out.println (MessageFormat.format("Aluno(a) {0} presente em aula!", aluno.getNome()));
    }
}