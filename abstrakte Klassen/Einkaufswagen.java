public class Einkaufswagen implements Inventurposten{
    
float nettopreis;
    
public Einkaufswagen(float preis){

    this.nettopreis = preis;

}

@Override
public float getPreis() {
    return nettopreis;
}

}
