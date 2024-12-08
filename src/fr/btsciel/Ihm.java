package fr.btsciel;

//Classe principale pour l'interface utilisateur.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ihm {
    public static LesPaysDeLUnionEuropeenne gestion;
    public static DecimalFormat decimalFormat = new DecimalFormat("0.##");
    public static void main(String[] args) {
        gestion = new LesPaysDeLUnionEuropeenne();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\nMenu :");
            System.out.println("1 - Lister les pays par ordre croissant du nom");
            System.out.println("2 - Lister les pays par ordre croissant de la capitale");
            System.out.println("3 - Lister les pays par ordre croissant du nombre d'habitants");
            System.out.println("4 - lister les pays par ordre croissant de la superficie");
            System.out.println("5 - Lister les pays par ordre croissant de la densité");
            System.out.println("6 - Afficher le pays le plus peuplé");
            System.out.println("7 - Afficher le pays ayant la plus grande superficie");
            System.out.println("8 - Afficher la superficie totale de l'Union Européenne");
            System.out.println("9 - Afficher le nombre d'habitants de l'Union Européenne");
            System.out.println("10 - Afficher le nombre d'habitants au mètre carré de l'Union Européenne");
            System.out.println("11 - Lister les adhésions par année");
            System.out.println("0 - Terminer la session");
            System.out.print("Votre choix: ");
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    gestion.sortByName();
                    afficherPays();
                    break;
                case 2:
                    gestion.sortByCapital();
                    afficherPays();
                    break;
                case 3:
                    gestion.sortByHabitants();
                    afficherPays();
                    break;
                case 4:
                    gestion.sortBySuperficie();
                    afficherPays();
                    break;
                case 5:
                    gestion.sortByDensite();
                    afficherPays();
                    break;
                case 6:
                    System.out.println("Le pays le plus peuplé est " + gestion.lePaysLePlusPeuple().nom + " avec " + (gestion.lePaysLePlusPeuple().nombreDHabitants / 1000000) + " millions d'habitants");
                    break;
                case 7:
                    System.out.println("Le pays ayant la plus grande superficie est " + gestion.lePaysGrandeSuperficie().nom + " avec " + (gestion.lePaysGrandeSuperficie().superficie) + " km² de superficie");
                    break;
                case 8:
                    System.out.println("La superficie totale est " + gestion.getSuperficieTotale() + " km²");
                    break;
                case 9:
                    System.out.println("Le nombre d'habitants total est " + decimalFormat.format(gestion.getTousHabitants()) + " millions");
                    break;
                case 10:
                    System.out.println("La densite totale est " + decimalFormat.format(gestion.getHabitantsParDensite()) + " habitants par km²");
                    break;
                case 11:
                    System.out.println("Entrez l'annee: ");
                    int annee = scanner.nextInt();
                    int nombrePays = 0;
                    for (int i = 0; i < gestion.lesPays.length; i++) {
                        if (gestion.lesPays[i].anneeAdhesion == annee) {
                            nombrePays++;
                            break;
                        }
                    }
                    if (nombrePays > 0) {
                        System.out.println("Nom\t\t\t\tCapitale\t\tHabitants (en millions)\t\t\t\tSuperficie (km²)\t\t\t\tDensite\t\t\t\tAdhesion");
                        for (int i = 0; i < gestion.lesPays.length; i++) {
                            if (gestion.lesPays[i].anneeAdhesion == annee) {
                                System.out.println(
                                        gestion.lesPays[i].nom + "\t\t"
                                                + gestion.lesPays[i].capitale + "\t\t\t\t\t"
                                                + decimalFormat.format(gestion.lesPays[i].nombreDHabitants / 1000000) + "\t\t\t\t\t\t\t\t"
                                                + gestion.lesPays[i].superficie + "\t\t\t\t\t\t"
                                                + decimalFormat.format(gestion.lesPays[i].getDensite()) + "\t\t\t\t"
                                                + gestion.lesPays[i].anneeAdhesion
                                );
                            }
                        }
                    } else {
                        System.out.println("Pas de pays correspondants à cette année");
                    }
                    break;
                case 0:
                    System.out.print("La session est terminée");
            }
        } while (choix != 0);
    }

    public static void afficherPays() {
        System.out.println("Nom\t\t\t\tCapitale\t\tHabitants (en millions)\t\t\t\tSuperficie (km²)\t\t\t\tDensite\t\t\t\tAdhesion");

        for (int i = 0; i < gestion.lesPays.length; i++) {
            System.out.println(
                    gestion.lesPays[i].nom + "\t\t"
                    + gestion.lesPays[i].capitale + "\t\t\t\t\t"
                    + decimalFormat.format(gestion.lesPays[i].nombreDHabitants / 1000000) + "\t\t\t\t\t\t\t\t"
                    + gestion.lesPays[i].superficie + "\t\t\t\t\t\t"
                    + decimalFormat.format(gestion.lesPays[i].getDensite()) + "\t\t\t\t"
                    + gestion.lesPays[i].anneeAdhesion
            );
        }
    }
}