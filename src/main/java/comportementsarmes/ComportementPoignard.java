package comportementsarmes;

public class ComportementPoignard implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Attaque avec un poignard.");
    }
}
