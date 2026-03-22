package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {

        /*
         * Scanner: É um jeito de trazer o usuario pra dentro da aplicacao.
         * É o input do usuario.
         * Objetivo da aula: Usuario vai criar um ninja e vamos validar os dados.
         * */

        /*
         * Abaixo: criado um objeto autorizando o usuario adicionar coisas aqui dentro.
         * System.in = "sistema, deixe entrar".
         * */

        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Escreva o nome do Ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine(); //o que o usuario digitar aqui, que abrira uma caixa de texto pra ele, sera guardado dentro da variavel 'nomeDoNinja'.
        System.out.println("O nome do Ninja é: " + nomeDoNinja); //aqui printa o que esta atribuido dentro da variavel 'nomeDoNinja'.

        // Receber a idade do ninja
        System.out.println("Escreva a idade do Ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do Ninja é: " + idadeDoNinja + " anos");

        // Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse Ninja é maior de idade");
        } else {
            System.out.println("Esse Ninja é menor de idade");
        }

        caixaDeTexto.close(); //Fechar sempre o Scanner.
    }

}
