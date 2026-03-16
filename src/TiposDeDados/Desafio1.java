package TiposDeDados;

public class Desafio1 {
    public static void main(String[] args) {

        /*
         * DESAFIO 1: Crie um programa que represente tres ninjas da Vila da Folha (Konoha) de "Naruto" e suas respectivias missões.
         * Cada ninja tem um nome, uma idade e uma missão atribuida a ele, com o nome da missão, nível de dificuldade e status de conclusão.
         * */

        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 14;
        String missaoNinja1 = "Resgate do Akamaru";
        char nivelMissaoNinja1 = 'A';
        String statusMissaoNinja1;

        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 17;
        String missaoNinja2 = "Escolta da Vila da Névoa";
        char nivelMissaoNinja2 = 'B';
        String statusMissaoNinja2;

        String nomeNinja3 = "Kakashi Hatake";
        int idadeNinja3 = 30;
        String missaoNinja3 = "Entrega de Pergaminho Secreto";
        char nivelMissaoNinja3 = 'C';
        String statusMissaoNinja3;

        String nomeNinja4 = "Sasuke";
        int idadeNinja4 = 13;
        String missaoNinja4 = "Capturar bandido";
        char nivelMissaoNinja4 = 'C';
        String statusMissaoNinja4;

        if (idadeNinja1 >= 15 || (nivelMissaoNinja1 == 'C' || nivelMissaoNinja1 == 'D')) {
            statusMissaoNinja1 = "Concluído";
        } else {
            statusMissaoNinja1 = "Não concluída";
        }

        if (idadeNinja2 >= 15 || (nivelMissaoNinja2 == 'C' || nivelMissaoNinja2 == 'D')) {
            statusMissaoNinja2 = "Concluído";
        } else {
            statusMissaoNinja2 = "Não concluída";
        }

        if (idadeNinja3 >= 15 || (nivelMissaoNinja3 == 'C' || nivelMissaoNinja3 == 'D')) {
            statusMissaoNinja3 = "Concluído";
        } else {
            statusMissaoNinja3 = "Não concluída";
        }

        if (idadeNinja4 >= 15 || (nivelMissaoNinja4 == 'C' || nivelMissaoNinja4 == 'D')) {
            statusMissaoNinja4 = "Concluído";
        } else {
            statusMissaoNinja4 = "Não concluída";
        }

        System.out.println("NINJAS DA ALDEIA DA FOLHA - DESAFIO 1");

        System.out.println();
        System.out.println("Nome do Ninja 1: " + nomeNinja1);
        System.out.println("Idade do Ninja 1: " + idadeNinja1);
        System.out.println("Nome da missão do Ninja 1: " + missaoNinja1);
        System.out.println("Nível da missao do Ninja 1: " + nivelMissaoNinja1);
        System.out.println("Status da missão do Ninja 1: " + statusMissaoNinja1);

        System.out.println();
        System.out.println("Nome do Ninja 2: " + nomeNinja2);
        System.out.println("Idade do Ninja 2: " + idadeNinja2);
        System.out.println("Nome da missão do Ninja 2: " + missaoNinja2);
        System.out.println("Nível da missao do Ninja 2: " + nivelMissaoNinja2);
        System.out.println("Status da missão do Ninja 2: " + statusMissaoNinja2);

        System.out.println();
        System.out.println("Nome do Ninja 3: " + nomeNinja3);
        System.out.println("Idade do Ninja 3: " + idadeNinja3);
        System.out.println("Nome da missão do Ninja 3: " + missaoNinja3);
        System.out.println("Nível da missao do Ninja 3: " + nivelMissaoNinja3);
        System.out.println("Status da missão do Ninja 3: " + statusMissaoNinja3);

        System.out.println();
        System.out.println("Nome do Ninja 4: " + nomeNinja4);
        System.out.println("Idade do Ninja 4: " + idadeNinja4);
        System.out.println("Nome da missão do Ninja 4: " + missaoNinja4);
        System.out.println("Nível da missao do Ninja 4: " + nivelMissaoNinja4);
        System.out.println("Status da missão do Ninja 4: " + statusMissaoNinja4);

    }
}
