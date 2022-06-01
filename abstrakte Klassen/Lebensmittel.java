public class Lebensmittel extends Ware {
  
public Lebensmittel(float nettopreis){
    
    super(nettopreis);

}    

public float getPreis(){

    return nettopreis*(1+MWST1/100);

}

}
