class KlantType {
    protected String naam;
    protected int korting;

    KlantType(String naam) {
        this.naam = naam;
    }

    KlantType() {
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setKorting(int korting) {
        this.korting = korting;
    }

    public String getNaam() {
        return naam;
    }

    public int getKorting() {
        return korting;
    }
}
