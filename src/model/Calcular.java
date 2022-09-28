package model;

import java.util.Random;

public class Calcular {

    private int dificuldade; // Será o nivel de dificuldade do jogo Facil -- Medio -- Dificil -- Ultra.
    private int valor1; // Primeiro valor aleatorio para o calculo.
    private int valor2; // Segundo valor aleatorio para o calculo.
    private int operacao; // Qual operacào aleatoria será realizada Soma - Subtração - Multiplicação - Divisão.
    private int resultado; // Será o resultado do calculo feito.

    public Calcular(int dificuldade) {

        Random rand = new Random();
        this.operacao = rand.nextInt(4);// O usuario terá que digitar 0 - Soma; 1 - Subtração; 2 - Multiplicação; 3 - Dvisão
        this.dificuldade = dificuldade;

        if(dificuldade == 1){
            // Facil
            this.valor1 = rand.nextInt(10); // Que vai gerar o primeiro valor entre 0 e 9.
            this.valor2 = rand.nextInt(10); // Que vai gerar o segundo valor entre 0 e 9.
        }else if (dificuldade == 2){
            // Medio
            this.valor1 = rand.nextInt(100); // Que vai gerar o primeiro valor entre 0 e 99.
            this.valor2 = rand.nextInt(100); // Que vai gerar o segundo valor entre 0 e 99.
        }else if (dificuldade == 3){
            // Dificil
            this.valor1 = rand.nextInt(1000); //Que vai gerar o primeiro valor entre 0 e 999.
            this.valor2 = rand.nextInt(1000); // Que vai gerar o segundo valor entre 0 e 999.
        }else if (dificuldade == 4){
            // Ultra
            this.valor1 = rand.nextInt(10000); //Que vai gerar o primeiro valor entre 0 e 9999.
            this.valor2 = rand.nextInt(10000); // Que vai gerar o segundo valor entre 0 e 9999.
        }else{
            // MegaUltra
            this.valor1 = rand.nextInt(100000); //Que vai gerar o primeiro valor entre 0 e 99999.
            this.valor2 = rand.nextInt(100000); // Que vai gerar o segundo valor entre 0 e 99999.
        }
    }
    public int getDificuldade() {
        return dificuldade;
    }
    public int getValor1() {
        return valor1;
    }
    public int getValor2() {
        return valor2;
    }
    public int getOperacao() {
        return operacao;
    }

    public int getResultado() {
        return resultado;
    }

    public String toString() {
        String op;
        if (this.getOperacao() == 0) {
            op = "Somar";
        } else if (this.getOperacao() == 1) {
            op = "Subtrair";
        } else if (this.getOperacao() == 2) {
            op = "Multiplicar";
        } else if (this.getOperacao() == 3) {
            op = "Divir";
        }else {
            op = "Operação Desconhecida";
        }
        return  "  Valor 1: " + this.getValor1() +
                "\nValor 2: " + this.getValor2() +
                "\nDificuldade: " + this.getDificuldade() +
                "\nOperação: " + op;
    }

    public boolean somar(int resposta){
        this.resultado = this.getValor1() + this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta Correta!");
            certo = true;
        }else {
            System.out.println("Resposta Errada!");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public boolean subtrair(int resposta){
        this.resultado = this.getValor1() - this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta Correta!");
            certo = true;
        }else {
            System.out.println("Resposta Errada!");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public boolean multiplicar(int resposta){
        this.resultado = this.getValor1() * this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta Correta!");
            certo = true;
        }else {
            System.out.println("Resposta Errada!");
        }
        System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }

    public boolean dividir(int resposta){
        this.resultado = this.getValor1() / this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta Correta!");
            certo = true;
        }else {
            System.out.println("Resposta Errada!");
        }
        System.out.println(this.getValor1() + " / " + this.getValor2() + " = " + this.getResultado());
        return certo;
    }
}
