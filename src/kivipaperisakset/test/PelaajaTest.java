package kivipaperisakset.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kivipaperisakset.Pelaaja;

class PelaajaTest {

	@Test
	void testaaPelaajanValinta() {
        Pelaaja pelaaja = new Pelaaja("Testi");
        String valinta = pelaaja.pelaajanValinta();
        
        boolean validChoice = valinta.equals("kivi") ||
                valinta.equals("paperi") ||
                valinta.equals("sakset");

        assertTrue(validChoice, "Palautettu valinta hyväksytään");
	}
	
	@Test
	void testaaLisaaVoitto() {
        Pelaaja pelaaja = new Pelaaja("Testi");
        int alkuperaisetVoitot = pelaaja.getVoitot();
        pelaaja.lisaaVoitto();
        int uudetVoitot = pelaaja.getVoitot();
        
        assertEquals(alkuperaisetVoitot + 1, uudetVoitot, "Voittoja lisätään yhdellä");
	}

	@Test
	void testaaPelaajanNimi() {
        String pelaajanNimi = "Testi";
        Pelaaja pelaaja = new Pelaaja(pelaajanNimi);
        String haettuNimi = pelaaja.getNimi();
        
        assertEquals(pelaajanNimi, haettuNimi, "Pelaaja luotiin annetulla nimellä");
	}
}
