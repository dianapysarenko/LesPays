package fr.btsciel;

//Gestion des pays de l'Union Européenne.

import java.util.Arrays;
import java.util.Comparator;

public class LesPaysDeLUnionEuropeenne {
    public PaysDeLUnionEuropeenne[] lesPays = new PaysDeLUnionEuropeenne[27];
    public LesPaysDeLUnionEuropeenne () {
        for (int i = 0; i < lesPays.length; i++) {
            lesPays[i] = new PaysDeLUnionEuropeenne();
        } //Constructeur qui initialise la liste des pays.
        lesPays[0].nom = "Allemagne";
        lesPays[0].capitale = "Berlin";
        lesPays[0].nombreDHabitants = 83445000;
        lesPays[0].superficie = 357569;
        lesPays[0].anneeAdhesion = 1958;
        lesPays[1].nom = "Autriche";
        lesPays[1].capitale = "Vienne";
        lesPays[1].nombreDHabitants = 9158750;
        lesPays[1].superficie = 83882;
        lesPays[1].anneeAdhesion = 1995;
        lesPays[2].nom = "Belgique";
        lesPays[2].capitale = "Bruxelles";
        lesPays[2].nombreDHabitants = 11832049;
        lesPays[2].superficie = 30667;
        lesPays[2].anneeAdhesion = 1958;
        lesPays[3].nom = "Bulgarie";
        lesPays[3].capitale = "Sofia";
        lesPays[3].nombreDHabitants = 6445481;
        lesPays[3].superficie = 110996;
        lesPays[3].anneeAdhesion = 2007;
        lesPays[4].nom = "Chypre";
        lesPays[4].capitale = "Nicosie";
        lesPays[4].nombreDHabitants = 933505;
        lesPays[4].superficie = 9253;
        lesPays[4].anneeAdhesion = 2004;
        lesPays[5].nom = "Croatie";
        lesPays[5].capitale = "Zagreb";
        lesPays[5].nombreDHabitants = 3861967;
        lesPays[5].superficie = 56594;
        lesPays[5].anneeAdhesion = 2013;
        lesPays[6].nom = "Danemark";
        lesPays[6].capitale = "Copenhague";
        lesPays[6].nombreDHabitants = 5961249;
        lesPays[6].superficie = 42925;
        lesPays[6].anneeAdhesion = 1973;
        lesPays[7].nom = "Espagne";
        lesPays[7].capitale = "Madrid";
        lesPays[7].nombreDHabitants = 48610458;
        lesPays[7].superficie = 505983;
        lesPays[7].anneeAdhesion = 1986;
        lesPays[8].nom = "Estonie";
        lesPays[8].capitale = "Tallinn";
        lesPays[8].nombreDHabitants = 1374687;
        lesPays[8].superficie = 45336;
        lesPays[8].anneeAdhesion = 2004;
        lesPays[9].nom = "Finlande";
        lesPays[9].capitale = "Helsinki";
        lesPays[9].nombreDHabitants = 5603851;
        lesPays[9].superficie = 338363;
        lesPays[9].anneeAdhesion = 1995;
        lesPays[10].nom = "France";
        lesPays[10].capitale = "Paris";
        lesPays[10].nombreDHabitants = 68401997;
        lesPays[10].superficie = 638475;
        lesPays[10].anneeAdhesion = 1958;
        lesPays[11].nom = "Grèce";
        lesPays[11].capitale = "Athènes";
        lesPays[11].nombreDHabitants = 10397193;
        lesPays[11].superficie = 131694;
        lesPays[11].anneeAdhesion = 1981;
        lesPays[12].nom = "Hongrie";
        lesPays[12].capitale = "Budapest";
        lesPays[12].nombreDHabitants = 9584627;
        lesPays[12].superficie = 93012;
        lesPays[12].anneeAdhesion = 2004;
        lesPays[13].nom = "Irlande";
        lesPays[13].capitale = "Dublin";
        lesPays[13].nombreDHabitants = 5343805;
        lesPays[13].superficie = 69947;
        lesPays[13].anneeAdhesion = 1973;
        lesPays[14].nom = "Italie";
        lesPays[14].capitale = "Rome";
        lesPays[14].nombreDHabitants = 58989749;
        lesPays[14].superficie = 302073;
        lesPays[14].anneeAdhesion = 1958;
        lesPays[15].nom = "Lettonie";
        lesPays[15].capitale = "Riga";
        lesPays[15].nombreDHabitants = 1871882;
        lesPays[15].superficie = 64594;
        lesPays[15].anneeAdhesion = 2004;
        lesPays[16].nom = "Lituanie";
        lesPays[16].capitale = "Vilnius";
        lesPays[16].nombreDHabitants = 2885891;
        lesPays[16].superficie = 65284;
        lesPays[16].anneeAdhesion = 2004;
        lesPays[17].nom = "Luxembourg";
        lesPays[17].capitale = "Luxembourg";
        lesPays[17].nombreDHabitants = 672050;
        lesPays[17].superficie = 2595;
        lesPays[17].anneeAdhesion = 1958;
        lesPays[18].nom = "Malte";
        lesPays[18].capitale = "La Valette";
        lesPays[18].nombreDHabitants = 563443;
        lesPays[18].superficie = 316;
        lesPays[18].anneeAdhesion = 2004;
        lesPays[19].nom = "Pays-Bas";
        lesPays[19].capitale = "Amsterdam";
        lesPays[19].nombreDHabitants = 17942942;
        lesPays[19].superficie = 37391;
        lesPays[19].anneeAdhesion = 1958;
        lesPays[20].nom = "Pologne";
        lesPays[20].capitale = "Varsovie";
        lesPays[20].nombreDHabitants = 36620970;
        lesPays[20].superficie = 311928;
        lesPays[20].anneeAdhesion = 2004;
        lesPays[21].nom = "Portugal";
        lesPays[21].capitale = "Lisbonne";
        lesPays[21].nombreDHabitants = 10639726;
        lesPays[21].superficie = 92226;
        lesPays[21].anneeAdhesion = 1986;
        lesPays[22].nom = "Roumanie";
        lesPays[22].capitale = "Bucarest";
        lesPays[22].nombreDHabitants = 19064409;
        lesPays[22].superficie = 238398;
        lesPays[22].anneeAdhesion = 2007;
        lesPays[23].nom = "Slovaquie";
        lesPays[23].capitale = "Bratislava";
        lesPays[23].nombreDHabitants = 5424687;
        lesPays[23].superficie = 49035;
        lesPays[23].anneeAdhesion = 2004;
        lesPays[24].nom = "Slovénie";
        lesPays[24].capitale = "Ljubljana";
        lesPays[24].nombreDHabitants = 2123949;
        lesPays[24].superficie = 20273;
        lesPays[24].anneeAdhesion = 2004;
        lesPays[25].nom = "Suède";
        lesPays[25].capitale = "Stockholm";
        lesPays[25].nombreDHabitants = 10551707;
        lesPays[25].superficie = 447424;
        lesPays[25].anneeAdhesion = 1995;
        lesPays[26].nom = "Tchéquie";
        lesPays[26].capitale = "Prague";
        lesPays[26].nombreDHabitants = 10900555;
        lesPays[26].superficie = 78871;
        lesPays[26].anneeAdhesion = 2006;
    }

