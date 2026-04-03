package NivelIntermediario.Heranca.Desafio3;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial = " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome = " + nome);
        System.out.println("Idade = " + idade);
        System.out.println("Missao = " + missao);
        System.out.println("Nivel de Dificuldade = " + nivelDificuldade);
        System.out.println("Status da Missao = " + statusMissao);
        System.out.println("Habilidade Especial Uchiha");
    }
}
