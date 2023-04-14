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






  public ArrayList<SoortOnderdelen> getCategorien(){
        return categorien;
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

