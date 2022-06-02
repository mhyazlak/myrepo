import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    static String marken[] = new String[] { "Audi", "BMW", "Mercedes", "VW" };
    static Random rand = new Random();

    public static void main(String[] args) {

        for (int cars = 10; cars <= 10000; cars = cars * 10) {

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
            bubblesort(listeBubbleSort);
            LocalDateTime afterBubble = LocalDateTime.now();

            long diff = ChronoUnit.NANOS.between(beforeBubble, afterBubble);

            System.out.println("Anzahl der Autos in der Liste: " + cars);

            System.out.printf("%-20s %15dns \n", "Bubble Sort", diff);

            // Collection Sort
            LocalDateTime beforeCollection = LocalDateTime.now();

            Collections.sort(listeCollectionSort);

            LocalDateTime afterCollection = LocalDateTime.now();
            long diff2 = ChronoUnit.NANOS.between(beforeCollection, afterCollection);

            System.out.printf("%-20s %15dns \n", "Collection Sort", diff2);

        }
        ArrayList<Auto> sortierteListe1 = sortierteListe();
        ArrayList<Auto> sortierteListe2 = sortierteListe();

        // Sort einer sortierten Liste

        System.out.println("\nSortierte Listen");

        // sortierte Liste mit bubblesort
        LocalDateTime beforeBubble = LocalDateTime.now();
        bubblesort(sortierteListe1);
        LocalDateTime afterBubble = LocalDateTime.now();

        long diff = ChronoUnit.NANOS.between(beforeBubble, afterBubble);

        System.out.printf("%-20s %15dns \n", "Bubble Sort", diff);

        // sortierte Liste mit Collections.sort
        LocalDateTime beforeCollection = LocalDateTime.now();
        Collections.sort(sortierteListe2);
        LocalDateTime afterCollection = LocalDateTime.now();

        long diff2 = ChronoUnit.NANOS.between(beforeCollection, afterCollection);

        System.out.printf("%-20s %15dns \n", "Collection Sort", diff2);

    }

    public static Auto createAuto() {

        String marke = marken[rand.nextInt((4 - 0) + 0) + 0];
        int baujahr = rand.nextInt(2022 - 1950 + 1) + 1950;
        int kmstand = rand.nextInt(300000 - 0 + 1) + 0;
        return new Auto(marke, baujahr, kmstand);
    }

    public static ArrayList<Auto> sortierteListe() {
        ArrayList<Auto> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 50; j++) {
                String marke = marken[i];
                int baujahr = 2022;
                int kmstand = 0;
                list.add(new Auto(marke, baujahr, kmstand));
            }
        }
        // printList(list);

        return list;
    }

    public static void printList(ArrayList<Auto> list) {
        System.out.printf("%-13s %-13s %s \n", "Marke", "Baujahr", "KMStand");

        for (Auto a : list) {
            System.out.println(a.toString());
        }
    }

    public static void bubblesort(ArrayList<Auto> list) {

        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size() - 1; i++) {

                Auto temp = list.get(i);
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }

            }
        }

    }
}