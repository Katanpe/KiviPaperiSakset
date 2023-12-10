package kivipaperisakset;

/**
 *
 * @author Ira Dook
 */


/**
 * 
 * @author Katja
 *	Luokka, joka kokoaa kaikki pelin osat yhteen. Taalla myos muutetaan pelaajien nimet ja kierrosmaara
 */
public class Peli {
    Pelaaja p1 = new Pelaaja("Pelaaja 1"); //vaihda nimi jos haluat
    Pelaaja p2 = new Pelaaja("Pelaaja 2"); //vaihda nimi jos haluat
    Alustus alustus = new Alustus(p1, p2);
    int halututVoitot = 3; //muuta jos haluat lisätä tai vähentää kierrosmäärää
    boolean peliLoppui = false;
    Pelaaja voittaja;
    
    /**
     * Metodi, joka pyorittaa kierroksen ja ilmoittaa kierroksen tuloksen
     */
    public void pelaa() {
        alustus.TulostaTilanne();
        String p1Valinta = p1.pelaajanValinta();
        String p2Valinta = p2.pelaajanValinta();
        Kierros kierros = new Kierros(p1Valinta, p2Valinta);

        int tulos = kierros.pelaa();

        switch (tulos) {
            case 1:
                System.out.println("Pelaaja 1 voitti.\n");
                p1.lisaaVoitto();
                break;
            case 2:
                System.out.println("Pelaaja 2 voitti.\n");
                p2.lisaaVoitto();
                break;
            case 0:
                System.out.println("Tasapeli! Ei pisteitä\n");
                alustus.lisaaTasapeli();
                break;
            default:
                System.out.println("Jotain meni pieleen.\n");
                break;
        }

        if ((p1.getVoitot() >= halututVoitot) || (p2.getVoitot() >= halututVoitot)) {
            peliLoppui = true;
            if (p1.getVoitot() >= halututVoitot) {
                voittaja = p1;
            } else  {
                voittaja = p2;
            }
            System.out.println("PELI PÄÄTTYY");
        }

        alustus.lisaaKierrosnumero();
    }

    public Pelaaja getVoittaja() {
        return voittaja;
     }

    public boolean getLoppuuko() {
        return peliLoppui;
    }
    
    public int getHalututVoitot() {
    	return halututVoitot;
    }
    
    public Pelaaja getPelaaja1() {
    	return p1;
    }
    
    public Pelaaja getPelaaja2() {
    	return p2;
    }
}
