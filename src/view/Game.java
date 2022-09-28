package view;

import model.Calcular;

import java.util.Scanner;

public class Game {
        static Scanner teclado = new Scanner(System.in);
        static int pontos = 0;
        static Calcular calc;

    public static void main(String[] args) {

        Game.jogar();

    }

    public static void jogar() {
        System.out.println("Informe o nivel de dificuldade desejado [1, 2, 3 ou 4]");
        int dificuldade = Game.teclado.nextInt();

        Game.calc = new Calcular(dificuldade);

        System.out.println("Informe o resultado para seguintes operações");

        // Somar
        if (calc.getOperacao() == 0) {
            System.out.println(calc.getValor1() + " + " + calc.getValor2());
            int resposta = Game.teclado.nextInt();
            if (calc.somar(resposta)) {
                // Ganha 1 ponto
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + "pontos(s)");
            }
        } else if (calc.getOperacao() == 1) {
            System.out.println(calc.getValor1() + " - " + calc.getValor2());
            int resposta = Game.teclado.nextInt();
            if (calc.subtrair(resposta)) {
                // Ganha 1 ponto
                Game.pontos += 2;
                System.out.println("Você tem " + Game.pontos + "pontos(s)");

            }
        } else if (calc.getOperacao() == 2) {
            System.out.println(calc.getValor1() + " * " + calc.getValor2());
            int resposta = Game.teclado.nextInt();
            if (calc.multiplicar(resposta)) {
                // Ganha 1 ponto
                Game.pontos += 3;
                System.out.println("Você tem " + Game.pontos + "pontos(s)");

            }
        } else if (calc.getOperacao() == 3) {
            System.out.println(calc.getValor1() + " / " + calc.getValor2());
            int resposta = Game.teclado.nextInt();
            if (calc.dividir(resposta)) {
                // Ganha 1 ponto
                Game.pontos += 4;
                System.out.println("Você tem " + Game.pontos + "pontos(s)");

            }
        }else {
            System.out.println("A operação" + calc.getOperacao() + "não  é reconhecida");
        }
        System.out.println("Deseja continuar? [1 - Sim, 2 - Não ]" );
        int continuar = Game.teclado.nextInt();

        if(continuar == 1){
            Game.jogar();
        }else{
            System.out.println("Você fez " + Game.pontos + " ponto(s)");
            System.out.println("Até a proxima!");
            System.exit(0);
        }

    }
}

