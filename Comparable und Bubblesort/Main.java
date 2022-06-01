import java.util.ArrayList;
import java.util.Random;

import javax.swing.text.View;

public class Main{

public static void main(String[] args) {
    
ArrayList<Auto> uListe = new ArrayList<Auto>();
uListe.add(new Auto("VW", "Polo", 2000, 200000));

uListe.add(new Auto("VW", "Golf", 2000, 200000));

uListe.add(new Auto("Audi", "A4", 2000, 200000));

uListe.add(new Auto("Hyundai", "i30", 2001, 210000));
Random rand = new Random();

for(int i = 0; i< 1000; i++){}



for(int i =0; i < uListe.size()-1;i++){

    
    
    if(uListe.get(i).compareTo(uListe.get(i+1))>0)
    {
        Auto temp = uListe.get(i);
        uList = uListe.get(i);
        uListe.get(i) = temp;

    }


}

}}