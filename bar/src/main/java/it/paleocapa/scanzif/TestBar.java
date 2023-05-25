package bar.src.main.java.it.paleocapa.scanzif;

import static org.junit.Assert.*;
import org.junit.*;

public class TestBar {
    
    @Test
    public void testAggiungiCliente(){
        Bar b = new Bar();
        Cliente x = new Cliente("Mario", 40);
        try {
            b.aggiungiCliente("Mario", 40);
        } catch (ClienteGiàEsistenteException e) {
            fail("ClienteGiàEsistenteException");
        }
        
        assertTrue("Errore", b.clienti.containsKey(x.nominativo));    
    }

    @Test
    public void testAggiungiProdotto()
    {
        Bar b = new Bar();
        Prodotto x = new Prodotto("Panino", 2);
        try {
            b.aggiungiProdotto("Panino", 2);
        } catch (ProdottoGiàEsistenteException e) {
            fail("ProdottoGiàEsistenteException");
        }
        
        assertTrue("Errore", b.prodotti.containsKey(x.identificativo));   
    }

    @Test
    public void testAggiungiOrdine() throws ClienteGiàEsistenteException
    {
        Bar b = new Bar();
        Cliente x = new Cliente("Mario", 40);
        Ordine y = new Ordine(x, "Pasta", 2);
        b.aggiungiCliente("Mario", 40);
        try {
            b.aggiungiOrdine(x,"Mario", 40);
        } catch (ClienteNonTrovatoFoundException e) {
            fail("ClienteNonTrovatoFoundException");
        }
        
        assertTrue("Errore", !b.ordini.contains(y));   
    }

}