package kivipaperisakset;

/**
 * 
 * @author Katja
 * Luokka, joka kaynnistaa pelin ja huolehtii kierrosten vaihtamisesta. Julistaa myos voittajan koko pelille.
 */
public class Main {
    public static void main(String args[]) {
        Peli peli = new Peli();
        boolean peliKaynnissa = true;

        while (peliKaynnissa) {
            peli.pelaa();
            boolean loppuuko = peli.getLoppuuko();
            if (loppuuko == true) {
                peliKaynnissa = false;
            }
        }
        
        Pelaaja voittaja = peli.getVoittaja();
        System.out.println("Pelin voittaja: " + voittaja.getNimi());
    }
}
