package com.sio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(GREEN);
        System.out.println("#############################################");
        System.out.println("            JAVA EVAL 1 SIO 1 ALT            ");
        System.out.println("#############################################");

        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter le programme");
            System.out.println("#############################################");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("-------------------------------------------: ");
                    System.out.println("Exercice 1");
                    System.out.println("---------------------------------------------");
                    System.out.print("Entrer un nombre: ");
                    double nombre = scanner.nextDouble();

                    System.out.print("Entrer la puissance: ");
                    int puissance = scanner.nextInt();

                    while (puissance < 1) {
                        System.out.println("La puissance doit être superieur ou égal à 1");
                        System.out.print("Entrer la puissance: ");
                        puissance = scanner.nextInt();
                    }
                    double resultat = Math.pow(nombre, puissance);
                    System.out.println("le resultat de " + nombre + " puissance " + puissance + " est " + resultat);
                    System.out.println("---------------------------------------------");
                    break;


                    case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 2");
                    System.out.println("---------------------------------------------");
                    DecimalFormat df = new DecimalFormat("##.###");
                    System.out.print("Entrer le nombre de kilomètre parcourus par le client: ");
                    double nombreKm = scanner.nextDouble();
                    double montant;

                    while (nombreKm < 1){
                        System.out.println("Le nombre de kilomètre doit superieur ou égal à 1");
                        System.out.print("Entrer le nombre de kilomètre parcourus par le client: ");
                        nombreKm = scanner.nextDouble();
                    }

                    if (nombreKm < 100){
                        montant = nombreKm * 0.20;
                    }
                    else if (nombreKm < 500){
                        montant = nombreKm * 0.50;
                    }
                    else {
                        montant = nombreKm * 0.80;
                    }
                    System.out.print("Le montant à payer par le client est: " + df.format(montant));
                    System.out.println("\n---------------------------------------------");
                    break;


                    case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 3");
                    System.out.println("---------------------------------------------");
                    System.out.println("Entrer la largeur du rectangle: ");
                    double largeur = scanner.nextDouble();

                    while (largeur < 1){
                        System.out.println("la largeur doit être superieur ou égal à 1");
                        System.out.print("Entrer la largeur du rectangle: ");
                        largeur = scanner.nextDouble();
                    }
                    System.out.println("Entrer la hauteur du rectangle: ");
                    double hauteur = scanner.nextDouble();

                    while (hauteur < 1) {
                        System.out.println("la hauteur doit être superieur ou égal à 1");
                        System.out.println("Entrer la hauteur du rectangle: ");
                        hauteur = scanner.nextDouble();
                    }
                    for (int i = 0; i < hauteur; i++){
                        for (int j = 0; j < largeur; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("---------------------------------------------");
                    break;


                    case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 4");
                    System.out.println("---------------------------------------------");

                    System.out.println("Entrer un nombre :");
                    nombre = scanner.nextDouble();

                    while (nombre < 1){
                        System.out.println("le nombre doit être superieur ou égal à 1");
                        System.out.print("Entrer un nombre :");
                        nombre = scanner.nextDouble();
                    }
                    long factorielle = 1;
                    int entier = (int) nombre;
                    for (int i = 1; i <= entier; i++) {
                        factorielle *= i;
                    }
                    System.out.println("le factoriel du nombre est : " + factorielle);
                    System.out.println("---------------------------------------------");
                    break;
                case 0:
                    System.out.println(RESET);
                    System.exit(0);
                    break;

                default: System.out.println("Choix invalide"); break;

            }
        }
    }
}