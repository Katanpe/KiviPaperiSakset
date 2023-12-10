package kivipaperisakset;

/**
 * 
 * @author Katja
 * Alustaa pelikierroksen ja pitaa kirjaa kierrosnumeroista ja tasapeleista
 */
public class Alustus{
    private int kierrosnumero = 0;
    private int tasapelit = 0;
    private Pelaaja p1;
    private Pelaaja p2;

    /**
     * Konstruktori, joka alustaa pelattavan kierroksen
     * @param p1 Ensimmäinen pelaaja
     * @param p2 Toinen pelaaja
     */
    
    public Alustus(Pelaaja p1, Pelaaja p2) {
        this.kierrosnumero += 1;
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Tulostaa pelin taman hetkisen tilanteen
     * @return kierrosnumeron muuttuja testaamista varten
     */
    public int TulostaTilanne() {
        System.out.println("Erä: " + kierrosnumero + " =====================\n");
        System.out.println("Tasapelien lukumäärä: " + tasapelit);
        System.out.println("Pelaaja 1:llä koossa " + p1.getVoitot() + " voittoa.");
        System.out.println("Pelaaja 2:llä koossa " + p2.getVoitot() + " voittoa.\n");
        return kierrosnumero;
    }

    public int getKierrosnumero() {
        return kierrosnumero;
    }

    public void lisaaKierrosnumero() {
        kierrosnumero += 1;
    }

    public int getTasapeli() {
        return tasapelit;
    }

    public void lisaaTasapeli() {
        tasapelit += 1;
    }

    public Pelaaja getPelaaja1() {
        return p1;
    }

    public Pelaaja getPelaaja2() {
        return p2;
    }
}