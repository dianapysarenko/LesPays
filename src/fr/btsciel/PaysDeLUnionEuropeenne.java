package fr.btsciel;


//Classe représentant un pays de l'Union Européenne.


public class PaysDeLUnionEuropeenne {
    String nom; //Nom du pays
    String capitale; //Capitale du pays
    double nombreDHabitants; // en millions
    int superficie; // en milliers de km²
    int anneeAdhesion; //L'année d'adhésion


    public PaysDeLUnionEuropeenne(String nom, String capitale, double nombreDHabitants, int superficie, int anneeAdhesion) {
        this.nom = nom;
        this.capitale = capitale;
        this.nombreDHabitants = nombreDHabitants;
        this.superficie = superficie;
        this.anneeAdhesion = anneeAdhesion;
    }


    public double getDensite() {
        return nombreDHabitants / superficie;
    }

    public PaysDeLUnionEuropeenne() {
    }
}