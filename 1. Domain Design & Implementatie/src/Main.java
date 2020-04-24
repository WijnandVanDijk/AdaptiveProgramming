public class Main {

    public static void main(String[] args) {


        Voetbalclub C1 = new Voetbalclub("'Bussumse Football Club'");
        Voetbalclub C2 = new Voetbalclub("'Rooms Katholieke Voetbalvereniging Samenspel Doet Overwinnen'");
        C1.setAcroniem("BFC");
        C2.setAcroniem("SDO");
        C1.setLocatie("Bussum");
        C2.setLocatie("Bussum");
        C1.setOpgericht(1920);
        C2.setOpgericht(1917);


        Lid L1 = new Lid("Wijnand van Dijk");
        Lid L2 = new Lid("Bas Tak");
        L1.setLeeftijd(18);
        L2.setLeeftijd(17);
        L1.setTelefoonnummer(1718901);
        L2.setTelefoonnummer(14656);
        L1.setAdres("Zeggmemeent 18");
        L2.setAdres("Meentweg 83");
        L1.setE_mailadres("wijnand.s.van.dijk@gmail.com");
        L2.setAdres("Randomemail@adres");


        Wedstrijd G1 = new Wedstrijd("BFC JO12-5 vs SDO JO12-2");
        G1.setDatum("19-5-2020");
        G1.setThuisgoals(0);
        G1.setUitgoals(0);
        G1.setTijd("09:30");


        Veld V1 = new Veld("2e Veld");
        Veld V2 = new Veld("1e Veld");
        V1.setDoel(2);
        V2.setDoel(2);
        V1.setDug_out(2);
        V2.setDug_out(4);
        V1.setMarkeringen(true);
        V2.setMarkeringen(false);


        Kantine K = new Kantine();
        K.setBar(true);
        K.setMedewerkers(5);
        K.setOpen(false);
        K.setTafels(24);

        System.out.println("Op " + G1.getDatum() + " om " + G1.getTijd() + " Word de wedstrijd tussen de twee rivalen " + C1 +
                " en " + C2 + " beter bekend als " + C1.getAcroniem() + " en " + C2.getAcroniem() +
                " Gespeeld op een veld van " + C1.getAcroniem() + ".\nDit veld is het " + V1 + " van " + C1.getAcroniem() + " Met " +
                V1.getDug_out() + " dug out's." +  " Normalieter word er op het " + V2 +
                " gespeeld voor deze bijzondere wedstrijden maar het eerste veld" +
                " heeft momenteel geen markeringen op het gras.\nMarkeringen: " + V2.getMarkeringen() + "\nDoor de corona" +
                "maatregelen is de Kantine helaas gesloten.\nOpen = " + K.getOpen() +
                "\nEr worden dus geen biertjes getapt, we weten dat dat voor menig toeschouwer het hoogtepunt is van de dag maar het kan nu niet anders"
                + "\ndoor de KNVB wordt aangeraden om inplaats van 11 tegen 11, 1 tegen 1 te spelen." +
                "Daar houden wij ons natuurlijk aan, daardoor heeft elke club één iemand gestuurd om hen te vertegenwoordigen\n"
                + "De speler voor " + C1.getAcroniem() + " wordt " + L1 + " en " + L2 + " voor " + C2.getAcroniem() + ". \nDe wedstrijd code is: " + G1);

        System.out.println();
    }
}
