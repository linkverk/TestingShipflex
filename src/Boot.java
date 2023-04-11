import java.util.ArrayList;

abstract class Boot {
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

class Jacht extends Boot {

    Jacht(String naam, ArrayList<SoortOnderdelen> categorien) {
        super(naam, categorien);
    }
}


class SpeedBoot extends Boot {

    SpeedBoot(String naam, ArrayList<SoortOnderdelen> categorien) {
        super(naam, categorien);
    }
}

class Ferry extends Boot {

    Ferry(String naam, ArrayList<SoortOnderdelen> categorien) {
        super(naam, categorien);
    }
}

class WoonBoot extends Boot {

    WoonBoot(String naam, ArrayList<SoortOnderdelen> categorien) {
        super(naam, categorien);
    }
}

class ContainerSchip extends Boot {

    ContainerSchip(String naam, ArrayList<SoortOnderdelen> categorien) {
        super(naam, categorien);
    }
}