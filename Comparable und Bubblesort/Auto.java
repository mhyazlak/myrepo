public class Auto implements Comparable<Auto>{
    
    int Baujahr;
    int KMStand;
    String Marke;
    String Modell;

    Auto(String Marke,String Modell,int Baujahr, int KMStand){

        this.Marke = Marke;
        this.KMStand = KMStand;
        this.Modell = Modell;
        this.Baujahr = Baujahr;

    }

    @Override
    public int compareTo(Auto o) {
        if(this.Baujahr > o.Baujahr){
            return 1;
        }
        if(this.Baujahr < o.Baujahr){
            return -1;
        }
        else{
            if(this.KMStand > o.KMStand){
                return 1;
            }
            if(this.KMStand < o.KMStand){
                return -1;
            }
            else{
                if(this.Marke.compareTo(o.Marke) > 0){
                    return 1;
                }
                if(this.Marke.compareTo(o.Marke) < 0){
                    return -1;
                } 
                else{
                    if(this.Modell.compareTo(o.Modell) > 0){
                        return 1;
                    }
                    if(this.Modell.compareTo(o.Modell) < 0){
                        return -1;
                    } 
                    else{
                        return 0;
                    }
                }
            }
            
        }
        
    }

}
