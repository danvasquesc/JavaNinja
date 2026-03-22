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
