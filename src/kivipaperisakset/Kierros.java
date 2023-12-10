package kivipaperisakset;

/**
 * 
 * @author Katja
 * Luokka, joka tuomaroi kierroksen
 */
public class Kierros {
    String p1Valinta;
    String p2Valinta;

    String[][] valinnat = {{"kivi", "paperi"}, 
                            {"kivi", "sakset"},
                            {"sakset", "kivi"},
                            {"sakset", "paperi"},
                            {"paperi", "sakset"},
                            {"paperi", "kivi"},
                            {"kivi", "kivi"}, 
                            {"paperi", "paperi"},
                            {"sakset", "sakset"}};

    /**
     * Konstruktori, joka valittaa luokalle pelaajien valinnat (joko kivi, paperi tai sakset)
     * @param p1Valinta Ensimmaisen pelaajan valinta
     * @param p2Valinta Toisen pelaajan valinta
     */
    public Kierros(String p1Valinta, String p2Valinta) {
        this.p1Valinta = p1Valinta;
        this.p2Valinta = p2Valinta;
    }

    /**
     * Metodi, joka valitsee voittajan
     * @return kokonaisluku joka kertoo kumpi voittaa vai tuleeko tasapeli
     */
    public int pelaa() {
        //palauta 1, jos pelaaja 1 voittaa
        //palauta 2, jos pelaaja 2 voittaa
        //palauta 0 jos tasapeli
        //palauta -1, jos bugi
        int tulos = -1;

        for (int i = 0; i < valinnat.length; i++) {
            if (p1Valinta.equals(valinnat[i][0]) && p2Valinta.equals(valinnat[i][1])) {
                tulos = 1;
                break;
            } else if (p1Valinta.equals(valinnat[i][1]) && p2Valinta.equals(valinnat[i][0])) {
                tulos = 2;
                break;
            } else if (p1Valinta.equals(valinnat[i][0]) && p2Valinta.equals(valinnat[i][0])) {
                tulos = 0;
                break;
            }
        }
        return tulos;
    }
}
