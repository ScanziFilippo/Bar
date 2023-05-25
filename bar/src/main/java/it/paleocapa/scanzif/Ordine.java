package bar.src.main.java.it.paleocapa.scanzif;

import java.time.*;

public class Ordine {
    public LocalDate data;
    public Cliente cliente;
    public Prodotto prodotto;
    public int spesaTotale = 0;
    String s = "";
    
    public Ordine(Cliente cliente, String nome, int prezzo){
        this.cliente = cliente;
        data = LocalDate.now();
        this.prodotto = new Prodotto(nome, prezzo);
    }

    @Override
    public String toString(){
        s +="Cliente: "+ cliente + "; Data: " + data;
        return s;
    }
}
