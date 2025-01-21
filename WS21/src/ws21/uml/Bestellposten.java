package ws21.uml;

public class Bestellposten {
    int anzahl;
    Artikel artikel;
    public Bestellposten(int a, Artikel art){
        this.anzahl = a;
        this.artikel = art;
    }
    
    public int getAnzahl(){
        return this.anzahl;
    }

    public void setAnzahl(int anzahl){
        this.anzahl = anzahl;
    }

    public Artikel getArtikel(){
        return this.artikel;
    }

    public void setArtikel(Artikel artikel){
        this.artikel = artikel;
    }
    
}

/* Claudes Lösung:
public class Bestellposten {
    private int anzahl;
    private Artikel artikel;  // Impliziert durch die Assoziation
    
    public Bestellposten(int anzahl, Artikel artikel) {
        this.anzahl = anzahl;
        this.artikel = artikel;
    }
    
    public int getAnzahl() {
        return anzahl;
    }
    
    public Artikel getArtikel() {
        return artikel;
    }
}
 */