import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static final String EURO = "\u20AC";

    public static void main(String[] args) {
        
        Lebensmittel lm = new Lebensmittel(10f);
        Kartenspiel ks = new Kartenspiel(4f);
        Spielwaren sw = new Spielwaren(20f);
        Brot b = new Brot(1.8f);
        Bargeldauszahlung aus = new Bargeldauszahlung(50f);
       

        List<Rechnungsposition> liste= new ArrayList<>();
        List<Inventurposten> liste2 = new ArrayList<>();

        liste.add(lm);
        liste.add(ks);
        liste.add(sw);
        liste.add(b);
        liste.add(aus);
        liste2.add(lm);
        liste2.add(ks);
        liste2.add(sw);
        liste2.add(b);
        //liste2.add(aus);
        liste2.add(new Mobiliar(200));
        liste2.add(new Einkaufswagen(300));
        
        float sum = 0;

        System.out.println("Rechnung: ");
        for (Rechnungsposition w : liste){
            sum+=w.getPreis();
            
            String name =  w.getClass().getName();
            float price = w.getPreis();
            String format ="%1$03d\t%2$-25s%3$7.2f ";
            String output = String.format(format,liste.indexOf(w)+1, name,price);
           System.out.println(output); 
            
        }

        System.out.println("Gesamtpreis: "+sum +"€");

        System.out.println("Inventurposten:");
        for(Inventurposten i : liste2){
            String name =  i.getClass().getName();
            float price = i.getPreis();
            String format ="%1$03d\t%2$-25s%3$7.2f ";
            String output = String.format(format,liste2.indexOf(i)+1, name,price);
            System.out.println(output); 
        }
        
    }

}
