

class MilieuKorting {
    double kortingen;
    String naam;

    String omschrijving;

    MilieuKorting(String naam) {
        this.naam = naam;
    }


    public void setOmschrijving(String omschrijving){
        this.omschrijving = omschrijving;
    }
    public String getOmschrijving(){
        return omschrijving;
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



