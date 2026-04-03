package NivelIntermediario.Construtores;

public class Hokages {

    /*
     * Existem dois tipos de Construtores:
     * NoArgs Constructor = um construtor que vem vazio. Noa necessariamente recebe argumento nenhum.
     * AllArgs Constructor = um construtor que é preenchido com todos os atributos da classe.
     *
     * */

    String nome;
    int idade;
    boolean vivoOuNao;

    // No args constructor
    public Hokages() {
        // Construtor vazio, sem argumentos
    }

    // Criar um construtor com argumentos

    //Construtor com argumento nome
    public Hokages(String nome) {
        this.nome = nome;
    }

    //Construtor com argumento idade
    public Hokages(int idade) {
        this.idade = idade;
    }

    //Normalmente se usa construtor com TODOS os argumentos.
    //Chama-se All args constructor = construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    //E se tivessemos mais atributos e nao precisar fazer tudo na mao
    //Usar Alt + Insert para abrir o Generate
    //No Generate da pra criar os construtores AUTOMATICAMENTE
    double altura;

    public Hokages(double altura) {
        this.altura = altura;
    }

    //Normalmente usa-se o construtor vazio e o construtor com todos os argumentos
}
