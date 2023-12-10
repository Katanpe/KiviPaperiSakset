package kivipaperisakset.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kivipaperisakset.Alustus;
import kivipaperisakset.Pelaaja;

class AlustusTest {

	@Test
	public void testaaTulostaTilanne() {
        Pelaaja pelaaja1 = new Pelaaja("Pelaaja 1");
        Pelaaja pelaaja2 = new Pelaaja("Pelaaja 2");
        Alustus alustus = new Alustus(pelaaja1, pelaaja2);

        int kierroksenNumero = alustus.TulostaTilanne();
        
        assertEquals(1, kierroksenNumero, "Palautettu kierrosnumero 1 alustamisen jälkeen.");
	}
	
	@Test
	public void testaaKierroksenLisays() {
        Pelaaja pelaaja1 = new Pelaaja("Pelaaja 1");
        Pelaaja pelaaja2 = new Pelaaja("Pelaaja 2");
        Alustus alustus = new Alustus(pelaaja1, pelaaja2);

        int alkuperainenKierrosNro = alustus.getKierrosnumero();
        alustus.lisaaKierrosnumero();
        int uusiKierrosNro = alustus.getKierrosnumero();
        
        assertEquals(alkuperainenKierrosNro + 1, uusiKierrosNro, "Kierrosnumeron kasvattaminen yhdel1a onnistui");
	}
    
	@Test
	public void testaaLisaaTasapeli() {
        Pelaaja pelaaja1 = new Pelaaja("Pelaaja 1");
        Pelaaja pelaaja2 = new Pelaaja("Pelaaja 2");
        Alustus alustus = new Alustus(pelaaja1, pelaaja2);

        int alkuperaisetTasapelit = alustus.getTasapeli();
        alustus.lisaaTasapeli();
        int uudetTasapelit = alustus.getTasapeli();
        
        assertEquals(alkuperaisetTasapelit + 1, uudetTasapelit, "Tasapelejen kasvattaminen yhdella onnistui");
	}
	
	@Test
	public void noudaPelaaja1() {
        Pelaaja pelaaja1 = new Pelaaja("Pelaaja 1");
        Pelaaja pelaaja2 = new Pelaaja("Pelaaja 2");
        Alustus alustus = new Alustus(pelaaja1, pelaaja2);

        Pelaaja noudettuPelaaja = alustus.getPelaaja1();
        
        assertEquals(pelaaja1, noudettuPelaaja, "Pelaaja 1 objektin nouto onnistui");
	}
	
	@Test
	public void noudaPelaaja2() {
        Pelaaja pelaaja1 = new Pelaaja("Pelaaja 1");
        Pelaaja pelaaja2 = new Pelaaja("Pelaaja 2");
        Alustus alustus = new Alustus(pelaaja1, pelaaja2);

        Pelaaja noudettuPelaaja = alustus.getPelaaja2();
        
        assertEquals(pelaaja2, noudettuPelaaja, "Pelaaja 2 objektin nouto onnistui");
	}
}
