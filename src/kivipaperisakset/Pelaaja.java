
package kivipaperisakset;

import java.util.Random;

/**
 *
 * @author Ira Dook
 * @author Katja
 * 
 * Luokka, jossa luodaan pelin pelaajat
 */
public class Pelaaja  {
    private int voitot;
    private String nimi;
    private String[] valinnat = {"kivi", "paperi", "sakset"};

    public Pelaaja(String nimi) {
        this.nimi = nimi;
    }

    /**
     * Metodi, joka valitsee pelaajalle joko kivi, paperi tai sakset
     * @return palauttaa pelaajan valitseman stringin
     */
    public String pelaajanValinta() {
        String valinta = "";
        Random random = new Random();
        int randomIndex = random.nextInt(valinnat.length);
        valinta = valinnat[randomIndex];
        return valinta;
    }

    public void lisaaVoitto() {
        voitot++;
    }

    public int getVoitot() {
        return voitot;
    }

    public String getNimi() {
        return nimi;
    }
}
