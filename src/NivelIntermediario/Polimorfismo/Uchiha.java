package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja {

    // Usar Annotation para SOBRESCREVER um metodo da classe Ninja (POLIMORFISMO)
    //@Override usa-se toda vez que quiser Sobrescrever outro metodo

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo.");
    }
}
