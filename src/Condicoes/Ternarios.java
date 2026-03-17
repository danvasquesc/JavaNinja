package Condicoes;

public class Ternarios {

    public static void main(String[] args) {

        /*
         * Ternarios: Sao maneiras de reduzir o codigo
         * Estrutura: variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
         * ? para verdadeiro e : para falso
         * */

        short numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);

    }

}
