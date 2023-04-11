
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


//what to do?
//meerdere soorten boten? elk boot andere opties? class boot?
//zorg ervoor dat je alleen van extras meerder opties kan kiezen?
//in scheepsbouwer menu de optie zetten om prijzen voor onderdelen toe te voegen
//in offerte maker coderen dat als er geen prijs voor een onderdeel is je gelijk daar er één kan toevoegen
//netjes offerte uitprinten

public class Main {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MilieuKorting> milieuKortingen = new ArrayList<>();
        milieuKortingen.add(new MilieuKorting("1"));
        milieuKortingen.add(new MilieuKorting("2"));
        milieuKortingen.add(new MilieuKorting("3"));
        milieuKortingen.add(new MilieuKorting("4"));

        ArrayList<SoortOnderdelen> jachtOnderdelen = new ArrayList<>();
         SoortOnderdelen jacht1 = new JachtOnderdelen("Romp");
        initialiseerJachtOnderdelenRomp(jacht1);
        SoortOnderdelen jacht2 = new SoortOnderdelen();
        ArrayList<Onderdelen> houten = new ArrayList<>();
        initialiseerHout(houten);
        //initialiseerJachtOnderdelenInterieur(jacht2.getCategorien(), houten);
        SoortOnderdelen jacht3 = new SoortOnderdelen("Dek");
        initialiseerJachtOnderdelenDek(jacht3) ;
        SoortOnderdelen jacht4 = new SoortOnderdelen("Stuur Systeem");
       initialiseerJachtOnderdelenStuurSysteem(jacht4);
        SoortOnderdelen jacht5 = new SoortOnderdelen("Motor");
        initialiseerJachtOnderdelenMotor(jacht5);
        initialiseerCategorienJachtOnderdelen(jachtOnderdelen, jacht1, jacht2, jacht3,  jacht4,  jacht5);
        Boot jacht = new Jacht("Jacht",jachtOnderdelen );

        ArrayList<SoortOnderdelen> ferryOnderdelen = new ArrayList<>();
       SoortOnderdelen ferry1 = new SoortOnderdelen("Laternaam");
        initialiseerFerryOnderdelenRomp(ferry1);
        SoortOnderdelen ferry2 = new SoortOnderdelen("Laternaam2");
      initialiseerFerryOnderdelen2(ferry2);
        SoortOnderdelen ferry3 = new SoortOnderdelen("Laternaam3");
        initialiseerFerryOnderdelen3(ferry3);
        SoortOnderdelen ferry4 = new SoortOnderdelen("Laternaam4");

         initialiseerFerryOnderdelen4(ferry4);
        SoortOnderdelen ferry5 = new SoortOnderdelen("Laternaam5");
         initialiseerFerryOnderdelen5(ferry5);
        initialiseerCategorienFerryOnderdelen( ferryOnderdelen, ferry1, ferry2, ferry3, ferry4, ferry5);
        Boot ferry = new Ferry("Ferry",ferryOnderdelen );

        ArrayList<SoortOnderdelen> woonBootOnderdelen = new ArrayList<>();
        SoortOnderdelen woonBoot1 = new SoortOnderdelen("later1");
         initialiseerWoonBootOnderdelen1(woonBoot1);
        SoortOnderdelen woonBoot2 = new SoortOnderdelen("later2");
        initialiseerWoonBootOnderdelen2(woonBoot2);
        SoortOnderdelen woonBoot3 = new SoortOnderdelen("later33");
        initialiseerWoonBootOnderdelen3(woonBoot3);
        SoortOnderdelen woonBoot4 = new SoortOnderdelen("ik");
        initialiseerWoonBootOnderdelen4(woonBoot4);
        SoortOnderdelen woonBoot5 = new SoortOnderdelen("nee");
       initialiseerWoonBootOnderdelen5(woonBoot5);
        initialiseerCategorienWoonBootOnderdelen( woonBootOnderdelen, woonBoot1, woonBoot2, woonBoot3, woonBoot4, woonBoot5);
        Boot woonBoot = new WoonBoot("WoonBoot",woonBootOnderdelen );
        ArrayList<SoortOnderdelen> speedBootOnderdelen = new ArrayList<>();
        SoortOnderdelen speedBoot1 = new SoortOnderdelen("speed");
        initialiseerSpeedBootOnderdelen1(speedBoot1);
        SoortOnderdelen speedBoot2 = new SoortOnderdelen("2");
     initialiseerSpeedBootOnderdelen2(speedBoot2);
        SoortOnderdelen speedBoot3 = new SoortOnderdelen("3");
       initialiseerSpeedBootOnderdelen3(speedBoot3);
        SoortOnderdelen speedBoot4 = new SoortOnderdelen("4");
        initialiseerSpeedBootOnderdelen4(speedBoot4);
        SoortOnderdelen speedBoot5 = new SoortOnderdelen(" 5" );
        initialiseerSpeedBootOnderdelen5(speedBoot5);
        initialiseerCategorienSpeedBootOnderdelen(speedBootOnderdelen, speedBoot1, speedBoot2,  speedBoot3, speedBoot4, speedBoot5);
        Boot speedBoot = new SpeedBoot ("Speedboot",speedBootOnderdelen );

