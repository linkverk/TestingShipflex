import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class UnitTests {


    @Test
    //test of de milieukortingen correct bij de prijzen van onderdelen word toegevoegd
    public void checkBerekeningMilieuKorting(){
   MilieuKorting milieuKorting =new MilieuKorting("Duurzaam");
    Onderdelen jacuzzi = new Onderdelen("Jacuzzi");
        milieuKorting.setKortingen(10);
        jacuzzi.setMilieuKorting(milieuKorting);
        jacuzzi.setPrijs(100);


        Assertions.assertEquals(90, jacuzzi.getPrijs() );

    }


    @Test
    //test of de klantkorting correct op de offerte word berekent
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
    //test of nieuwe klanttypen correct in het systeem worden toegevoegd
    public void checkToevoegenKlantType() {
        KlantType klantType = new KlantType();
        klantType.setNaam("NieuweKlant");
        Assertions.assertEquals("NieuweKlant", klantType.getNaam());
    }

    @Test
    //test of klant kortingen in het systeem worden toegevoegd
    public void checkToevoegenKlantKorting() {
        KlantType klantType = new KlantType();
        int nummer = 20;
        klantType.setKorting(nummer);
        Assertions.assertEquals(20, klantType.getKorting());
    }
    @Test
    //test of onderdelen correct worden toegevoegd
    public void testOfOnderdeelToegevoegdWord() {
        SoortOnderdelen soortOnderdelen = new SoortOnderdelen("Zeil");
        ArrayList<Onderdelen> lijstOnderdelen = new ArrayList<>();
        Onderdelen onderdelen = new Onderdelen("Grootte zeil");
        lijstOnderdelen.add(onderdelen);
        soortOnderdelen.setOnderdelen(lijstOnderdelen);
        Assertions.assertEquals("Grootte zeil", soortOnderdelen.getOnderdelen().get(0).getNaam());

    }
        @Test
    //test of onderdelen correct worden uitgeprint
        //test of onderdelen correct worden geselecteerd
    public void testOfOnderdelenWordenUitGeprint() {

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
         int keuze = 1 - 1;
        //- 1 omdat keuze word gebruikt om een object te halen uit een arrayList
        Onderdelen gekozenOnderdeel = extra.getOnderdelen().get(keuze);
        Assertions.assertEquals("Romp", gekozenOnderdeel.getNaam());

        Assertions.assertEquals("Romp", lijstOnderdelen.get(0).getNaam());
        Assertions.assertEquals("Stuur", lijstOnderdelen.get(1).getNaam());
        Assertions.assertEquals("Anker", lijstOnderdelen.get(2).getNaam());
        Assertions.assertEquals("Zeil", lijstOnderdelen.get(3).getNaam());


    }
}
