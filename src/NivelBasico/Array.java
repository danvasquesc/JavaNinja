package NivelBasico;

public class Array {

    public static void main(String[] args) {

        /*
        * Usa-se Arrays quando quiser agrupar coisas.
        * Array sempre são do mesmo tipo.
        * É do tipo de dado não primitivo. É chamado de tipo referencia.
        * Quando inicializamos um array, precisamos informar quantos pedacinhos precisa ser alocado na memoria, que no caso, é quantos elementos nosso array terá.
        * */

        String[] ninja = new String[4]; //tres elementos dentro do array
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        ninja[3] = "Hinata";

        System.out.println(ninja[3]);

    }
}
