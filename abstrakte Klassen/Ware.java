
    abstract class Ware implements Rechnungsposition,Inventurposten
    {
        public float nettopreis;

        public float MWST1 = 7.0f;
        public float MWST2 = 19.0f;
        public Ware(float preis)
        { 
            this.nettopreis = preis;
        }
    
       
        
     }

