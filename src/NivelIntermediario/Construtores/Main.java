package NivelIntermediario.Construtores;

public class Main {

    public static void main(String[] args) {

        //Usando o construtor vazio
        Hokages hashirama = new Hokages();
        hashirama.idade = 45;

        // Usando o construtor com argumento nome
        Hokages tobirama = new Hokages("Tobirama Senju");
        System.out.println(tobirama.nome);

        //Usando o construtor com argumento idade
        Hokages hiruzen = new Hokages(40);
        System.out.println(hiruzen.idade);

        //Usando o construtor com todos os argumentos
        Hokages minato = new Hokages("Minato Namikaze", 32, false);
        System.out.println(minato.idade);

    }
}
