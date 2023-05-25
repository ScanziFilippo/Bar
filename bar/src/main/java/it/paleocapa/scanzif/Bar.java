package bar.src.main.java.it.paleocapa.scanzif;

import java.util.*;

class Bar {
    public HashMap <String, Cliente> clienti;
    public HashMap <String, Prodotto> prodotti;
    public LinkedList<Ordine> ordini;

    public Bar(){
        clienti = new HashMap<>();
        prodotti = new HashMap<>();
        ordini = new LinkedList<>();
    }

    public void aggiungiCliente(String nome, int credito) throws ClienteGiàEsistenteException
    {
        Cliente x = new Cliente(nome, credito);
        
        if(clienti.containsKey(x.nominativo)){
            throw new ClienteGiàEsistenteException();
        }
        
        clienti.put(x.nominativo, x);
    }
    
    public void aggiungiProdotto(String nome, int prezzo) throws ProdottoGiàEsistenteException
    {
        Prodotto p = new Prodotto(nome, prezzo);
         
        if(prodotti.containsKey(p.identificativo))
        {
            throw new ProdottoGiàEsistenteException();
        }
        
        prodotti.put(p.identificativo, p);
    }
    
    public void aggiungiOrdine(Cliente cliente, String nome, int prezzo) throws ClienteNonTrovatoFoundException
    {
        if(!clienti.containsKey(cliente.nominativo)){
            throw new ClienteNonTrovatoFoundException();
        }
        Ordine x = new Ordine(cliente, nome, prezzo);
        ordini.add(x);
    }
    
}