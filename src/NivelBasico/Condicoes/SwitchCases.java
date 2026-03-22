package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwitchCases {

    public static void main(String[] args) {

        /*
         * SwitchCases: Servem para gerar casos especificos.
         * Objetivo da aula: Pedir pro usuario escolher entre os Ninjas.
         * */

        // Mostrar opcoes para o usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o usuario escolher uma das opcoes
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Vocễ digitou o número: " + escolhaDoUsuario);

        // Reacao ao escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki");
                break; //se o case 1 acontecer, o 'break' encerra o switch aqui.
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuário escolheu o Sakura Haruno");
                break;
            default: //Caso padrao. Caso nenhum escolha seja o que tem acima, cai no default. Tratamento de erro.
                System.out.println("Você não digitou uma opção válida. Tente novamente!");
        }

        scanner.close();
    }

}
