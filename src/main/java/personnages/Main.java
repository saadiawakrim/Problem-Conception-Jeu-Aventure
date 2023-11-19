package personnages;

import comportementsarmes.ComportementArcEtFleches;
import comportementsarmes.ComportementArme;
import comportementsarmes.ComportementHache;
import comportementsarmes.ComportementPoignard;

public class Main {
    public static void main(String[] args) {
        // Création de comportements d'arme
        ComportementArme comportementHache = new ComportementHache();
        ComportementArme comportementPoignard = new ComportementPoignard();
        ComportementArme comportementArcEtFleches = new ComportementArcEtFleches();

        // Création de personnages avec différents comportements d'arme
        Personnage reine = new Reine();
        reine.setArme(comportementHache);

        Personnage troll = new Troll();
        troll.setArme(comportementPoignard);

        Personnage chevalier = new Chevalier();
        chevalier.setArme(comportementArcEtFleches);

        Personnage roi = new Roi();
        roi.setArme(comportementHache);

        // Appel des méthodes
        reine.combattre();
        reine.utiliserArme();

        troll.combattre();
        troll.utiliserArme();

        chevalier.combattre();
        chevalier.utiliserArme();

        roi.combattre();
        roi.utiliserArme();
    }
}