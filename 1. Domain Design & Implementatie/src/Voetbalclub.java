public class Voetbalclub {
    public String naam;
    private String acroniem;
    private String locatie;
    private int opgericht;

    public Voetbalclub(String nm) {
        naam = nm;
    }

    public String getAcroniem() {
        return acroniem;
    }

    public void setAcroniem(String acroniem) {
        this.acroniem = acroniem;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getOpgericht() {
        return opgericht;
    }

    public void setOpgericht(int leeftijd) {
        opgericht = leeftijd;
    }

    public String toString() {
        return naam;
    }
}
