package bar.src.main.java.it.paleocapa.scanzif;

public class Cliente {
    String nominativo;
    int credito;

    Cliente(String nominativo, int credito)
    {
        this.nominativo = nominativo;
        this.credito = credito;
    }
    
    public void setCredito(int credito) 
    {
        this.credito = credito;
    }
    
    public String hashCode(String nome, int prezzo)
    {
        String nominativo = nome+String.valueOf(prezzo);
        
        int h = nominativo.hashCode();
        h = h % nominativo.length();
        h = h < 0 ? -h : h;
        
        nominativo = String.valueOf(h);
        return nominativo;
    }

    @Override
    public String toString()
    {
        return "Nomitativo: " + nominativo + " Credito: " + String.valueOf(credito);
    }
   
}
