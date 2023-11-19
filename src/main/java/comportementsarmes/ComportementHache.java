package comportementsarmes;

public class ComportementHache implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Attaque avec une hache.");
    }
}
