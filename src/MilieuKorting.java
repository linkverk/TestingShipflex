import java.util.ArrayList;
import java.util.Scanner;

class MilieuKorting {
    double kortingen;
    String naam;

    ArrayList<MilieuKorting> milieuKortingen;

    MilieuKorting(String naam) {
        this.naam = naam;
    }

    public MilieuKorting() {

    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setKortingen(double kortingen) {
        this.kortingen = kortingen;
    }

    public double getKortingen() {
        return kortingen;
    }
}



