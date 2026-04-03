package NivelIntermediario.Heranca.Desafio3;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("A habilidade especial deste ninja é: " + habilidadeEspecial + ".");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome do Ninja: " + nome + ". Idade: " + idade + ". Missao: " + missao + ". Nivel de Dificuldade: " + nivelDificuldade + ". Status da Missao: " + statusMissao + ". Habilidade Especial: " + habilidadeEspecial + ".");
    }
}
