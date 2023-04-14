import java.util.ArrayList;

class Boot {
    ArrayList<SoortOnderdelen> categorien;

    String naam;

    Boot(String naam, ArrayList<SoortOnderdelen> categorien) {
        this.naam = naam;
        this.categorien = categorien;

    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<SoortOnderdelen> getCategorien() {
        return categorien;
    }

}
