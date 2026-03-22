package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
         * Dados primitivos: São tipos de dados que de maneira geral não recebem métodos de maneira padrão
         * Dados primitivos - int, double, float, char, boolean, short.
         * Objetivo da aula: Criar um ninja - Naturo.
         * */

        int idade = 16;
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999L;

        System.out.println(idade);
        System.out.println(saldoBancario);
        System.out.println(altura); // atalho sout
        System.out.println("saldo Bancario é = " + saldoBancario); // atalho soutv concatena a ultima variavel lançada
        System.out.println("Minha idade é: " + idade); // shif+F10 para rodar codigo direto

    }
}