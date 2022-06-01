public class Auto implements Comparable<Auto> {

    int Baujahr;
    int KMStand;
    String Marke;

    Auto(String Marke, int Baujahr, int KMStand) {

        this.Marke = Marke;
        this.KMStand = KMStand;
        this.Baujahr = Baujahr;

    }

    @Override
    public String toString() {

        String format = String.format("%-13s %-13d %dkm", this.Marke, this.Baujahr, this.KMStand);
        return format;
    }

    // Baujahr > KMStand > Marke > Modell

    @Override
    public int compareTo(Auto o) {
        if (this.Baujahr > o.Baujahr) {
            return 1;
        }
        if (this.Baujahr < o.Baujahr) {
            return -1;
        } else {
            if (this.KMStand > o.KMStand) {
                return 1;
            }
            if (this.KMStand < o.KMStand) {
                return -1;
            } else {
                if (this.Marke.compareTo(o.Marke) > 0) {
                    return 1;
                }
                if (this.Marke.compareTo(o.Marke) < 0) {
                    return -1;
                } else {

                    return 0;
                }
            }
        }

    }

}
