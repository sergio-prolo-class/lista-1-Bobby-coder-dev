package org.example;

public class App {
    public static double anel(String cor) {
        switch (cor) {
            case "preto" -> { return 0; }
            case "marrom" -> { return 1; }
            case "vermelho" -> { return 2; }
            case "laranja" -> { return 3; }
            case "amarelo" -> { return 4; }
            case "verde" -> { return 5; }
            case "azul" -> { return 6; }
            case "violeta" -> { return 7; }
            case "cinza" -> { return 8; }
            case "branco" -> { return 9; }
            default -> {
                System.out.println("Cor inválida: " + cor);
                System.exit(0);
            }
        }
        return 0;
    }

    public static double multiplicador(String cor) {
        switch (cor) {
            case "preto" -> { return 1; }
            case "marrom" -> { return 10; }
            case "vermelho" -> { return Math.pow(10,2); }
            case "laranja" -> { return Math.pow(10,3); }
            case "amarelo" -> { return Math.pow(10,4); }
            case "verde" -> { return Math.pow(10,5); }
            case "azul" -> { return Math.pow(10,6); }
            case "violeta" -> { return Math.pow(10,7); }
            case "cinza" -> { return Math.pow(10,8); }
            case "branco" -> { return Math.pow(10,9); }
            case "ouro" -> { return 0.1; }
            case "prata" -> { return 0.01; }
            default ->{
                System.out.println("Cor inválida: " + cor);
                System.exit(0);
            }
        }
        return 0;
    }

    public static String tolerancia(String cor) {
        switch (cor) {
            case "preto" -> { return "0"; }
            case "marrom" -> { return "1"; }
            case "vermelho" -> { return "2"; }
            case "verde" -> { return "0.5"; }
            case "azul" -> { return "0.25"; }
            case "violeta" -> { return "0.1"; }
            case "cinza" -> { return "0.05"; }
            case "ouro" -> { return "5"; }
            case "prata" -> { return "10"; }
            default ->{
                System.out.println("Cor inválida: " + cor);
                System.exit(0);
            }
        }
        return cor;
    }

    public static void main(String[] args) {
        double faixa1 = anel(args[0]);
        double faixa2 = anel(args[1]);
        double mult = multiplicador(args[2]);

        String tol = "";
        if (!(args.length < 4)) {
            tol = tolerancia(args[3]);
        } else {
            tol = "20";
        }

        
    

        double resistencia = (faixa1 * 10L + faixa2) * mult;

        int kilo = 1000;
        int mega = 1000000;
        int giga = 1000000000;

        String unidade = "";

        if (resistencia >= kilo && resistencia < mega){
            resistencia/=kilo;
            unidade = "K";
        } else if (resistencia >= mega && resistencia < giga) {
            resistencia/=mega;
            unidade = "M";
        } else if (resistencia >= giga) {
            resistencia/=giga;
            unidade = "G";
        }

        System.out.printf("Resistência: %.1f %s Ohms (+- %s%%)\n", resistencia, unidade, tol);
    }
}