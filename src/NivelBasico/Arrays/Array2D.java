package NivelBasico.Arrays;

public class Array2D {
    public static void main(String[] args) {

        /*
        * Array 2D - significa que um array vai levar outro array dentro.
        * O primeiro Array vai ser um array de referencia, que dentro dele terá outros array que serão uma matriz.
        * Arrays Multidimensionais.
        * */

        String[][] ninjasEAldeias = new String[3][3]; //Primeiro [] é a linha e o segundo [] é a coluna.

        ninjasEAldeias[0][0] = "Konaha";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        System.out.println(ninjasEAldeias); //me passa a referencia na memoria @76ed5528

        System.out.println(ninjasEAldeias[0][1]); //me passa o Ninja Naruto

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0] + " - " + "Ninja 1: " + ninjasEAldeias[i][1] + " - " + "Ninja 2: " + ninjasEAldeias[i][2]);
        }
        /*
        * SAIDA:
        * Aldeia: Konaha - Ninja 1: Naruto - Ninja 2: Sasuke
        * Aldeia: Nevoa - Ninja 1: Zabuza - Ninja 2: Haku
        * Aldeia: Deserto - Ninja 1: Gaara - Ninja 2: Temari
        * */

    }
}
