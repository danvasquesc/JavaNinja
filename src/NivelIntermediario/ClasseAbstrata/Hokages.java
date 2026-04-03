package NivelIntermediario.ClasseAbstrata;

public abstract class Hokages {

    /*
    * Classe abstrata serve para padronizar o codigo. Ela vai forçar que toda classe filha seja padronizada.
    *
    * 1) Classe abstrata não podem ser INSTANCIADAS (ou seja, criar objetos dessa classe).
    * Isso vai impedir que qualquer um crie um objeto da classe Hokage, forçando ela a criar uma subclasse, no caso, Senju
    *
    * 2) Metodos abstrato nao podem ter corpo.
    *
    * */

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    //Metodo abstrato. Aqui ele é vazio, mas será preenchido na subclasse 'Senju'.
    //metodo abstrato é só uma "casca", que será preenchdio depois em uma subclasse (classe filha)
    public abstract void sabedoriaHokage();

    public Hokages() {
    }

    public Hokages(int missoes, String nome, int idade, boolean vivoOuNao, String aldeia, double saldoBancario, double altura) {
        this.missoes = missoes;
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
