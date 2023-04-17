
class Onderdelen {
    protected String naam;
    protected double prijs;
    protected  MilieuKorting milieuKorting;


    Onderdelen(String naam) {
        this.naam = naam;
    }


    Onderdelen(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }






    public void setPrijs(double prijs) {
        if(milieuKorting != null){
            this.prijs = prijs - (prijs * (milieuKorting.getKortingen() / 100));}
        if(milieuKorting == null){
            this.prijs = prijs;}
        }



    public double getPrijs() {


        return prijs;
    }

    public String getNaam() {
        return naam;
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
