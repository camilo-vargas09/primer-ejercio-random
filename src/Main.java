import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int d1, d2, d3, guardarDato1 = 0, guardarDato2 = 0, guardarDato3 = 0;

        for (int i = 0; i <= 3; i++) {
            d1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            d2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            d3 = aleatorio.nextInt((6 - 1) + 1) + 1;
            guardarDato1 += d1;
            guardarDato2 += d2;
            guardarDato3 += d3;
        }

        System.out.println("total dado 1 " + guardarDato1);
        System.out.println("total dado 2 " + guardarDato2);
        System.out.println("total dado 3 " + guardarDato3);

        //por si hay empates
        if (guardarDato1 == guardarDato2 && guardarDato2 == guardarDato3) {
            System.out.println("¡Empate entre los tres dados!");
        } else if (guardarDato1 == guardarDato2 && guardarDato1 > guardarDato3) {
            System.out.println("Empate entre dado 1 y dado 2 como ganadores.");
            System.out.println("El tercer lugar es del dado 3.");
        }else if (guardarDato1 == guardarDato2 && guardarDato1 < guardarDato3) {
                System.out.println("El primer lugar es del dado 1.");
                System.out.println("Empate entre dado 1 y dado 2 como perdedores.");
        } else if (guardarDato1 == guardarDato3 && guardarDato1 > guardarDato2) {
            System.out.println("Empate entre dado 1 y dado 3 como ganadores.");
            System.out.println("El tercer lugar es del dado 2.");
        } else if (guardarDato1 == guardarDato3 && guardarDato1 < guardarDato2) {
            System.out.println("El primer lugar es del dado 2.");
            System.out.println("Empate entre dado 1 y dado 3 como segundo y tercer lugar.");

        }else if (guardarDato2 == guardarDato3 && guardarDato2 > guardarDato1) {
            System.out.println("Empate entre dado 2 y dado 3 como ganadores.");
            System.out.println("El tercer lugar es del dado 1.");

        } else if (guardarDato1 > guardarDato2 && guardarDato1 > guardarDato3) {
            System.out.println("El dado ganador es el dado 1.");
            if (guardarDato2 > guardarDato3) {
                System.out.println("El segundo lugar es del dado 2.");
                System.out.println("El tercer lugar es del dado 3.");
            } else {
                System.out.println("El segundo lugar es del dado 3.");
                System.out.println("El tercer lugar es del dado 2.");
            }
        } else if (guardarDato2 > guardarDato1 && guardarDato2 > guardarDato3) {
            System.out.println("El dado ganador es el dado 2.");
            if (guardarDato1 > guardarDato3) {
                System.out.println("El segundo lugar es del dado 1.");
                System.out.println("El tercer lugar es del dado 3.");
            } else {
                System.out.println("El segundo lugar es del dado 3.");
                System.out.println("El tercer lugar es del dado 1.");
            }
        } else if (guardarDato3 > guardarDato1 && guardarDato3 > guardarDato2) {
            System.out.println("El dado ganador es el dado 3.");
            if (guardarDato1 > guardarDato2) {
                System.out.println("El segundo lugar es del dado 1.");
                System.out.println("El tercer lugar es del dado 2.");
            } else {
                System.out.println("El segundo lugar es del dado 2.");
                System.out.println("El tercer lugar es del dado 1.");
            }
        }
    }
}
