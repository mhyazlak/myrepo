import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Date;

public class Main {

    public static Auto createAuto() {
        Random rand = new Random();
        String marken[] = new String[] { "Audi", "BMW", "Mercedes", "VW" };
        String marke = marken[rand.nextInt((4 - 0) + 0) + 0];
        int baujahr = rand.nextInt(2022 - 1950 + 1) + 1950;
        int kmstand = rand.nextInt(300000 - 0 + 1) + 0;
        return new Auto(marke, baujahr, kmstand);
    }

    public static void printList(ArrayList<Auto> list) {
        System.out.printf("%-13s %-13s %s \n", "Marke", "Baujahr", "KMStand");

        for (Auto a : list) {
            System.out.println(a.toString());
        }
    }

    public static void main(String[] args) {

        int cars = 1000;
        ArrayList<Auto> listeBubbleSort = new ArrayList<>();
        ArrayList<Auto> listeCollectionSort = new ArrayList<>();

        for (int i = 0; i < cars; i++) {
            listeBubbleSort.add(createAuto());
        }
        for (int i = 0; i < cars; i++) {
            listeCollectionSort.add(createAuto());
        }

        // BubbleSort
        LocalDateTime beforeBubble = LocalDateTime.now();

        for (int j = 0; j < listeBubbleSort.size(); j++) {
            for (int i = 0; i < listeBubbleSort.size() - 1; i++) {

                Auto temp = listeBubbleSort.get(i);
                if (listeBubbleSort.get(i).compareTo(listeBubbleSort.get(i + 1)) > 0) {
                    listeBubbleSort.set(i, listeBubbleSort.get(i + 1));
                    listeBubbleSort.set(i + 1, temp);
                }

            }
        }

        LocalDateTime afterBubble = LocalDateTime.now();
        long diff = ChronoUnit.NANOS.between(beforeBubble, afterBubble);

        System.out.println("Anzahl der Autos in der Liste: " + cars);

        System.out.printf("%-20s %15dns \n", "Bubble Sort", diff);

        // printList(listeBubbleSort);

        // Collection Sort
        LocalDateTime beforeCollection = LocalDateTime.now();

        Collections.sort(listeCollectionSort);

        LocalDateTime afterCollection = LocalDateTime.now();
        long diff2 = ChronoUnit.NANOS.between(beforeCollection, afterCollection);

        System.out.printf("%-20s %15dns \n", "Collection Sort", diff2);

        // printList(listeCollectionSort);

    }
}