        ArrayList<SoortOnderdelen> containerOnderdelen = new ArrayList<>();
        SoortOnderdelen container1 = new SoortOnderdelen("container");
         initialiseerContainerOnderdelen1(container1);
        SoortOnderdelen container2 = new SoortOnderdelen("containers");
         initialiseerContainerOnderdelen2(container2);
        SoortOnderdelen container3 = new SoortOnderdelen("containeren?");
        initialiseerContainerOnderdelen3(container3);
        SoortOnderdelen container4 = new SoortOnderdelen("uhm");
        initialiseerContainerOnderdelen4(container4);
        SoortOnderdelen container5 = new SoortOnderdelen("eh");
        initialiseerContainerOnderdelen5(container5);
        initialiseerCategorienContainerOnderdelen(containerOnderdelen, container1, container2, container3, container4, container5);
        Boot container = new ContainerSchip("Containerschip",containerOnderdelen );



        ArrayList<Boot> boten = new ArrayList<>();
        boten.add(jacht);
        boten.add(speedBoot);
        boten.add(ferry);
        boten.add(container);
        boten.add(woonBoot);


        //al deze code zet de boten en de onderdelen die daarbij horen in systeem


        Totaal totaal = new Totaal();
        ArrayList<Gebruiker> gebruikers = new ArrayList<>();
        initialiseerGebruikers(gebruikers);
        ArrayList<KlantType> klantTypes = new ArrayList<>();
        initialiseerKlanttype(klantTypes);
        //Zet Klanttypes particulieren, bedrijven en overheden in het systeem

        SoortOnderdelen navigatieSysteem = new SoortOnderdelen("Navigatiesysteem");
        //maakt categorie Navigatiesysteem
        ArrayList<Onderdelen> navigatieSystemen = new ArrayList<>();
        initialiseerNavigatieSysteem(navigatieSystemen);
        //initialiseerd navigatiesystemen in onderdelen
        navigatieSysteem.setOnderdelen(navigatieSystemen);
        //zet alle navigatiesystemen in categorie navigatiesysteem


        //SoortOnderdelen hout = new SoortOnderdelen("Hout");
        //ArrayList<OnderdeelEigenSchappen> houten = new ArrayList<>();
        //initialiseerHout(houten);
        //hout.setOnderdelen(houten);

        SoortOnderdelen motor = new SoortOnderdelen("Motor");
        //maakt categorie Motor
        ArrayList<Onderdelen> motors = new ArrayList<>();
        initialiseerMotor(motors);
        //initialiseerd motors in onderdelen
        motor.setOnderdelen(motors);
        //zet alle motors in categorie motor


        SoortOnderdelen brandStofTank = new SoortOnderdelen("Brandstoftank");
        //maakt categorie Brandstoftank
        ArrayList<Onderdelen> brandstofTanken = new ArrayList<>();
        initialiseerBrandstofTank(brandstofTanken);
        //initialiseerd brandstoftanken in onderdelen
        brandStofTank.setOnderdelen(brandstofTanken);
        //zet alle brandstofTanks in categorie brandstoftank

        SoortOnderdelen extra = new SoortOnderdelen("Extras");
        ArrayList<Extras> extras = new ArrayList<>();
        initialiseerExtra(extras);
        extra.setExtras(extras);

