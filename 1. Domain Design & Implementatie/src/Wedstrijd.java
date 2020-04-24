public class Wedstrijd {
    private final String wedstrijd;
    private String datum;
    private String tijd;
    private int thuisgoals;
    private int uitgoals;

    public String toString() {
        return wedstrijd;
    }

    public Wedstrijd(String game) {
        wedstrijd = game;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getTijd() {
        return tijd;
    }

    public void setTijd(String tijd) {
        this.tijd = tijd;
    }

    public int getThuisgoals() {
        return thuisgoals;
    }

    public void setThuisgoals(int thuisgoals) {
        this.thuisgoals = thuisgoals;
    }

    public int getUitgoals() {
        return uitgoals;
    }

    public void setUitgoals(int uitgoals) {
        this.uitgoals = uitgoals;
    }
}
