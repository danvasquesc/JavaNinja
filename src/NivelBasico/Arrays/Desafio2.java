package NivelBasico.Arrays;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] ninjas = new String[5];

        int ninjasCadastrados = 0;
        int escolhaDoUsuario = 0;

        while (escolhaDoUsuario != 3) {

            System.out.println("\n==== Menu Ninja ====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");

            escolhaDoUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaDoUsuario) {
                case 1:
                    if (ninjasCadastrados < ninjas.length) {
                        System.out.print("Digite o nome do ninja: ");
                        ninjas[ninjasCadastrados] = scanner.nextLine();
                        System.out.println("Ninja cadastrado com sucesso!");
                        ninjasCadastrados++;
                    } else {
                        System.out.println("Erro: A Vila da Folha já está cheia!");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado no momento.");
                    } else {
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o sistema... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();

    }
}

/*
* DESAFIO: Você foi encarregado pelo Hokage para gerenciar o
cadastro de ninjas na Vila da Folha. Sua missão é criar
um sistema simples em Java para cadastrar novos
ninjas e listar todos os ninjas cadastrados.
Tópicos a serem utilizados:
Arrays: Para armazenar os nomes dos ninjas.
Switch Cases: Para implementar um menu
interativo.
Loops: Para navegar pelas opções do menu e
iterar sobre os ninjas cadastrados.
Condicionais: Para controlar a execução das
opções do menu e validar o número de ninjas
cadastrados.
* */
