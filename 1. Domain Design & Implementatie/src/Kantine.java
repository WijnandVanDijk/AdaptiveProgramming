public class Kantine {
    private int tafels;
    private boolean bar;
    private int medewerkers;
    private boolean open;

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean getOpen() {
        return this.open;
    }

    public void setMedewerkers(int medewerkers) {
        this.medewerkers = medewerkers;
    }

    public int getMedewerkers() {
        return this.medewerkers;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }

    public boolean getBar() {
        return this.bar;
    }

    public void setTafels(int tafels) {
        this.tafels = tafels;
    }

    public int getTafels() {
        return this.tafels;
    }
}
