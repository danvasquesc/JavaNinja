package NivelIntermediario.Heranca;

public class Boruto extends Uzumaki implements HyugaUzumaki {

    /*Classe Boruto (que é filho da classe Hyuga e Uzumaki), onde usaremos herança e a interface 'HyugaUzumaki'.
     * Pra usar uma interface em uma classe, usamos o 'implements'.
     * Toda vez que implementamos uma interface na classe, obrigatoriamente temos que colocar os metodos criados da interface*/

    public void AtivarOKarma() {
        System.out.println("O Karma foi ativado! Eu sou um Hyuga Uzumaki.");
    }

    public void AtivarJougan() {
        System.out.println("Jougan foi ativado com sucesso! Eu sou um Hyuga Uzumaki.");
    }
}
