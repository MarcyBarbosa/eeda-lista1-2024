public class Central{
    public static void main(String[] args){
        
        Pessoa pessoa = new Pessoa();

        System.out.println("Nome:" + (pessoa.getNome()));
        System.out.println("\nCpf:" + (pessoa.getCpf()));
        System.out.println("\nIdade:" + (pessoa.getIdade()) + " anos");
        System.out.println("\nAltura:" + (pessoa.getAltura()) + " m");
        System.out.println("\nPeso:" + (pessoa.getPeso()) + " Kg");
        
    }
}