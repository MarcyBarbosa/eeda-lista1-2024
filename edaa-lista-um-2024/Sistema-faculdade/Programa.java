public class Programa {
    public static void main(String[] args){
        Aluno aluno = new Aluno("Isabela R.", 22, "012.345.678-90");
        Professor professor = new Professor("Daniel Paiva", 28, "987.654.321-00", "Graduação e Pós Graduação");
        Universidade universidade = new Universidade("Una","Rua da Educação");
        Disciplina disciplina = new Disciplina();


        System.out.println("Professor " + professor.getNome());
        System.out.println("Universidade: " + universidade.getNome());
        disciplina.lancarPresencaDiariaAluno(3, aluno);
    
    }
}
