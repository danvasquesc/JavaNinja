package NivelBasico;

public class Array {

    public static void main(String[] args) {

        /*
         * Usa-se Arrays quando quiser agrupar coisas.
         * Array sempre são do mesmo tipo.
         * É do tipo de dado não primitivo. É chamado de tipo referencia.
         * Ser do tipo referencia significa que sempre que usar Array, temos que referenciar um espaço na memoria pra ele.
         * Quando inicializamos um array, precisamos informar quantos pedacinhos precisa ser alocado na memoria, que no caso, é quantos elementos nosso array terá.
         * */

        String[] ninja = new String[4]; //objeto de memoria com referencia @76ed5528 na memoria
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        ninja[3] = "Hinata";

        //Como mostrar os nomes do array
        for (int i = 0; i < ninja.length ; i++) {
            System.out.println(ninja[i]);
        }

        System.out.println(ninja);
        /*
         * Se é impresso 'System.out.println(ninja);', ou seja, imprimir o Array, irá aparecer @76ed5528, pois é a referencia na nossa memoria de onde está armazenado o array
         * */

        //TIPOS DE INICIALIZACOES DE ARRAY
        //Array do tipo String, se nao colocar valor nenhum, retorna null
        //Array do tipo int, se nao colocar valor nenhum, retorna 0
        //Array do tipo boolean, se nao colocar valor nenhum, retorna false
        //Array do tipo double, se nao colocar valor nenhum, retorna 0.0

        //Redeclarar um array
        int[] idade = new int[6];
        idade[0] = 13;
        idade[1] = 14;
        idade[2] = 15;
        idade[3] = 16;

        System.out.println("Localizador da memoria antigo: " + idade);

        idade = new int[6];
        //aqui podem ser adicionados novos elementos normalmente
        idade[0] = 20;
        System.out.println("Localizador da memoria atual: " + idade);
        System.out.println(idade[0]);

        /*
        * O array antigo não existira mais pois foi redeclarado, ou seja, sobescrito, e ai surgirá mais pra frente o Garbage Collector para jogar fora o antigo array.
        * */

    }
}
