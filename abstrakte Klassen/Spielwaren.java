public class Spielwaren extends Ware {
    
    Spielwaren(float nettopreis){
        super(nettopreis);
    }

    @Override
    public float getPreis() {
        
        return nettopreis*(1+MWST2/100);
    }

}
