public class Bargeldauszahlung implements Rechnungsposition{
    
    protected float nettopreis;

    Bargeldauszahlung(float betrag){

        this.nettopreis = betrag;

    }

    @Override
    public float getPreis() {
        return nettopreis;
    }

}
