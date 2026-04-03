
/*
* Crie um programa em Java para gerenciar
informações de ninjas utilizando herança. Desenvolva
uma classe base chamada Ninja e uma subclasse
chamada Uchiha.
1. Na classe Ninja, defina os atributos nome
(String), idade (int), missao (String),
nivelDificuldade (String) e statusMissao (String).
Adicione um método chamado
mostrarInformacoes() que exibe todos esses
atributos.
2. Crie uma subclasse chamada Uchiha que herda
de Ninja. Adicione um atributo adicional
habilidadeEspecial (String) e um método
chamado mostrarHabilidadeEspecial() para exibir
a habilidade especial do ninja.
3. Sobrescreva o método mostrarInformacoes() na
classe Uchiha para incluir também a habilidade
especial
*
* */
package NivelIntermediario.Heranca.Desafio3;

public class Main {

    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Recuperar o amuleto";
        sasuke.nivelDificuldade = "Alta";
        sasuke.statusMissao = "Em andamento";
        sasuke.mostrarInformacoes();

    }
}
