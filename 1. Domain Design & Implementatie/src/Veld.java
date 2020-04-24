public class Veld {
    private String naam;
    private boolean markeringen;
    private int dug_out;
    private int doel;

    public Veld(String veld) {
        naam = veld;
    }
    public boolean getMarkeringen() {
        return markeringen;
    }

    public void setMarkeringen(boolean markeringen) {
        this.markeringen = markeringen;
    }

    public int getDug_out() {
        return dug_out;
    }

    public void setDug_out(int dug_out) {
        this.dug_out = dug_out;
    }

    public int getDoel() {
        return doel;
    }

    public void setDoel(int doel) {
        this.doel = doel;
    }
    public String toString() {
        return naam;
    }
}
