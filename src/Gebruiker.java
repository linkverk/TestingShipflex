
class Gebruiker {
    protected String gebruikernr;
    protected KlantType klanttype;
    protected Totaal totaal;

    protected String bootnaam;

    protected Offerte offerte;

    Gebruiker(String gebruikernr) {
        this.gebruikernr = gebruikernr;

    }


    Gebruiker(String gebruikernr, KlantType klanttype) {
        super();
        this.klanttype = klanttype;

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

    public void setGebruikernr() {
        this.gebruikernr = gebruikernr;
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
