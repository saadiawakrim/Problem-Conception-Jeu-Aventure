package personnages;

import comportementsarmes.ComportementArme;

public abstract class Personnage {
    protected ComportementArme arme;

    public void combattre() {
        System.out.println("Le personnage combat.");
    }

    public void utiliserArme() {
        if (arme != null) {
            arme.utiliserArme();
        } else {
            System.out.println("Le personnage n'a pas d'arme.");
        }
    }

    public void setArme(ComportementArme arme) {
        this.arme = arme;
    }
}
