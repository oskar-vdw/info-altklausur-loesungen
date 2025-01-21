package ws21.uml;

public class Warenkorb {
    int id;
    Bestellposten[] posten;
    public Warenkorb(int id, Bestellposten[] posten){
        this.id = id;
        this.posten = posten;
    }

    public int berechnePreis(){
        int cum_preis = 0;
        for(int i=0; i<posten.length; i++){
            cum_preis += ((posten[i].getArtikel().getPreis())*posten[i].getAnzahl());

        }
        return cum_preis;
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setPosten(Bestellposten[] posten){
        this.posten = posten;
    }

    public Bestellposten[] getPosten(){
        return this.posten;
    }


}
/* Claudes Lösung:
import java.util.ArrayList;
import java.util.List;
 
public class Warenkorb {
    private int id;
    private List<Bestellposten> posten;  // Impliziert durch die Komposition
    
    public Warenkorb(int id) {
        this.id = id;
        this.posten = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }
    
    public List<Bestellposten> getPosten() {
        return posten;
    }
    
    public int berechnePreis() {
        int gesamtpreis = 0;
        for (Bestellposten p : posten) {
            gesamtpreis += p.getAnzahl() * p.getArtikel().getPreis();
        }
        return gesamtpreis;
    }
}
 */