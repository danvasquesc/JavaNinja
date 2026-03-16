package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

        /*
         * Dados NÃO primitivos: São tipos de dados em que pode-se colocar métodos para fazer
         * alterações na variavel sem que seja mudado seu escopo.
         * Tipos: String, Array, Class, enum
         * Objetivo: Criar um ninja e atribuir métodos a ele.
         * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // metodo coloca tudo em CAPSLOCK
        System.out.println("Esse texto está em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse texto está normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); // metodo coloca tudo em caixa baixa
        System.out.println(aldeiaLowerCase);

    }
}
