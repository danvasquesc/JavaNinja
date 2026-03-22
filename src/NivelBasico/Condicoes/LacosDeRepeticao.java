package NivelBasico.Condicoes;

public class LacosDeRepeticao {

    public static void main(String[] args) {

        /*
         * Laços de Repetição: É uma funcao que se repete quantas vezes quiser enquanto ela atinja aquele criterio que é definido.
         * Vao repetir infinitamente ou ate voce atingir o parametro desejado.
         * WHILE: while (condicao) {Tudo aqui vai acontecer}
         * FOR:
         * */

        // While
        int numeroDeClones = 0;
        int numeroMaximoDeClones = 10;

        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++; //numeroDeClones que começa em 0 e adiciona mais 1. numeroDeClones = 0 + 1; Se nao icrementar, fica em loop infinito.
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        }

        System.out.println("-------------------------");

        // For
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naruto está se clonando e já se clonou " + i);
        }

        System.out.println("-------------------------");

        System.out.println("DESAFIO: Tente escrever um programa onde você tem um array de idades de ninjas. " +
                "Use um for para percorrer esse array e, dentro dele, use if/else para imprimir se o ninja é um \"Genin\" (idade < 12), "
                + "\"Chunin\" (idade entre 12 e 16) ou \"Jonin\" (idade > 16).");
        System.out.println("");

        int[] idade = new int[4]; //inicializacao possivel: int[] idades = {10, 15, 16, 18};
        idade[0] = 10;
        idade[1] = 15;
        idade[2] = 16;
        idade[3] = 18;

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 12) {
                System.out.println("Ninja " + i + " é um Genin");
            } else if (idade[i] <= 16) {
                System.out.println("Ninja " + i + " é um Chunin");
            } else {
                System.out.println("Ninja " + i + " é um Jonin");
            }
        }
    }
}
