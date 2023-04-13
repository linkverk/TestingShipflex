import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class UnitTests {


    @Test

    public void checkBerekeningKlantKortingOpOfferte() {
        Gebruiker gebruiker = new Gebruiker("Steven");
        //Object Gebruiker word gebruikt om de informatie voor de offerte bij een gebruiker op te slaan
        //zodat de klant later de offerte zelf in het programma kan ophalen
        KlantType klantType = new KlantType();
        ArrayList<Onderdelen> onderdelen = new ArrayList<>();
        Onderdelen onderdeel = new Onderdelen("Walrus", 700);
        onderdelen.add(onderdeel);
        Totaal totaal = new Totaal();
        klantType.setNaam("TEST");
        klantType.setKorting(20);
        gebruiker.setKlanttype(klantType);
        totaal.setKlantType(gebruiker.getKlanttype());
        System.out.println(gebruiker.getKlanttype().getNaam());
        totaal.setTotaalPrijs(onderdelen);
        gebruiker.setTotaal(totaal);
        //hier wordt de informatie van de offerte bij de gebruiker "Steven" Opgeslagen

        System.out.print(totaal.getTotaalPrijs());
    }

    @Test
    public void checkToevoegenKlantType() {
        KlantType klantType = new KlantType();
        klantType.setNaam("NieuweKlant");
        Assertions.assertEquals("NieuweKlant", klantType.getNaam());
    }

    @Test
    public void checkToevoegenKlantKorting() {
        KlantType klantType = new KlantType();
        int nummer = 20;
        klantType.setKorting(nummer);
        Assertions.assertEquals(20, klantType.getKorting());
    }

    public void checkTotaalPrijs() {
    }

    @Test
    public void initialiseerOnderdelen() {

        SoortOnderdelen extra = new SoortOnderdelen("Extra");
        ArrayList<Onderdelen> lijstOnderdelen = new ArrayList<>();
        lijstOnderdelen.add(new Onderdelen("Romp"));
        lijstOnderdelen.add(new Onderdelen("Stuur"));
        lijstOnderdelen.add(new Onderdelen("Anker"));
        lijstOnderdelen.add(new Onderdelen("Zeil"));
        extra.setOnderdelen(lijstOnderdelen);
        for (Onderdelen onderdeel : extra.getOnderdelen()) {
            int i = 0;
            System.out.println(onderdeel.getNaam());
        }

        Assertions.assertEquals("Romp", lijstOnderdelen.get(0).naam);
        Assertions.assertEquals("Stuur", lijstOnderdelen.get(1).naam);
        Assertions.assertEquals("Anker", lijstOnderdelen.get(2).naam);
        Assertions.assertEquals("Zeil", lijstOnderdelen.get(3).naam);


    }
}