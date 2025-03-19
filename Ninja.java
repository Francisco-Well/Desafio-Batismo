package Desafio3;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String dificuldade;
    String statusdamissao = "Em andamento...";
    String cla;
    public void MostrarInformacoes() {
        System.out.println("\n==== Menu de missão ====\n" + "|Nome do Ninja: " + nome + " |Idade do Ninja: " + idade + " |O clã do Ninja: " + cla + "\n|Missão: " + missao + " |Dificuldade da missão: " + dificuldade + "\n|Status da Missão: " + statusdamissao
        );
    }
    String habilidadeespecial() {
        return "";
    };
}
