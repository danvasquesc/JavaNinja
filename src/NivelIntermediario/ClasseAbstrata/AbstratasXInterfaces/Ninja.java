package NivelIntermediario.ClasseAbstrata.AbstratasXInterfaces;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    //Metodo abstrado
    public abstract void nomeDoNinja();

    //Pode ter metodos nao abstratos também
    public void tacarKunai() {
        System.out.println("Eu taquei uma Kunai");
    }

}
