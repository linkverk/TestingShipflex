
class Gebruiker {
    protected String gebruikernr;
    protected KlantType klanttype;
    protected Totaal totaal;

    protected String bootnaam;


    Gebruiker(String gebruikernr) {
        this.gebruikernr = gebruikernr;

    }



    public void setBootNaam(Boot boot) {
        this.bootnaam = boot.getNaam();
    }

    public String getBootNaam() {
        return bootnaam;
    }

    public void setTotaal(Totaal totaal) {
        this.totaal = totaal;
    }

    public Totaal getTotaal() {
        return totaal;
    }



    public String getGebruikernaam() {
        return gebruikernr;
    }

    public void setKlanttype(KlantType klantType) {
        this.klanttype = klantType;
    }

    public KlantType getKlanttype() {
        return klanttype;
    }
}
