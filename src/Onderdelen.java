import java.util.ArrayList;

class Onderdelen {
    protected String naam;
    protected double prijs;
    protected  MilieuKorting milieuKorting;
   protected ArrayList <SoortOnderdelen> onderdeelEigenSchappen;

    Onderdelen(String naam) {
        this.naam = naam;
    }
    Onderdelen(String naam, ArrayList<SoortOnderdelen> onderdeelEigenSchappen) {
        this.naam = naam;
        this.onderdeelEigenSchappen = onderdeelEigenSchappen;
    }

    Onderdelen(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }



    Onderdelen() {

    }
    public ArrayList<SoortOnderdelen> getOnderdeelEigenSchappen(){
        return onderdeelEigenSchappen;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public void setNaam() {
        this.naam = naam;
    }

    public double getPrijs() {
        if(milieuKorting != null){
            double onderdeelPrijsMilieu = (prijs * milieuKorting.getKortingen() / 100);
prijs = onderdeelPrijsMilieu;
        }

        return prijs;
    }

    public String getNaam() {
        return naam;
    }

    public void Onderdelen() {


    }
    public void setMilieuKorting(MilieuKorting milieuKorting){
        this.milieuKorting = milieuKorting;

    }
}

class Extras extends Onderdelen {

    Extras(String naam) {
        super(naam);
    }
}
