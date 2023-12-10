package kivipaperisakset.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kivipaperisakset.Pelaaja;
import kivipaperisakset.Peli;

class PeliTest {

	@Test
	public void testaaPelinLoppu() {
        Peli peli = new Peli();
        assertFalse(peli.getLoppuuko(), "Peli ei ole loppunut ennen sen aloitusta");
        while (!peli.getLoppuuko()) {
            peli.pelaa();
        }
        assertTrue(peli.getLoppuuko(), "Peli loppuu");
	}
	
	@Test
	public void testaaOikeaVoittaja() {
        Peli peli = new Peli();
        Pelaaja oletettuVoittaja = null;

        boolean peliKaynnissa = true;

        while (peliKaynnissa) {
            peli.pelaa();
            boolean loppuuko = peli.getLoppuuko();
            if (loppuuko == true) {
                peliKaynnissa = false;
            }
        }
        
        if (peli.getPelaaja1().getVoitot() >= peli.getHalututVoitot()) {
            oletettuVoittaja = peli.getPelaaja1();
        } else if (peli.getPelaaja2().getVoitot() >= peli.getHalututVoitot()) {
            oletettuVoittaja = peli.getPelaaja2();
        }

        assertEquals(oletettuVoittaja, peli.getVoittaja(), "Oikea voittaja palautettiin");
	}

}
