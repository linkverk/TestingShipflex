import java.util.ArrayList;

class SoortOnderdelen {
    protected String naam;
  protected SoortOnderdelen soortOnderdeel;
    protected ArrayList<Onderdelen> onderdelen;
    protected ArrayList<Extras> extras;

    protected ArrayList<SoortOnderdelen> categorien;

    SoortOnderdelen(String soortOnderdeel) {
        this.naam = soortOnderdeel;
    }

    SoortOnderdelen(String soortOnderdeel, ArrayList<Onderdelen> onderdelen) {
        this.naam = soortOnderdeel;
        this.onderdelen = onderdelen ;

    }

    public SoortOnderdelen() {

    }



  public ArrayList<SoortOnderdelen> getCategorien(){
        return categorien;
  }
  public void setSoortOnderdelen(ArrayList<SoortOnderdelen> categorien){
        this.categorien = categorien;
    }

    public void setOnderdelen(ArrayList<Onderdelen> onderdelen) {
        this.onderdelen = onderdelen;
    }

    public void setExtras(ArrayList<Extras> extras) {
        this.extras = extras;
    }

    public ArrayList<Onderdelen> getOnderdelen() {
        return onderdelen;
    }

    public ArrayList<Extras> getExtras() {
        return extras;
    }
}

class JachtOnderdelen extends SoortOnderdelen {


    JachtOnderdelen (String naam){

    }



}

class SpeedBootOnderdelen extends SoortOnderdelen {


    SpeedBootOnderdelen(String soortOnderdeel) {
        super(soortOnderdeel);
    }


    public SpeedBootOnderdelen() {

    }

}

class FerryOnderdelen extends SoortOnderdelen {


    FerryOnderdelen(String soortOnderdeel) {
        super(soortOnderdeel);
    }


    public FerryOnderdelen() {

    }

}

class ContainerSchipOnderdelen extends SoortOnderdelen {

    ContainerSchipOnderdelen(String soortOnderdeel) {
        super(soortOnderdeel);
    }

    public ContainerSchipOnderdelen() {

    }

}


class WoonBootOnderdelen extends SoortOnderdelen {

    WoonBootOnderdelen(String soortOnderdeel) {
        super(soortOnderdeel);
    }

    public WoonBootOnderdelen() {

    }

}
