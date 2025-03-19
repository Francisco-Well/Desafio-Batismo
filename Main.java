package Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ninja NinjaUsu = new Ninja();
        int escolhaNumber;
        Scanner Usuario = new Scanner(System.in);

        System.out.println("==== Cadastre a Missão do seu Ninja ====");
        System.out.println("Qual o clã do Ninja?\n1. Uzumaki \n2. Uchiha \nDigite o número referente ao clã: ");
        escolhaNumber = Usuario.nextInt();
        if (escolhaNumber == 1) {
            NinjaUsu = new Uzumaki();
            NinjaUsu.cla = "Uzumaki";
        } else if (escolhaNumber == 2) {
            NinjaUsu = new Uchiha();
            NinjaUsu.cla = "Uchiha";
        } else {
            System.out.println("Número invalido.");
        }
        System.out.println("Coloque o nome do ninja: ");
        NinjaUsu.nome = Usuario.nextLine();
        NinjaUsu.nome = Usuario.nextLine();
        System.out.println("Coloque a idade do ninja: ");
        NinjaUsu.idade = Usuario.nextInt();
        System.out.println("Coloque a Missão do ninja: ");
        NinjaUsu.missao = Usuario.nextLine();
        NinjaUsu.missao = Usuario.nextLine();
        System.out.println("Coloque a dificuldade da missão: ");
        NinjaUsu.dificuldade = Usuario.nextLine();

        NinjaUsu.habilidadeespecial();
        NinjaUsu.MostrarInformacoes();
        Usuario.close();
    }
}
