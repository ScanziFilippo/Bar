package bar.src.main.java.it.paleocapa.scanzif;

public class Prodotto {
    int prezzo;
    String identificativo;
    String nome;

    Prodotto(String nome, int prezzo){
        this.prezzo = prezzo;
        this.nome = nome;
        this.identificativo = hashCode(nome, prezzo);
    }
    
    @Override
    public String toString()
    {
        return "Nomitativo: " + nome + " Identificativo: " + identificativo + " Prezzo: " + String.valueOf(prezzo);
    }
    
    public String hashCode(String nome, int prezzo)
    {
        String nuovoIdentificativo = nome+String.valueOf(prezzo);
        return nuovoIdentificativo;
    }
}
