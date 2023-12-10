package kivipaperisakset.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kivipaperisakset.Kierros;

class KierrosTest {

	@Test
	public void pelaaja1Voittaa() {
        Kierros kierros = new Kierros("kivi", "sakset");
        int tulos = kierros.pelaa();
        assertEquals(1, tulos, "Pelaaja 1 voittaa");
	}
	
    @Test
    public void pelaaja2Voittaa() {
        Kierros kierros = new Kierros("sakset", "kivi");
        int tulos = kierros.pelaa();
        assertEquals(2, tulos, "Pelaaja 2 voittaa");
    }
    
    @Test
    public void testaaTasapeli() {
        Kierros kierros = new Kierros("paperi", "paperi");
        int tulos = kierros.pelaa();
        assertEquals(0, tulos, "Tasapeli tuli");
    }
    
    @Test
    public void testaaTyhmaSyote() {
        Kierros kierros = new Kierros("tyham", "kivi");
        int result = kierros.pelaa();
        assertEquals(-1, result, "Vaara arvo loydetty");
    }
}
