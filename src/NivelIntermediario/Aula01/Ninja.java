package NivelIntermediario.Aula01;

public class Ninja {

    //Molde para os ninjas
    String nome;
    String aldeia;
    int idade;

    //Criar um metodo publico personalizado

    //Metodo VOID nao retorna valor nenhum
    public void SharinganAtivado() {
        System.out.println("O Sharingan ativou!");
    }

    //Metodo String tem que retornar uma String
    public String EuSouUmNinja() {
        return "Oi, eu sou um ninja";
    }

    //Metodo int
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }
}