        ArrayList<SoortOnderdelen> categorien = new ArrayList<>();
        initialiseerCategorien(categorien, navigatieSysteem, motor, brandStofTank,  extra);
        ArrayList<Onderdelen> selectedOnderdelen = new ArrayList<>();
        //zet categorien die hierboven geinitialiseerd zijn in een arraylist.
        KlantType klant = new KlantType();
        login(milieuKortingen, boten, gebruikers, klant, klantTypes, totaal, selectedOnderdelen, categorien);


    }
    public static void initialiseerCategorienJachtOnderdelen(ArrayList<SoortOnderdelen> jacht, SoortOnderdelen jacht1, SoortOnderdelen jacht2, SoortOnderdelen jacht3, SoortOnderdelen jacht4, SoortOnderdelen jacht5) {
        jacht.add(jacht1);
        jacht.add(jacht2);
        jacht.add(jacht3);
        jacht.add(jacht4);
        jacht.add(jacht5);
    }

    public static void initialiseerJachtOnderdelenRomp(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("Waterverplaatsende romp"));
        onderdelens.add(new Onderdelen("Halfgeleider romp"));
        onderdelens.add(new Onderdelen("Planerende romp"));
     jachtOnderdelen.setOnderdelen(onderdelens);

    }



    public static void initialiseerJachtOnderdelenDek(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("Teakhout"));
        onderdelens.add(new Onderdelen("Polyester"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }
  //  public static void initialiseerJachtOnderdelenInterieur(ArrayList<SoortOnderdelen> jachtOnderdelen, ArrayList<Onderdelen> houten) {
    //    ArrayList<Onderdelen> onderdelens = new ArrayList<>();
      //  onderdelens.add(new Onderdelen("Houtwerk"));
        //jachtOnderdelen.add(new SoortOnderdelen("Vloer", houten));
        //onderdelens.add(new Onderdelen("Bekleding"));
        //jachtOnder

    //}

    public static void initialiseerJachtOnderdelenStuurSysteem(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
       jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerJachtOnderdelenMotor(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("Elektrische binnenboord motor"));
        onderdelens.add(new Onderdelen("Elektrische buitenboord motor"));
        onderdelens.add(new Onderdelen("Diesel binnenboord motor"));
        onderdelens.add(new Onderdelen("Diesel buitenboord motor"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }


    public static void initialiseerCategorienFerryOnderdelen(ArrayList<SoortOnderdelen> jacht, SoortOnderdelen jacht1, SoortOnderdelen jacht2, SoortOnderdelen jacht3, SoortOnderdelen jacht4, SoortOnderdelen jacht5) {
        jacht.add(jacht1);
        jacht.add(jacht2);
        jacht.add(jacht3);
        jacht.add(jacht4);
        jacht.add(jacht5);
    }

    public static void initialiseerFerryOnderdelenRomp(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("Waterverplaatsende romp"));
        onderdelens.add(new Onderdelen("Halfgeleider romp"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerFerryOnderdelen2(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerFerryOnderdelen3(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerFerryOnderdelen4(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerFerryOnderdelen5(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerCategorienWoonBootOnderdelen(ArrayList<SoortOnderdelen> jacht, SoortOnderdelen jacht1, SoortOnderdelen jacht2, SoortOnderdelen jacht3, SoortOnderdelen jacht4, SoortOnderdelen jacht5) {
        jacht.add(jacht1);
        jacht.add(jacht2);
        jacht.add(jacht3);
        jacht.add(jacht4);
        jacht.add(jacht5);
    }

    public static void initialiseerWoonBootOnderdelen1(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("Waterverplaatsende romp"));
        onderdelens.add(new Onderdelen("Halfgeleider romp"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);

    }

    public static void initialiseerWoonBootOnderdelen2(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerWoonBootOnderdelen3(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerWoonBootOnderdelen4(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerWoonBootOnderdelen5(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerCategorienSpeedBootOnderdelen(ArrayList<SoortOnderdelen> jacht, SoortOnderdelen jacht1, SoortOnderdelen jacht2, SoortOnderdelen jacht3, SoortOnderdelen jacht4, SoortOnderdelen jacht5) {
        jacht.add(jacht1);
        jacht.add(jacht2);
        jacht.add(jacht3);
        jacht.add(jacht4);
        jacht.add(jacht5);
    }

    public static void initialiseerSpeedBootOnderdelen1(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("Planerende romp"));
        onderdelens.add(new Onderdelen("Halfgeleider romp"));
        onderdelens.add(new Onderdelen("Waterverplaatsende romp"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerSpeedBootOnderdelen2(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerSpeedBootOnderdelen3(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerSpeedBootOnderdelen4(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerSpeedBootOnderdelen5(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerCategorienContainerOnderdelen(ArrayList<SoortOnderdelen> jacht, SoortOnderdelen jacht1, SoortOnderdelen jacht2, SoortOnderdelen jacht3, SoortOnderdelen jacht4, SoortOnderdelen jacht5) {
        jacht.add(jacht1);
        jacht.add(jacht2);
        jacht.add(jacht3);
        jacht.add(jacht4);
        jacht.add(jacht5);
    }

    public static void initialiseerContainerOnderdelen1(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerContainerOnderdelen2(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerContainerOnderdelen3(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerContainerOnderdelen4(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }

    public static void initialiseerContainerOnderdelen5(SoortOnderdelen jachtOnderdelen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("1"));
        onderdelens.add(new Onderdelen("2"));
        onderdelens.add(new Onderdelen("3"));
        onderdelens.add(new Onderdelen("4"));
        onderdelens.add(new Onderdelen("5"));
        jachtOnderdelen.setOnderdelen(onderdelens);
    }




    public static void login(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij ShipFlex");
        System.out.println("Voer uw inlogcode in:");
        String loginGebruiker = scanner.nextLine();
        boolean isValidGebruiker = false;


        Gebruiker jouGebruiker = null;
        for (Gebruiker gebruiker : gebruikers) {
            if (loginGebruiker.equals(gebruiker.getGebruikernaam())) {
                isValidGebruiker = true;
                jouGebruiker = gebruiker;
            }
        }

        if (!isValidGebruiker) {
            System.out.println("Ongeldige gebruikersnr");
            login(milieuKortingen, boten, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);
        }
        if (loginGebruiker.equals("Qwerty123")) {

            scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klantTypes, onderdelen, soortOnderdelens, gebruikers);
        } else {
            klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);
        }
    }

    public static void klantMenu(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Zie offerte");
        System.out.println("2. Zie lijst met opties");
        System.out.println("3. Log uit");
        int keuze = scanner.nextInt();
        if (keuze == 1) {
            zieOfferte(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);
        }
        if (keuze == 2) {
            zieLijstopties(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);

        }
        if (keuze == 3) {
            login(milieuKortingen, boten, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);
        }
    }

    public static void zieOfferte(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens) {

        System.out.println(jouGebruiker.getBootNaam());
        System.out.println();
        for (Onderdelen onderdeel : jouGebruiker.getTotaal().onderdelen) {
            System.out.println(onderdeel.getNaam() + "prijs: " + onderdeel.getPrijs());
        }
        System.out.println("Totaalprijs:" + jouGebruiker.getTotaal().getTotaalPrijs());

    }

    public static void zieLijstopties(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens) {
        lijstOpties(boten, jouGebruiker, totaal, klant, klantTypes, onderdelen, soortOnderdelens, gebruikers);
        klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);
    }


   public static void scheepsBouwerMenu(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kies voor 1 van de opties:");
        System.out.println("1. Maak een offerte");
        System.out.println("2. Zie lijst met opties");
        System.out.println("3. Voeg klant kortingen toe");
        System.out.println("4. Voeg milieukortingen toe");
        System.out.println("5. Voeg nieuwe klant types toe");
        System.out.println("6. Voeg prijzen voor onderdelen toe");
        System.out.println("7. Voeg nieuwe onderdelen toe");
        System.out.println("8. Voeg milieukortingen bij onderdelen toe");
        System.out.println("9. Log uit");

        int keuze = scanner.nextInt();
        switch (keuze){

            case 1:

            offerteMaker(milieuKortingen, boten, jouGebruiker, totaal, klant, onderdelen, soortOnderdelens, klanten, gebruikers);
            break;

            case 2:

            lijstOptiesScheepsBouwer(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
            break;
            case 3:

            kiesKlantkorting(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
            break;

            case 4:

            voegMilieukorting(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
            break;
            case 5:

            maakNieuweKlantType(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
            break;

            case 6:

            voegPrijzenOnderdelen(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
            break;
            case 7:

            voegNieuweOnderdelen(milieuKortingen, onderdelen, soortOnderdelens);
            break;
            case 8:

            onderdelenVoegMilieukortingToe(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
            break;

            case 9:

            login(milieuKortingen, boten, gebruikers, klant, klanten, totaal, onderdelen, soortOnderdelens);
            break;

            default:
                System.out.println("Ongeldige keuze, probeer nog een keer.");
                break;
        }
    }
        }
    }
    public static void offerteMaker(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<Onderdelen> selectedOnderdelen, ArrayList<SoortOnderdelen> categorien, ArrayList<KlantType> klantTypes, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);
        Onderdelen selectedOnderdeel = null;
        System.out.println("Voer de klantCode in voor wie deze offerte is:");
        String gebruikersNaam = scanner.nextLine();
        boolean isValidGebruiker = false;
        for (Gebruiker gebruiker : gebruikers) {
            if (gebruikersNaam.equals(gebruiker.getGebruikernaam())) {
                isValidGebruiker = true;
                break;
            }
        }

        if (!isValidGebruiker) {
            System.out.println("Ongeldige gebruikersnr");
            offerteMaker(milieuKortingen, boten, jouGebruiker, totaal, klant, selectedOnderdelen, categorien, klantTypes, gebruikers);
        }
        for (Gebruiker gebruiker : gebruikers) {
            if (gebruikersNaam.equals(gebruiker.getGebruikernaam()) && gebruiker.getKlanttype() == null) {
                System.out.println("Wat voor klant is " + gebruiker.getGebruikernaam() + "?");
                for (KlantType klanten : klantTypes) {
                    int i = 1;
                    System.out.println(i + ". " + klanten.getNaam());

                }
                int kiesKlantType = scanner.nextInt();
                gebruiker.setKlanttype(klantTypes.get(kiesKlantType - 1));
                System.out.print(gebruiker.getKlanttype().getKorting());

            }
        }
        System.out.println("Wat voor boot wilt u maken?");
        for (Boot boot : boten) {
            int i = 1;
            System.out.println(i + " " + boot.getNaam());
            i++;
        }
        int kiesBoot = scanner.nextInt();
        Boot gekozenBoot = boten.get(kiesBoot - 1);

        int input = 1;
        ArrayList<SoortOnderdelen> checkOfCategorieLeegis = new ArrayList<>();
        while (input != 3) {
            System.out.println("Voor welke soort onderdelen wilt u kiezen?:");
            for (int i = 0; i < gekozenBoot.getCategorien().size(); i++) {
                //print catogorien
                System.out.println((i + 1) + ". " + gekozenBoot.getCategorien().get(i).soortOnderdeel);
            }

            int selectedCategoryIndex = scanner.nextInt() - 1;
            SoortOnderdelen selectedCategory = gekozenBoot.getCategorien().get(selectedCategoryIndex);

            for (SoortOnderdelen soort : checkOfCategorieLeegis) {
                if (selectedCategory == soort) {
                    System.out.println("U heeft al een keer gekozen voor dit soort onderdeel.");
                    System.out.println("Wilt u dit onderdeel vervangen met een ander?. J/N");
                    scanner.nextLine();
                    String choose = scanner.nextLine();
                    if (choose.equals("N")) {
                        System.out.println("Voor welke soort onderdelen wilt u kiezen?:");
                        for (int i = 0; i < gekozenBoot.getCategorien().size(); i++) {
                            //print catogorien
                            System.out.println((i + 1) + ". " + gekozenBoot.getCategorien().get(i).soortOnderdeel);
                        }

                        selectedCategoryIndex = scanner.nextInt() - 1;
                        selectedCategory = gekozenBoot.getCategorien().get(selectedCategoryIndex);
                        checkOfCategorieLeegis.add(gekozenBoot.getCategorien().get(selectedCategoryIndex));
                    }
                    if (choose.equals("J")) {
                        System.out.println("U heeft gekozen voor " + selectedCategory.soortOnderdeel);
                    } else {
                    }
                }
            }
            if (selectedCategory.getCategorien() != null ){
                for(SoortOnderdelen soort: selectedCategory.getCategorien()){
                    int i = 0;
                    System.out.println(i + 1 + " " + soort.soortOnderdeel);

                }
                System.out.println("Kies een soort onderdeel");
                int keuze = scanner.nextInt();
                SoortOnderdelen onderdeel = selectedCategory.getCategorien().get(keuze - 1);
                
                for (Onderdelen onderdelen: onderdeel.getOnderdelen()){
                    System.out.println(onderdelen.getNaam());
                }
                System.out.println("Kies een onderdeel");
                int keuze2 = scanner.nextInt() - 1;
                selectedOnderdeel = onderdeel.getOnderdelen().get(keuze2);
            }

           
            checkOfCategorieLeegis.add(gekozenBoot.getCategorien().get(selectedCategoryIndex));

            if (selectedCategory.getCategorien() == null ){  System.out.println("Welke onderdelen wilt u toevoegen? (kies 0 om te stoppen)");


            for (int i = 0; i < selectedCategory.onderdelen.size(); i++) {
                //print specifieke onderdelen
                System.out.println((i + 1) + ". " + selectedCategory.onderdelen.get(i).getNaam());
            }
            int selectedOnderdeelIndex = scanner.nextInt() - 1;
             selectedOnderdeel = selectedCategory.onderdelen.get(selectedOnderdeelIndex);
            if (selectedOnderdeel.getPrijs() == 0) {
                System.out.println("Dit onderdeel heeft nog geen prijs.");
                System.out.println();
                System.out.println("Kies de prijs voor dit onderdeel");
                int prijs = scanner.nextInt();
                selectedOnderdeel.setPrijs(prijs);
            }
            for (SoortOnderdelen soort : checkOfCategorieLeegis) {
                if (soort == selectedCategory) {
                    for (Onderdelen onderdeel : soort.getOnderdelen()) {
                        selectedOnderdelen.remove(onderdeel);

                    }
                }


            }
            selectedOnderdelen.add(selectedOnderdeel); }
            System.out.println(selectedOnderdeel.getNaam() + " is toegevoegd aan de offerte");
            System.out.println("Wilt u nog meer onderdelen toevoegen?");
            System.out.println("Type 1 om door te gaan");
            System.out.println("type 2 om extra opties toe tevoegen");
            System.out.println("type 3 om te stoppen");
            input = scanner.nextInt();
            if (input == 2) {


                String antwoord = "ja";

                while (antwoord.equals("ja")) {
                    System.out.println("Kies een extra optie:");
                    System.out.println("1. Airconditioning");
                    System.out.println("2. koelkast");
                    System.out.println("3. Binnenstoelen");
                    System.out.println("4. Lifevest");
                    System.out.print("Voer het nummer van de gewenste optie in: ");
                    int keuze = scanner.nextInt();

                    if (keuze == 1) {
                        categorien.get(4).getExtras().get(0).setPrijs(250);
                        selectedOnderdelen.add(categorien.get(4).getExtras().get(0));
                    } else if (keuze == 2) {
                        categorien.get(4).getExtras().get(1).setPrijs(500);
                        selectedOnderdelen.add(categorien.get(4).getExtras().get(1));
                    } else if (keuze == 3) {
                        categorien.get(4).getExtras().get(2).setPrijs(1000);
                        selectedOnderdelen.add(categorien.get(4).getExtras().get(2));
                    } else if (keuze == 4) {
                        categorien.get(4).getExtras().get(3).setPrijs(2000);
                        selectedOnderdelen.add(categorien.get(4).getExtras().get(3));
                    }

                    System.out.println("Wilt u nog meer extra opties toevoegen? (ja/nee): ");
                    scanner.nextLine();
                    antwoord = scanner.nextLine();
                    System.out.println("Wilt u nog meer essentiële opties toevoegen?:");
                    System.out.println("Type 1 om door te gaan");
                    System.out.println("type 2 om extra opties toe tevoegen");
                    System.out.println("type 3 om te stoppen");
                    input = scanner.nextInt();

                }
            }

        }

        System.out.println("Uw offerte bestaat uit:");

        for (Onderdelen onderdeel : selectedOnderdelen) {
            System.out.println("- " + onderdeel.getNaam());
        }
        totaal.setOnderdelen(selectedOnderdelen);

        for (Gebruiker gebruiker : gebruikers) {
            if (gebruiker.getGebruikernaam().equals(gebruikersNaam)) {
                totaal.setKlantType(gebruiker.getKlanttype());
                gebruiker.setTotaal(totaal);
                gebruiker.setBootNaam(gekozenBoot);


            }
        }
        totaal.setTotaalPrijs(selectedOnderdelen);

        System.out.println("Totaalprijs: " + totaal.getTotaalPrijs());
        //ERROR!!
        //god
        //help
        //me please

        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klantTypes, selectedOnderdelen, categorien, gebruikers);

    }

    public static void voegPrijzenOnderdelen(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);
        for (SoortOnderdelen soort : soortOnderdelens) {
            int i = 1;
            System.out.println(i + ". " + soort.soortOnderdeel);
            i++;
        }
        System.out.print("Voor welk soort onderdeel wilt u een prijs toevoegen?");
        int keuze = scanner.nextInt() - 1;
        for (Onderdelen onderdeel : soortOnderdelens.get(keuze).getOnderdelen()) {
            int i = 1;
            if (onderdeel.getPrijs() == 0) {
                System.out.println(i + ". " + onderdeel.getNaam());
            }
            if (onderdeel.getPrijs() != 0) {
                System.out.println(i + ". " + onderdeel.getNaam() + " -       prijs: " + onderdeel.getPrijs());
            }
            i++;
        }
        int keuze2 = scanner.nextInt() - 1;
        System.out.println("Kies een onderdeel");
        System.out.println("U heeft gekozen voor " + soortOnderdelens.get(keuze).getOnderdelen().get(keuze2).getNaam());
        System.out.println("Huidige prijs: " + soortOnderdelens.get(keuze).getOnderdelen().get(keuze2).getPrijs());
        System.out.print("Kies een nieuwe prijs:");
        double nieuwePrijs = scanner.nextInt();

        soortOnderdelens.get(keuze).getOnderdelen().get(keuze2).setPrijs(nieuwePrijs);
        System.out.println("Wilt u nog andere prijzen toevoegen?");
        System.out.println("Type 1 om door te gaan");
        System.out.println("Type 2 om terug naar het menu te gaan");
        int keuze3 = scanner.nextInt();
        while (true) {


            if (keuze3 == 1) {
                voegPrijzenOnderdelen(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
            }
            if (keuze3 == 2) {
                scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
            } else {
                System.out.println("Ongeldige keuze. Probeer het nog eens");
                System.out.println("Type 1 om door te gaan");
                System.out.println("Type 2 om terug naar het menu te gaan");
                keuze3 = scanner.nextInt();
            }
        }


    }

    public static void lijstOptiesScheepsBouwer(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
        lijstOpties(boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
    }

   public static void lijstOpties(ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {

        Main optieLijst = new Main();

        ArrayList<Onderdelen> navigatieSystemen = new ArrayList<Onderdelen>();
        optieLijst.initialiseerNavigatieSysteem(navigatieSystemen);

        ArrayList<Onderdelen> hout = new ArrayList<Onderdelen>();
        optieLijst.initialiseerHout(hout);

        ArrayList<Onderdelen> motors = new ArrayList<Onderdelen>();
        optieLijst.initialiseerMotor(motors);

        ArrayList<Onderdelen> brandstofTanken = new ArrayList<Onderdelen>();
        optieLijst.initialiseerBrandstofTank(brandstofTanken);

        System.out.println("Navigatie Systemen:");
        for (Onderdelen onderdeel : navigatieSystemen) {
            System.out.println("- " + onderdeel.getNaam());
        }

        System.out.println("Hout:");
        for (Onderdelen onderdeel : hout) {
            System.out.println("- " + onderdeel.getNaam());
        }

        System.out.println("Motors:");
        for (Onderdelen onderdeel : motors) {
            System.out.println("- " + onderdeel.getNaam());
        }

        System.out.println("Brandstof Tanken:");
        for (Onderdelen onderdeel : brandstofTanken) {
            System.out.println("- " + onderdeel.getNaam());
        }
    }

    public static void voegMilieukorting(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> categorien, ArrayList<Gebruiker> gebruikers) {
       Scanner scanner = new Scanner(System.in);
       for(MilieuKorting milieuKorting: milieuKortingen){
           System.out.println(milieuKorting.getNaam());
       }
       System.out.print("Kies een milieu korting: ");
       int keuze = scanner.nextInt();
       System.out.print("Voeg korting toe: ");
       int korting = scanner.nextInt();
       milieuKortingen.get(keuze - 1).setKortingen(korting);


        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, categorien, gebruikers);
    }
    public static void onderdelenVoegMilieukortingToe(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> categorien, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voor welk soort boot onderdelen?");
        for(Boot boot:boten){
            System.out.println(boot.getNaam());
        }
        int keuze = scanner.nextInt();
        Boot gekozenBoot = boten.get(keuze - 1);

        for(SoortOnderdelen soort: gekozenBoot.getCategorien()){
            int i = 0;
            System.out.println(gekozenBoot.getCategorien().get(i).soortOnderdeel);
            i++;
        }
        System.out.println("Kies een categorie :");
        int keuze2 = scanner.nextInt() - 1;
        SoortOnderdelen soort = gekozenBoot.getCategorien().get(keuze2);

        for(Onderdelen onderdeel1: soort.getOnderdelen()){
            System.out.println(onderdeel1.getNaam());
        }
        System.out.print("Kies een onderdeel: ");
        int keuze3 = scanner.nextInt();
        Onderdelen gekozenOnderdeel = soort.getOnderdelen().get(keuze3 - 1);
        for(MilieuKorting milieukorting : milieuKortingen) {
            System.out.println(milieukorting.getNaam());
        }
        System.out.print("Kies een milieu korting: ");
        int keuze4 = scanner.nextInt();
        gekozenOnderdeel.setMilieuKorting(milieuKortingen.get(keuze4));
        System.out.print("Korting is toegevoegd aan: " + gekozenOnderdeel.getNaam());
        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, categorien, gebruikers);
    }


    public static void kiesKlantkorting(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < klanten.size(); i++) {
            System.out.println((i + 1) + ". " + klanten.get(i).getNaam());
        }

        System.out.println("Kies een klanttype: ");
        int keuze = scanner.nextInt();

        if (keuze >= 1 && keuze <= klanten.size()) {

            System.out.println(klanten.get(keuze - 1).getNaam() + " geselecteerd.");

        } else {
            System.out.println("Ongeldige keuze.");
        }
        System.out.println("Kies hoeveel korting u wilt toevoegen:");
        int korting = scanner.nextInt();
        klanten.get(keuze - 1).setKorting(korting);
        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
    }

    public static void voegNieuweOnderdelen(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens) {
    }

    public static void maakNieuweKlantType(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wilt u een nieuwe klanttype aanmaken? J/N");
        String keuze = scanner.nextLine();
        if (keuze.equals("J")) {
            System.out.println("Hoe heet deze klanttype:");
            String naam = scanner.nextLine();
            klanten.add(new KlantType(naam));
            System.out.println(naam + " is toegevoegd aan de klanttypen");
            scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
        }


    }


    public static void initialiseerGebruikers(ArrayList<Gebruiker> gebruikers) {
        gebruikers.add(new Gebruiker("Qwerty123"));
        gebruikers.add(new Gebruiker("12345"));
        gebruikers.add(new Gebruiker("Angelo"));
        gebruikers.add(new Gebruiker("Yegor"));
        gebruikers.add(new Gebruiker("Chaimae"));
        gebruikers.add(new Gebruiker("Milana"));
        gebruikers.add(new Gebruiker("Lennart"));
    }

    public static void initialiseerExtra(ArrayList<Extras> extra) {
        extra.add(new Extras("Airconditioning"));
        extra.add(new Extras("Koelkast"));
        extra.add(new Extras("Binnenstoelen"));
        extra.add(new Extras("Lifevest"));
    }


    public static void initialiseerKlanttype(ArrayList<KlantType> klantTypes) {
        klantTypes.add(new KlantType("Particulier"));
        klantTypes.add(new KlantType("Bedrijf"));
        klantTypes.add(new KlantType("Overheid"));
    }

    public static void initialiseerNavigatieSysteem(ArrayList<Onderdelen> navigatieSystemen) {
        navigatieSystemen.add(new Onderdelen("GPS Ontvanger"));
        navigatieSystemen.add(new Onderdelen("Kaartplotter"));
        navigatieSystemen.add(new Onderdelen("Compass"));
        navigatieSystemen.add(new Onderdelen("Diepte meter"));
        navigatieSystemen.add(new Onderdelen("Traagsheidsnavigatie"));
    }

    public static void initialiseerHout(ArrayList<Onderdelen> hout) {
        hout.add(new Onderdelen("Iroko"));
        hout.add(new Onderdelen("Mahonie"));
        hout.add(new Onderdelen("Oak"));
        hout.add(new Onderdelen("Plantage teak"));
        hout.add(new Onderdelen("Padoekes"));
        hout.add(new Onderdelen("Marple"));
        hout.add(new Onderdelen("Essen"));
        hout.add(new Onderdelen("Afzelia"));
    }

    public static void initialiseerMotor(ArrayList<Onderdelen> motors) {
        motors.add(new Onderdelen("Elektrische binnenboord motor"));
        motors.add(new Onderdelen("Elektrische buitenboord motor"));
        motors.add(new Onderdelen("Diesel binnenboord motor"));
        motors.add(new Onderdelen("Diesel buitenboord motor"));
    }

    public static void initialiseerBrandstofTank(ArrayList<Onderdelen> brandstofTanken) {
        brandstofTanken.add(new Onderdelen("Standaard tank"));
        brandstofTanken.add(new Onderdelen("Groot tank"));
        brandstofTanken.add(new Onderdelen("Extra groot tank"));
        brandstofTanken.add(new Onderdelen("Jerrycan"));
    }

    public static void initialiseerCategorien(ArrayList<SoortOnderdelen> categorien, SoortOnderdelen navigatieSysteem, SoortOnderdelen motor, SoortOnderdelen brandStofTank, SoortOnderdelen hout) {
        categorien.add(navigatieSysteem);
        categorien.add(motor);
        categorien.add(brandStofTank);
        categorien.add(hout);


    }
}










