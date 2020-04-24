interface Selectie {
    boolean selectie(boolean selectie);
}

public class Lid implements Selectie{
    public String Naam;
    private int leeftijd;
    private int telefoonnummer;
    private String adres;
    private String e_mailadres;

    public Lid(String nm) {
        Naam = nm;
    }

    public String toString() {
        return Naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public int getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(int telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getE_mailadres() {
        return e_mailadres;
    }

    public void setE_mailadres(String e_mailadres) {
        this.e_mailadres = e_mailadres;
    }

    @Override
    public boolean selectie(boolean selectie) {

        return selectie;
    }
}
