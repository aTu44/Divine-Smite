package modelos;

import java.util.Scanner;

public class Slot extends D8 {

    Scanner read = new Scanner(System.in);

    String monstro, critico, vantagem, mensagem = "° D8: ";
    int magia = 0, soma = 0, i;

    public int slot() {

        magia = read.nextInt();

    
        switch (magia) {
            case 1:
                for (i = 1; i < 3; i++) {
                    int random = Doito();
                    System.out.println(i + mensagem + random);
                    soma += random;

                }
                System.out.println("\nO dano total foi de: " + soma);
                break;
            case 2:
                for (i = 1; i < 4; i++) {

                    int random = Doito();
                    System.out.println(i + mensagem + random);
                    soma += random;

                }
                System.out.println("\nO dano total foi de: " + soma);
                break;
            case 3:
                for (i = 1; i < 5; i++) {

                    int random = Doito();
                    System.out.println(i + mensagem + random);
                    soma += random;

                }
                System.out.println("\nO dano total foi de: " + soma);
                break;
            case 4:
                for (i = 1; i < 6; i++) {

                    int random = Doito();
                    System.out.println(i + mensagem + random);
                    soma += random;

                }
                System.out.println("\nO dano total foi de: " + soma);
                break;
         default:
         for (i = 1; i < 6; i++) {

            int random = Doito();
            System.out.println(i + mensagem + random);
            soma += random;

        }
        System.out.println("\nO dano total foi de: " + soma);
        break;
        }
        return magia;
    }

    public int bonusNivel() {
        int nivelJogador;

        System.out.println("\nQual o nivel do seu personagem?");
        nivelJogador = read.nextInt();

        if (nivelJogador >= 11) {
            random = Doito();
            soma += random;
            System.out.println("\nDano adicional de: " + random);
            System.out.println("\nDano total de: " + soma);

        } else {
            System.out.println("\nAinda não possui bonus.");
        }
        return random;
    }

    public String vantagem() {
        vantagem = read.nextLine();
        return vantagem;
    }

    public int danoVantagem() {

        System.out.println("\nO seu alvo é um Demonio ou Morto vivo?");
        vantagem();

        if (vantagem().equalsIgnoreCase("Sim")) {
            random = Doito();
            soma += random;

            System.out.println("\nDano adicional de: " + random + " somando um total de: " + soma);
            soma *= 2;
            System.out.println("\nEle possui fraqueza! Seu dano aumentou para: " + soma);

        } else {
            System.out.println("\nNão possui bonus");
        }
        return random;

    }

    public String critico() {

        critico = read.nextLine();

        return critico;
    }

    public int danoCritico() {

        System.out.println("\nO ataque foi critico?");

        if (critico().equalsIgnoreCase("Sim")) {
            soma *= 2;

            System.out.println("\nQue ataque poderoso! Seu dano foi dobrado: " + soma);

        } else {
            System.out.println("\nInfelizmente não foi critico. Seu dano total é de: " + soma);
        }
        return soma;
    }

    public String mostro() {
        monstro = read.nextLine();
        return monstro;
    }

    public int resistencia() {

        System.out.println("\nO mostro é resistemte a ataques radiante?");

        if (mostro().equalsIgnoreCase("Sim")) {
            soma /= 2;
            System.out.println("\nDeivo a resistencia do mostro o dano foi reduzido pela metade. Totalizando: " + soma);
            System.out.println("\n********************************************************************************");


        } else {
            System.out.println("\nO montro não tem resistencia então o dano total foi de: " + soma);
            System.out.println("\n************************************************************");

        }
        return soma;
    }
}
