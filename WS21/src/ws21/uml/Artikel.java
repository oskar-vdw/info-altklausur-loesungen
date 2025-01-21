package ws21.uml;

public class Artikel {
    String bezeichnung;
    int preis;

    public Artikel(String bezeichnung, int preis){
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public void setBezeichnung(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung(){
        return this.bezeichnung;
    }

    public void setPreis(int preis){
        this.preis = preis;
    }

    public int getPreis(){
        return this.preis;
    }
}

/* Claudes Lösung:
public class Artikel {
    private String bezeichnung;
    private int preis;
    
    public Artikel(String bezeichnung, int preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }
    
    public String getBezeichnung() {
        return bezeichnung;
    }
    
    public int getPreis() {
        return preis;
    }
} */