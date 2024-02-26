public class Central {
    public static void main(String[] args){
        Cachorro doggy = new Cachorro();
        doggy.setId(01);
        doggy.setNome("Luna Furacão");
        doggy.setIdade(5);

        System.out.println(doggy.getNome());
        doggy.latir();
    }
}
