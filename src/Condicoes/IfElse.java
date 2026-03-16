package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*
        * Objetivo da aula: Passar o ninja de nivel de acordo com o numero de missoes.
        * Usando IF e ELSE - Condicoes.
        * */

        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        int numeroDeMissoes = 14;

        /*
        * if (condicao) { resultado }
        * else if (condicao) { resultado }
        * else { resultado caso nada seja verdadeiro }
        * */

        if (numeroDeMissoes >= 100) {
            rank = "Kage";
        } else if (numeroDeMissoes >= 80) {
            rank = "Anbu";
        } else if (numeroDeMissoes >= 50) {
            rank = "Tokubetsu Jonin";
        } else if (numeroDeMissoes >= 20) {
            rank = "Jonin";
        } else {
            rank = "Chunin";
        }

        System.out.println("Nome do Ninja: " + nome + " | Idade: " + idade + " | Numero de missões: " + numeroDeMissoes + " | Rank atual: " + rank);

    }
}