    public void sortByName() {
        Arrays.sort(lesPays, Comparator.comparing(p -> p.nom));
    }

    public void sortByCapital() {
        Arrays.sort(lesPays, Comparator.comparing(p -> p.capitale));
    }

    public void sortByHabitants() {
        Arrays.sort(lesPays, Comparator.comparing(p -> p.nombreDHabitants));
    }

    public void sortBySuperficie() {
        Arrays.sort(lesPays, Comparator.comparing(p -> p.superficie));
    }

    public void sortByDensite() {
        Arrays.sort(lesPays, Comparator.comparing(PaysDeLUnionEuropeenne::getDensite));
    }

    public PaysDeLUnionEuropeenne lePaysLePlusPeuple() {
        sortByHabitants();
        return lesPays[lesPays.length - 1];
    }

    public PaysDeLUnionEuropeenne lePaysGrandeSuperficie() {
        sortBySuperficie();
        return lesPays[lesPays.length - 1];
    }

    public long getSuperficieTotale() {
        int superficieTotale = 0;
        for (int i = 0; i < lesPays.length; i++) {
            superficieTotale += lesPays[i].superficie;
        }
        return superficieTotale;
    }

    public double getTousHabitants() {
        double tousHabitants = 0;
        for (int i = 0; i < lesPays.length; i++) {
            tousHabitants += lesPays[i].nombreDHabitants / 1000000;
        }
        return tousHabitants;
    }

    public double getHabitantsParDensite() {
        return (getTousHabitants() * 1000000) / getSuperficieTotale();
    }
}