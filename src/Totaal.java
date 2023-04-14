import java.util.ArrayList;

class Totaal {
    protected KlantType klantType;
    protected double totaalprijs;

    protected ArrayList<Onderdelen> onderdelen;


    Totaal() {

    }

    public void setTotaalPrijs(ArrayList<Onderdelen> onderdelen) {
        int totaalprijs = 0;
        for (Onderdelen onderdeel : onderdelen) {
            totaalprijs += onderdeel.getPrijs();
        }
        int korting = klantType.getKorting();
        int kortingBedrag = (totaalprijs * korting) / 100;
        double eindprijs = totaalprijs - kortingBedrag;
        this.totaalprijs = eindprijs;
    }

    public void setOnderdelen(ArrayList<Onderdelen> onderdelen) {
        this.onderdelen = onderdelen;
    }


    public double getTotaalPrijs() {
        return totaalprijs;
    }

    public void setKlantType(KlantType klantType) {
        this.klantType = klantType;
    }
}
