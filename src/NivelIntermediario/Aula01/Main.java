package NivelIntermediario.Aula01;

public class Main {
    public static void main(String[] args) {

        //Naruto e Sasuke são objetos
        //Criar ninjas com objetos
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;

        //Criar ninja Sasuke - ele é um objeto
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;

        Sasuke.SharinganAtivado(); //Aplicando metodo ao meu objeto

        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        //Metodo que solicita parametro
        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println(quantoTempoFalta);

    }
}

/*
* ORIENTACAO A OBJETOS
*
* HERANÇA - usar caracteristicas de uma classe mae em outras classes filhas para assim poupar codigo e agilizar trabalho.
*
* POLIMORFISMO - criar uma funcao unica que pode ser utilizada em diferentes classes com diferentes caracteristicas.
*
* ENCAPSULAMENTO - capacidade de proteger variaveis e classes para que nao haja vazamento e mantendo assim protegida e encapsulada nossos objetos.
*
* */