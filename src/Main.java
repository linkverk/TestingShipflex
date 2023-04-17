
import java.util.ArrayList;
import java.util.Scanner;

    public class Main {


    public static void main(String[] args) {

        ArrayList<MilieuKorting> milieuKortingen = new ArrayList<>();
        milieuKortingen.add(new MilieuKorting("Lager CO2 uitstoot"));
        milieuKortingen.add(new MilieuKorting("Duurzaam Product"));
        milieuKortingen.add(new MilieuKorting("Elektrisch onderdeel"));


        ArrayList<SoortOnderdelen> jachtOnderdelen = new ArrayList<>();
         SoortOnderdelen jachtRomp = new SoortOnderdelen("Romp");
        initialiseerJachtOnderdelenRomp(jachtRomp);
        SoortOnderdelen jachtVloer = new SoortOnderdelen("Interieur Vloer");
        initialiseerVloerJacht(jachtVloer);
        SoortOnderdelen jachtDek = new SoortOnderdelen("Dek");
        initialiseerJachtOnderdelenDek(jachtDek) ;
        SoortOnderdelen jachtStuur = new SoortOnderdelen("Stuur Systeem");
       initialiseerJachtOnderdelenStuurSysteem(jachtStuur);
        SoortOnderdelen jachtMotor = new SoortOnderdelen("Motor");
        initialiseerJachtOnderdelenMotor(jachtMotor);
        SoortOnderdelen jachtBrandstofTank = new SoortOnderdelen("Brandstof Tank");
        initialiseerBrandstofTankJacht(jachtBrandstofTank);
        SoortOnderdelen jachtNavigatieSysteem = new SoortOnderdelen("NavigatieSysteem");
        initialiseerNavigatieSysteemJacht (jachtNavigatieSysteem);

        initialiseerCategorienJachtOnderdelen(jachtOnderdelen, jachtRomp, jachtVloer, jachtDek,  jachtStuur,  jachtMotor, jachtBrandstofTank, jachtNavigatieSysteem);
        Boot jacht = new Boot("Jacht",jachtOnderdelen);

        ArrayList<SoortOnderdelen> ferryOnderdelen = new ArrayList<>();
       SoortOnderdelen ferryRomp = new SoortOnderdelen("Romp");
        initialiseerFerryOnderdelenRomp(ferryRomp);
        SoortOnderdelen ferryDek = new SoortOnderdelen("Dek");
        SoortOnderdelen ferryVloer = new SoortOnderdelen("Interieur vloer");
      initialiseerFerryOnderdelenDek(ferryDek);

        initialiseerVloerFerry(ferryVloer);
        SoortOnderdelen ferryStuur = new SoortOnderdelen("Stuur Systeem");
         initialiseerFerryOnderdelenStuurSysteem(ferryStuur);
        SoortOnderdelen ferryMotor = new SoortOnderdelen("Motor");
         initialiseerFerryOnderdelenMotor(ferryMotor);
        SoortOnderdelen ferryBrandstofTank = new SoortOnderdelen("Brandstof Tank");
        initialiseerBrandstofTankFerry(ferryBrandstofTank);
        SoortOnderdelen ferryNavigatieSysteem = new SoortOnderdelen("NavigatieSysteem");
        initialiseerNavigatieSysteemFerry (ferryNavigatieSysteem);
        initialiseerCategorienFerryOnderdelen( ferryOnderdelen, ferryRomp, ferryVloer, ferryDek, ferryStuur, ferryMotor, ferryNavigatieSysteem, ferryBrandstofTank);
        Boot ferry = new Boot("Ferry",ferryOnderdelen );

        ArrayList<SoortOnderdelen> woonBootOnderdelen = new ArrayList<>();
        SoortOnderdelen woonBootRomp = new SoortOnderdelen("Romp");
         initialiseerWoonBootOnderdelenRomp(woonBootRomp);
        SoortOnderdelen woonBootVloer = new SoortOnderdelen("Interieur Vloer");
        initialiseerVloerWoonBoot(woonBootVloer);
        SoortOnderdelen woonBootDek = new SoortOnderdelen("Dek");
        initialiseerWoonBootOnderdelenDek(woonBootDek);
        SoortOnderdelen woonBootStuur = new SoortOnderdelen("Stuur Systeem");
        initialiseerWoonBootOnderdelenStuur(woonBootStuur);
        SoortOnderdelen woonBootMotor = new SoortOnderdelen("Motor");
       initialiseerWoonBootOnderdelenMotor(woonBootMotor);
        SoortOnderdelen woonBootBrandstofTank = new SoortOnderdelen("Brandstof Tank");
        initialiseerBrandstofTankWoonBoot(woonBootBrandstofTank);
        SoortOnderdelen woonBootNavigatieSysteem = new SoortOnderdelen("NavigatieSysteem");
        initialiseerNavigatieSysteemWoonBoot (woonBootNavigatieSysteem);
        initialiseerCategorienWoonBootOnderdelen( woonBootOnderdelen, woonBootRomp, woonBootVloer, woonBootDek, woonBootStuur, woonBootMotor, woonBootNavigatieSysteem, woonBootBrandstofTank);
        Boot woonBoot = new Boot("WoonBoot",woonBootOnderdelen );

        ArrayList<SoortOnderdelen> speedBootOnderdelen = new ArrayList<>();
        SoortOnderdelen speedBootRomp = new SoortOnderdelen("Romp");
        initialiseerSpeedBootOnderdelenRomp(speedBootRomp);

        SoortOnderdelen speedBootDek = new SoortOnderdelen("Dek");
       initialiseerSpeedBootOnderdelenDek(speedBootDek);
        SoortOnderdelen speedBootStuur = new SoortOnderdelen("Stuur Systeem");
        initialiseerSpeedBootOnderdelenStuur(speedBootStuur);
        SoortOnderdelen speedBootMotor = new SoortOnderdelen("Motor" );
        initialiseerSpeedBootOnderdelenMotor(speedBootMotor);
        SoortOnderdelen speedBootBrandstofTank = new SoortOnderdelen("Brandstof Tank");
        initialiseerBrandstofTankSpeedBoot(speedBootBrandstofTank);
        SoortOnderdelen speedBootNavigatieSysteem = new SoortOnderdelen("NavigatieSysteem");
        initialiseerNavigatieSysteemSpeedBoot (speedBootNavigatieSysteem);
        initialiseerCategorienSpeedBootOnderdelen(speedBootOnderdelen, speedBootRomp,  speedBootDek, speedBootStuur, speedBootMotor, speedBootNavigatieSysteem, speedBootBrandstofTank);
        Boot speedBoot = new Boot ("Speedboot",speedBootOnderdelen );

        ArrayList<SoortOnderdelen> containerOnderdelen = new ArrayList<>();
        SoortOnderdelen containerRomp = new SoortOnderdelen("Romp");
         initialiseerContainerOnderdelenRomp(containerRomp);

        SoortOnderdelen containerDek = new SoortOnderdelen("Dek");
        initialiseerContainerOnderdelenDek(containerDek);
        SoortOnderdelen containerStuur = new SoortOnderdelen("Stuur Systeem");
        initialiseerContainerOnderdelenStuur(containerStuur);
        SoortOnderdelen containerMotor = new SoortOnderdelen("Motor");
        initialiseerContainerOnderdelenMotor(containerMotor);
        SoortOnderdelen containerBrandstofTank = new SoortOnderdelen("Brandstof Tank");
        initialiseerBrandstofTankContainer(containerBrandstofTank);
        SoortOnderdelen containerNavigatieSysteem = new SoortOnderdelen("NavigatieSysteem");
        initialiseerNavigatieSysteemContainer (containerNavigatieSysteem);
        initialiseerCategorienContainerOnderdelen(containerOnderdelen, containerRomp, containerDek, containerStuur, containerMotor, containerNavigatieSysteem, containerBrandstofTank);
        Boot container = new Boot("Containerschip",containerOnderdelen );



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

        SoortOnderdelen extra = new SoortOnderdelen("Extras");
        ArrayList<Onderdelen> extras = new ArrayList<>();
        initialiseerExtra(extras);
        extra.setExtras(extras);


        ArrayList<Onderdelen> selectedOnderdelen = new ArrayList<>();
        //zet categorien die hierboven geinitialiseerd zijn in een arraylist.
        KlantType klant = new KlantType();
        login(milieuKortingen, boten, gebruikers, klant, klantTypes, totaal, selectedOnderdelen, extra);


    }




    public static void login(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, SoortOnderdelen soortOnderdelens) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("*                                 *");
        System.out.println("*  WELKOM BIJ SHIPFLEX            *");
        System.out.println("*                                 *");
        System.out.println("***********************************");
        System.out.println();
        System.out.println("Voer uw gebruikerscode in:");
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

    public static void klantMenu(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, SoortOnderdelen soortOnderdelens) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== MENU ==========");
        System.out.println("1. Zie offerte");
        System.out.println("2. Zie prijsopgave");
        System.out.println("3. Zie lijst met opties");
        System.out.println("4. Log uit");
        System.out.println("==========================");
        boolean checkLoop = true;
        while(checkLoop){
        int keuze = scanner.nextInt();
        switch (keuze) {

            case 1:
                zieOfferte(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);
                checkLoop = false;
                break;
            case 2:
                ziePrijsopgave(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);
                checkLoop = false;

                break;
            case 3:
                zieLijstopties(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);
                checkLoop = false;

                break;

            case 4:
                login(milieuKortingen, boten, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);
                checkLoop = false;
            break;

            default:
                System.out.println("Ongeldige keuze. Probeer het nog eens");
        }}
    }
    public static void zieOfferte(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, SoortOnderdelen soortOnderdelens) {
        System.out.println("De offerte:");
        System.out.println();
        System.out.println();
        System.out.println(jouGebruiker.getBootNaam());
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("| %-30s | %20s | %30s |%n", "Naam", "Prijs", "Milieukorting");
        System.out.println("---------------------------------------------------------------------------------------------");

        for (Onderdelen onderdeel : jouGebruiker.getTotaal().onderdelen) {
            if (onderdeel.milieuKorting == null) {
                System.out.printf("| %-30s | %20s | %30s |%n", onderdeel.getNaam(), onderdeel.getPrijs(), "geen");
            } else {
                System.out.printf("| %-30s | %20s | %30s |%n", onderdeel.getNaam(), onderdeel.getPrijs(), onderdeel.milieuKorting.getNaam() + " (" + onderdeel.milieuKorting.getKortingen() + "%)");
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------");

        System.out.println("Totaalprijs: " + jouGebruiker.getTotaal().getTotaalPrijs());
        klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);

    }
    public static void ziePrijsopgave(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, SoortOnderdelen soortOnderdelens) {
        System.out.println("De prijsopgave");
        System.out.println(jouGebruiker.getBootNaam());
        System.out.println();
        for (Onderdelen onderdeel : jouGebruiker.getTotaal().onderdelen) {
            System.out.println(onderdeel.getNaam() + " prijs: " + onderdeel.getPrijs());


        }
        System.out.println();

        System.out.println("Totaalprijs:" + jouGebruiker.getTotaal().getTotaalPrijs());
        klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);


    }




    public static void zieLijstopties(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, SoortOnderdelen extras) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Onderdelen> gekozenOnderdelen= new ArrayList<>();
        int i = 0;
        for(Boot boot : boten){
            int telSoortBoten = i += 1;
            System.out.println(telSoortBoten + " " + boot.getNaam() + " onderdelen.");
        }
        System.out.println("Voor welk soort boot onderdelen wilt u kiezen");
        int keuze = scanner.nextInt() - 1;
        Boot gekozenBoot = boten.get(keuze);
        System.out.println();
        i = 0;
        for(SoortOnderdelen soortOnderdelen: gekozenBoot.getCategorien()){

            int telSoortonderdelen = i += 1;
            System.out.println(telSoortonderdelen + ". " + soortOnderdelen.naam);
        }
        System.out.println("Wat voor categorie onderdelen?");
        int keuze2 = scanner.nextInt();
        SoortOnderdelen gekozenCategorie = gekozenBoot.categorien.get(keuze2 - 1);
i = 0;
        for(Onderdelen onderdelen1: gekozenCategorie.getOnderdelen()){
            int loopTel = i += 1;
            if (onderdelen1.getPrijs() == 0 && onderdelen1.milieuKorting == null){
            System.out.println(loopTel +". Naam: " + onderdelen1.getNaam());}
            if (onderdelen1.getPrijs() != 0){
                System.out.println(loopTel +". Naam: " + onderdelen1.getNaam() +"  Prijs: " + onderdelen1.getPrijs());
            }
            if (onderdelen1.milieuKorting != null){
                System.out.println(loopTel +". Naam: " + onderdelen1.getNaam() + " Milieukorting: " + onderdelen1.milieuKorting.getNaam());
            }

        }
        System.out.println("Wilt u opties in een mandje zetten? ja/nee: ");
       scanner.nextLine();
        String keuze3 = scanner.nextLine();

            switch (keuze3) {
                case "ja":
                    while(keuze3.equals("ja")) {
                        System.out.print("voer de nummer van het onderdeel in:");
                        int keuze4 = scanner.nextInt();
                        Onderdelen gekozenOnderdeel = gekozenCategorie.getOnderdelen().get(keuze4 - 1);
                        gekozenOnderdelen.add(gekozenOnderdeel);
                        i = 0;

                        System.out.println("Wilt u de extra opties zien?");
                        System.out.println("Type 1 voor extra opties");
                        System.out.println("Type 2 om door te gaan");

                        int keuzextra = scanner.nextInt();
                        if (keuzextra == 1) {

                            for (Onderdelen onderdelen1 : extras.getOnderdelen()) {
                                int telOp = i += 1;
                                System.out.println(telOp + " " + onderdelen1.getNaam());
                            }
                            System.out.println("Selecteer een optie:");
                            int keuzeExtra = scanner.nextInt();
                            Onderdelen gekozenExtra = extras.getOnderdelen().get(keuzeExtra);
                            gekozenOnderdelen.add(gekozenExtra);
                        }
                 i =0;

                            for (SoortOnderdelen soortOnderdelen : gekozenBoot.getCategorien()) {

                                int telSoortonderdelen = i += 1;
                                System.out.println(telSoortonderdelen + ". " + soortOnderdelen.naam);
                            }
                            System.out.println("Wat voor categorie onderdelen?");
                            keuze2 = scanner.nextInt();
                            gekozenCategorie = gekozenBoot.categorien.get(keuze2 - 1);
                            i = 0;
                            for (Onderdelen onderdelen1 : gekozenCategorie.getOnderdelen()) {
                                int loopTel = i += 1;
                                System.out.println(loopTel + ". Naam: " + onderdelen1.getNaam());
                                if (onderdelen1.getPrijs() != 0) {
                                    System.out.println("  Prijs: " + onderdelen1.getPrijs());
                                }
                                if (onderdelen1.milieuKorting != null) {
                                    System.out.print(" Milieukorting: " + onderdelen1.milieuKorting.getNaam());
                                }
                            }
                            System.out.println("Wilt u opties in een mandje zetten? ja/nee: ");
                            scanner.nextLine();
                            String keuzeEinde = scanner.nextLine();
                            if (keuzeEinde.equals("nee")) {
                                System.out.println("Uw mandje bestaat uit de volgende onderdelen: ");
                                for (Onderdelen onderdelen1 : gekozenOnderdelen) {
                                    System.out.println("- " + onderdelen1.getNaam());
                                }
                            }
                            keuze3 = keuzeEinde;



                    }
                    klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, extras);

                    break;

                case "nee":
                    klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, extras);

                    break;


                default:
                    System.out.println("Ongeldige invoer. Probeer het nog eens");
                    klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, extras);
            }
        }



    public static void scheepsBouwerMenu(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, SoortOnderdelen soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("========== MENU ==========");
        System.out.println("1. Maak een offerte");
        System.out.println("2. Zie lijst met opties");
        System.out.println("3. Voeg klant kortingen toe");
        System.out.println("4. Voeg milieukortingen toe");
        System.out.println("5. Voeg nieuwe klant types toe");
        System.out.println("6. Voeg prijzen voor onderdelen toe");
        System.out.println("7. Voeg nieuwe onderdelen toe");
        System.out.println("8. Voeg milieukortingen bij onderdelen toe");
        System.out.println("9. Log uit");
        System.out.println();
        System.out.print("Kies een optie: ");
        int keuze = scanner.nextInt();
        System.out.println("==========================");
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

                voegNieuweOnderdelen(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
                break;
            case 8:

                onderdelenVoegMilieukortingToe(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
                break;

            case 9:

                login(milieuKortingen, boten, gebruikers, klant, klanten, totaal, onderdelen, soortOnderdelens);
                break;

            default:
                System.out.println("Ongeldige keuze, probeer nog een keer.");
                scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);

                break;
        }
    }




    public static void offerteMaker(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<Onderdelen> selectedOnderdelen, SoortOnderdelen extras, ArrayList<KlantType> klantTypes, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);
        Onderdelen selectedOnderdeel = null;
        SoortOnderdelen selectedCategory = null;
        System.out.println();
        System.out.println();


        System.out.println("Voer de code in voor wie deze offerte is:");
        String gebruikersNaam = scanner.nextLine();
        boolean isValidGebruiker = false;
        for (Gebruiker gebruiker : gebruikers) {
            if (gebruikersNaam.equals(gebruiker.getGebruikernaam())) {
                isValidGebruiker = true;
                break;
            }
        }

        if (!isValidGebruiker) {

            System.out.println("Ongeldige code");

            offerteMaker(milieuKortingen, boten, jouGebruiker, totaal, klant, selectedOnderdelen, extras, klantTypes, gebruikers);
        }
        for (Gebruiker gebruiker : gebruikers) {
            if (gebruikersNaam.equals(gebruiker.getGebruikernaam()) && gebruiker.getKlanttype() == null) {
                System.out.println("Wat voor klant is " + gebruiker.getGebruikernaam() + "?");
                System.out.println();
                int i = 0;
                for (KlantType klanten : klantTypes) {
                   int klantTel =  i += 1;
                    System.out.println((klantTel) + ". " + klanten.getNaam());

                }
                int kiesKlantType = scanner.nextInt();
                gebruiker.setKlanttype(klantTypes.get(kiesKlantType - 1));


            }
        }
        int i = 0;
        System.out.println("========== BOTEN ==========");
        for (Boot boot : boten) {
            int bootTel =  i += 1;
            System.out.println((bootTel) + ". " + boot.getNaam());

        }
        System.out.println("Wat voor boot wilt u maken?");
        int kiesBoot = scanner.nextInt();
        Boot gekozenBoot = boten.get(kiesBoot - 1);
        System.out.println("==========================");
        int input = 1;
        ArrayList<SoortOnderdelen> checkOfCategorieLeegis = new ArrayList<>();
        while (input != 3) {
            System.out.println("========== CATEGORIEN ==========");

            System.out.println();
            for (i = 0; i < gekozenBoot.getCategorien().size(); i++) {
                //print catogorien
                System.out.println((i + 1) + ". " + gekozenBoot.getCategorien().get(i).naam);
            }
            System.out.println("Voor welke soort onderdelen wilt u kiezen?:");
            int selectedCategoryIndex = scanner.nextInt() - 1;
            System.out.println("===============================");
            selectedCategory = gekozenBoot.getCategorien().get(selectedCategoryIndex);

            for (SoortOnderdelen soort :  checkOfCategorieLeegis) {
                if (selectedCategory == soort) {
                    System.out.println("U heeft al een keer gekozen voor dit soort onderdeel.");
                    System.out.println("Wilt u dit onderdeel vervangen met een ander?. J/N");
                    scanner.nextLine();
                    String choose = scanner.nextLine();
                    if (choose.equals("N")) {
                        System.out.println("========== CATEGORIEN ==========");

                        for (i = 0; i < gekozenBoot.getCategorien().size(); i++) {
                            //print catogorien
                            System.out.println((i + 1) + ". " + gekozenBoot.getCategorien().get(i).naam);
                        }
                        System.out.println("Voor welke soort onderdelen wilt u kiezen?:");
                        selectedCategoryIndex = scanner.nextInt() - 1;
                        selectedCategory = gekozenBoot.getCategorien().get(selectedCategoryIndex);

                        System.out.println("===============================");

                    }
                    if (choose.equals("J")) {
                        System.out.println("U heeft gekozen voor " + selectedCategory.naam);


                    }
                }
            }
            if (selectedCategory.getCategorien() != null) {
                System.out.println("========== CATEGORIEN ==========");

                for (SoortOnderdelen soort : selectedCategory.getCategorien()) {
                    int soortTel = i + 1;
                    System.out.println((soortTel) + " " + soort.naam);

                }
                System.out.println("Kies een soort onderdeel");
                int keuze = scanner.nextInt();
                System.out.println("==============================");

                SoortOnderdelen onderdeel = selectedCategory.getCategorien().get(keuze - 1);
                System.out.println("========== ONDERDELEN ==========");

                for (Onderdelen onderdelen : onderdeel.getOnderdelen()) {
                    System.out.println(onderdelen.getNaam());
                }
                System.out.println("Kies een onderdeel");
                int keuze2 = scanner.nextInt() - 1;
                selectedOnderdeel = onderdeel.getOnderdelen().get(keuze2);
                System.out.println("==============================");

            }


            checkOfCategorieLeegis.add(gekozenBoot.getCategorien().get(selectedCategoryIndex));

            if (selectedCategory.getCategorien() == null) {



                System.out.println("========== ONDERDELEN ==========");

                for (i = 0; i < selectedCategory.onderdelen.size(); i++) {
                    //print specifieke onderdelen
                    System.out.println((i + 1) + ". " + selectedCategory.onderdelen.get(i).getNaam());
                }
                System.out.println("Welke onderdelen wilt u toevoegen? (kies 0 om te stoppen)");
                int selectedOnderdeelIndex = scanner.nextInt() - 1;
                System.out.println("==============================");

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
                selectedOnderdelen.add(selectedOnderdeel);
            }

            System.out.println(selectedOnderdeel.getNaam() + " is toegevoegd aan de offerte");
            System.out.println();
            System.out.println("Wilt u nog meer onderdelen toevoegen?");
            System.out.println("Type 1 om door te gaan");
            System.out.println("type 2 om extra opties toe tevoegen");
            System.out.println("type 3 om te stoppen");
            input = scanner.nextInt();
            System.out.println();
            if (input == 2) {


                String antwoord = "ja";

                while (antwoord.equals("ja")) {

                    System.out.println("========== Extras ==========");

                    System.out.println("Kies een extra optie:");
                    System.out.println("1. Airconditioning");
                    System.out.println("2. koelkast");
                    System.out.println("3. Binnenstoelen");
                    System.out.println("4. Lifevest");
                    System.out.print("Voer het nummer van de gewenste optie in: ");
                    System.out.println();
                    boolean eindigLoop = true;
                    while (eindigLoop) {

                        int keuze = scanner.nextInt();
                        switch (keuze) {
                            case 1:
                                extras.getOnderdelen().get(0).setPrijs(250);
                                selectedOnderdelen.add( extras.getOnderdelen().get(0));
                                eindigLoop = false;
                                break;
                            case 2:
                                extras.getOnderdelen().get(1).setPrijs(250);
                                selectedOnderdelen.add( extras.getOnderdelen().get(1));
                                eindigLoop = false;
                                break;
                            case 3:
                                extras.getOnderdelen().get(2).setPrijs(250);
                                selectedOnderdelen.add( extras.getOnderdelen().get(2));
                                eindigLoop = false;
                                break;
                            case 4:
                                extras.getOnderdelen().get(3).setPrijs(250);
                                selectedOnderdelen.add( extras.getOnderdelen().get(3));
                                eindigLoop = false;
                                break;
                            default:
                                System.out.println("Ongeldige keuze. Probeer het nog eens.");
                                break;
                        }
                    }
                    System.out.println("Wilt u nog meer extra opties toevoegen? (ja/nee): ");
                    scanner.nextLine();
                    antwoord = scanner.nextLine();



                }
                System.out.println("Wilt u nog meer essentiële opties toevoegen?:");
                System.out.println("Type 1 om door te gaan");
                System.out.println("type 2 om extra opties toe tevoegen");
                System.out.println("type 3 om te stoppen");


                input = scanner.nextInt();

                }


            }
        System.out.println("=====================================");

        System.out.println("De offerte bestaat uit:");
        System.out.println();

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
        System.out.println();
            System.out.println("  Totaalprijs: " + totaal.getTotaalPrijs());
        System.out.println();

        System.out.println("=====================================");

        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klantTypes, selectedOnderdelen, extras, gebruikers);


    }

    public static void voegPrijzenOnderdelen(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, SoortOnderdelen soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);
int i = 0;
        for (Boot boot : boten) {
            int telSoortBoten = i += 1;
            System.out.println((telSoortBoten) + " " + boot.getNaam());
        }
         i = 0;
        int keuzeBoot = scanner.nextInt() - 1;
        Boot gekozenBoot = boten.get(keuzeBoot);
        for (SoortOnderdelen soort : gekozenBoot.getCategorien()) {
            int telSoort = i += 1;
            System.out.println(telSoort + ". " + soort.naam);

        }
        i = 0;
        System.out.print("Voor welk soort onderdeel wilt u een prijs toevoegen?");
        int keuze = scanner.nextInt() - 1;
        for (Onderdelen onderdeel : gekozenBoot.getCategorien().get(keuze).getOnderdelen()) {
            int telOnderdelen= i += 1;
            if (onderdeel.getPrijs() == 0) {
                System.out.println(telOnderdelen + ". " + onderdeel.getNaam());
            }
            if (onderdeel.getPrijs() != 0) {
                System.out.println(telOnderdelen + ". " + onderdeel.getNaam() + " -       prijs: " + onderdeel.getPrijs());
            }

        }
        int keuze2 = scanner.nextInt() - 1;
        System.out.println("Kies een onderdeel");
        System.out.println("U heeft gekozen voor " + gekozenBoot.getCategorien().get(keuze).getOnderdelen().get(keuze2).getNaam());
        System.out.println("Huidige prijs: " + gekozenBoot.getCategorien().get(keuze).getOnderdelen().get(keuze2).getPrijs());
        System.out.print("Kies een nieuwe prijs:");
        double nieuwePrijs = scanner.nextInt();

        gekozenBoot.getCategorien().get(keuze).getOnderdelen().get(keuze2).setPrijs(nieuwePrijs);
        System.out.println("Wilt u nog andere prijzen toevoegen?");
        System.out.println("Type 1 om door te gaan");
        System.out.println("Type 2 om terug naar het menu te gaan");

        boolean checkLoop = true;

        while(checkLoop) {
            int keuze3 = scanner.nextInt();
            switch (keuze3) {
                case 1:
                    voegPrijzenOnderdelen(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
                case 2:
                    scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
                    checkLoop = false;
                default:
                    System.out.println("Ongeldige keuze. Probeer het nog eens");
                    System.out.println("Type 1 om door te gaan");
                    System.out.println("Type 2 om terug naar het menu te gaan");
                    break;
            }
        }

        }


    public static void lijstOptiesScheepsBouwer(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, SoortOnderdelen extras, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for(Boot boot : boten){
            int telSoortBoten = i += 1;
            System.out.println(telSoortBoten + " " + boot.getNaam() + " onderdelen.");
        }
        System.out.println("Voor welk soort boot onderdelen wilt u kiezen");
        int keuze = scanner.nextInt() - 1;
        Boot gekozenBoot = boten.get(keuze);
        System.out.println();
        i = 0;
        for(SoortOnderdelen soortOnderdelen: gekozenBoot.getCategorien()){

            int telSoortonderdelen = i += 1;
            System.out.println(telSoortonderdelen + ". " + soortOnderdelen.naam);
        }
        System.out.println("Wat voor categorie onderdelen?");
        int keuze2 = scanner.nextInt();
        SoortOnderdelen categorie = gekozenBoot.categorien.get(keuze2 - 1);

        for(Onderdelen onderdelen1: categorie.getOnderdelen()){

            System.out.println("- Naam: " + onderdelen1.getNaam());
            if (onderdelen1.getPrijs() != 0){
                System.out.print("     Prijs: " + onderdelen1.getPrijs());
            }
            if (onderdelen1.milieuKorting != null){
                System.out.print("     Milieukorting: " + onderdelen1.milieuKorting.getNaam());
            }

        }
        System.out.println("Wilt u de extra opties zien? ja/nee");


      scanner.nextLine();
        String keuzextra = scanner.nextLine();
        if(keuzextra.equals("ja")) {

            for (Onderdelen onderdelen1 : extras.getOnderdelen()) {

                System.out.println("- " + onderdelen1.getNaam());
            }


                scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, extras, gebruikers);

            }
        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, extras, gebruikers);


    }





    public static void voegMilieukorting(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, SoortOnderdelen categorien, ArrayList<Gebruiker> gebruikers) {
       Scanner scanner = new Scanner(System.in);
       int i = 0;
       for(MilieuKorting milieuKorting: milieuKortingen){

           int telMilieu = i += 1;
           System.out.println(telMilieu + ". " + milieuKorting.getNaam());

       }
       System.out.print("Kies een milieu korting: ");
       int keuze = scanner.nextInt();
       System.out.print("Voeg percentage van korting toe: ");
       int korting = scanner.nextInt();
       milieuKortingen.get(keuze - 1).setKortingen(korting);


        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, categorien, gebruikers);
    }
    public static void onderdelenVoegMilieukortingToe(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, SoortOnderdelen categorien, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voor welk soort boot onderdelen?");
        System.out.println();

int i = 0;

        for(Boot boot:boten){
            int bootTel =  i += 1;
            System.out.println(bootTel + ". " + boot.getNaam());
        }
        int keuze = scanner.nextInt();
        Boot gekozenBoot = boten.get(keuze - 1);
i = 0;
        for(SoortOnderdelen soort: gekozenBoot.getCategorien()){
            int telSoort = i += 1;
            System.out.println(telSoort + ". " + soort.naam);

        }
        System.out.println();

        System.out.println("Kies een categorie :");
        int keuze2 = scanner.nextInt() - 1;
        SoortOnderdelen soort = gekozenBoot.getCategorien().get(keuze2);
i = 0;
        for(Onderdelen onderdeel1: soort.getOnderdelen()){
            int telOnderdeel = i += 1;
            System.out.println(telOnderdeel + ". " + onderdeel1.getNaam());
        }
        System.out.print("Kies een onderdeel: ");
        int keuze3 = scanner.nextInt();

i = 0;
        Onderdelen gekozenOnderdeel = soort.getOnderdelen().get(keuze3 - 1);
        for(MilieuKorting milieukorting : milieuKortingen) {
            int telMilieu = i += 1;
            System.out.println(telMilieu + ". " + milieukorting.getNaam());
        }
        System.out.print("Kies een milieu korting: ");
        int keuze4 = scanner.nextInt() - 1;
        gekozenOnderdeel.setMilieuKorting(milieuKortingen.get(keuze4));
        System.out.println();

        System.out.println("Korting is toegevoegd aan: " + gekozenOnderdeel.getNaam());
        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, categorien, gebruikers);
    }


    public static void kiesKlantkorting(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, SoortOnderdelen soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < klanten.size(); i++) {
            System.out.println((i + 1) + ". " + klanten.get(i).getNaam());
        }

        System.out.println("Kies een klanttype: ");
        int keuze = scanner.nextInt();
        System.out.println();


        if (keuze >= 1 && keuze <= klanten.size()) {

            System.out.println(klanten.get(keuze - 1).getNaam() + " geselecteerd.");

        } else {
            System.out.println("Ongeldige keuze.");
        }
        System.out.println();

        System.out.println("Kies hoeveel korting u wilt toevoegen:");
        int korting = scanner.nextInt();
        klanten.get(keuze - 1).setKorting(korting);
        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
    }

        public static void voegNieuweOnderdelen(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, SoortOnderdelen soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
            Scanner scanner = new Scanner(System.in);
            int i = 0;
        for (Boot boot : boten) {
            int bootTel =  i += 1;
                System.out.println((bootTel) + " " + boot.getNaam());
            }
            System.out.println("Kies een boot");
            int keuze1 = scanner.nextInt() - 1;
            Boot gekozenBoot = boten.get(keuze1);
            i = 0;
            for(SoortOnderdelen soort : gekozenBoot.getCategorien()){
                int soortTel =  i += 1;
                System.out.println((soortTel) + " " + soort.naam);
            }
            System.out.println("Kies een categorie: ");
            int keuze2 = scanner.nextInt() - 1;
            SoortOnderdelen gekozenCategorie = gekozenBoot.getCategorien().get(keuze2);
                    scanner.nextLine();
                    System.out.println("Kies een naam voor het nieuwe onderdeel");
            String nieuweOnderdeel = scanner.nextLine();
            gekozenCategorie.onderdelen.add(new Onderdelen(nieuweOnderdeel));
            scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
        }
    public static void maakNieuweKlantType(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, SoortOnderdelen soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wilt u een nieuwe klanttype aanmaken? J/N");
        String keuze = scanner.nextLine();
        System.out.println();

        if (keuze.equals("J")) {
            System.out.println("Hoe heet deze klanttype:");
            String naam = scanner.nextLine();
            klanten.add(new KlantType(naam));
            System.out.println();

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

    public static void initialiseerExtra(ArrayList<Onderdelen> extra) {
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

    public static void initialiseerNavigatieSysteemJacht(SoortOnderdelen navigatieSystemen) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();

        onderdelens.add(new Onderdelen("GPS Ontvanger"));
        onderdelens.add(new Onderdelen("Kaartplotter"));
        onderdelens.add(new Onderdelen("Compass"));
        onderdelens.add(new Onderdelen("Diepte meter"));
        onderdelens.add(new Onderdelen("Traagsheidsnavigatie"));
        navigatieSystemen.setOnderdelen(onderdelens);
    }
        public static void initialiseerNavigatieSysteemFerry(SoortOnderdelen navigatieSystemen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();

            onderdelens.add(new Onderdelen("Kaartplotter"));
            onderdelens.add(new Onderdelen("Compass"));
            navigatieSystemen.setOnderdelen(onderdelens);
        }

        public static void initialiseerNavigatieSysteemWoonBoot(SoortOnderdelen navigatieSystemen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();

            onderdelens.add(new Onderdelen("GPS Ontvanger"));
            onderdelens.add(new Onderdelen("Kaartplotter"));
            onderdelens.add(new Onderdelen("Compass"));

            navigatieSystemen.setOnderdelen(onderdelens);
        }

        public static void initialiseerNavigatieSysteemSpeedBoot(SoortOnderdelen navigatieSystemen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();

            onderdelens.add(new Onderdelen("GPS Ontvanger"));
            onderdelens.add(new Onderdelen("Compass"));
            onderdelens.add(new Onderdelen("Diepte meter"));
            onderdelens.add(new Onderdelen("Traagsheidsnavigatie"));
            navigatieSystemen.setOnderdelen(onderdelens);
        }

        public static void initialiseerNavigatieSysteemContainer(SoortOnderdelen navigatieSystemen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();

            onderdelens.add(new Onderdelen("GPS Ontvanger"));
            onderdelens.add(new Onderdelen("Kaartplotter"));
            onderdelens.add(new Onderdelen("Compass"));
            onderdelens.add(new Onderdelen("Diepte meter"));
            onderdelens.add(new Onderdelen("Traagsheidsnavigatie"));
            navigatieSystemen.setOnderdelen(onderdelens);
        }


        public static void initialiseerVloerJacht(SoortOnderdelen hout) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("Iroko"));
        onderdelens.add(new Onderdelen("Mahonie"));
        onderdelens.add(new Onderdelen("Oak"));
        onderdelens.add(new Onderdelen("Plantage teak"));
        onderdelens.add(new Onderdelen("Padoekes"));
        onderdelens.add(new Onderdelen("Marple"));
        onderdelens.add(new Onderdelen("Essen"));
        onderdelens.add(new Onderdelen("Afzelia"));
        hout.setOnderdelen(onderdelens);
    }
        public static void initialiseerVloerFerry(SoortOnderdelen hout) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Iroko"));
            onderdelens.add(new Onderdelen("Mahonie"));

            onderdelens.add(new Onderdelen("Essen"));
            onderdelens.add(new Onderdelen("Afzelia"));
            hout.setOnderdelen(onderdelens);
        }
        public static void initialiseerVloerWoonBoot(SoortOnderdelen hout) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();

            onderdelens.add(new Onderdelen("Mahonie"));
            onderdelens.add(new Onderdelen("Oak"));
            onderdelens.add(new Onderdelen("Plantage teak"));

            onderdelens.add(new Onderdelen("Essen"));
            onderdelens.add(new Onderdelen("Afzelia"));
            hout.setOnderdelen(onderdelens);
        }





    public static void initialiseerBrandstofTankJacht(SoortOnderdelen brandstofTank) {
        ArrayList<Onderdelen> onderdelens = new ArrayList<>();
        onderdelens.add(new Onderdelen("Standaard tank"));
        onderdelens.add(new Onderdelen("Groot tank"));
        onderdelens.add(new Onderdelen("Extra groot tank"));
        brandstofTank.setOnderdelen(onderdelens);
    }
        public static void initialiseerBrandstofTankFerry(SoortOnderdelen brandstofTank) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Standaard tank"));
            onderdelens.add(new Onderdelen("Jerrycan"));
            brandstofTank.setOnderdelen(onderdelens);

        }
        public static void initialiseerBrandstofTankSpeedBoot(SoortOnderdelen brandstofTank) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Standaard tank"));
            onderdelens.add(new Onderdelen("Jerrycan"));
            brandstofTank.setOnderdelen(onderdelens);

        }
        public static void initialiseerBrandstofTankContainer(SoortOnderdelen brandstofTank) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Groot tank"));
            onderdelens.add(new Onderdelen("Extra groot tank"));

            brandstofTank.setOnderdelen(onderdelens);
    }
        public static void initialiseerBrandstofTankWoonBoot(SoortOnderdelen brandstofTank) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Standaard tank"));
            onderdelens.add(new Onderdelen("Jerrycan"));
            brandstofTank.setOnderdelen(onderdelens);

        }

        public static void initialiseerCategorienJachtOnderdelen(ArrayList<SoortOnderdelen> jacht, SoortOnderdelen jacht1, SoortOnderdelen jacht2, SoortOnderdelen jacht3, SoortOnderdelen jacht4, SoortOnderdelen jacht5, SoortOnderdelen jacht6, SoortOnderdelen jacht7) {
            jacht.add(jacht1);
            jacht.add(jacht2);
            jacht.add(jacht3);
            jacht.add(jacht4);
            jacht.add(jacht5);
            jacht.add(jacht6);
            jacht.add(jacht7);

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
            onderdelens.add(new Onderdelen("Sun deck"));
            onderdelens.add(new Onderdelen("Beach deck"));
            onderdelens.add(new Onderdelen("Lagoon deck"));

            jachtOnderdelen.setOnderdelen(onderdelens);
        }


        public static void initialiseerJachtOnderdelenStuurSysteem(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Hydraulisch stuursysteem"));
            onderdelens.add(new Onderdelen("Vevor HC4645H"));
            onderdelens.add(new Onderdelen("Whaly 99"));
            jachtOnderdelen.setOnderdelen(onderdelens);
        }

        public static void initialiseerJachtOnderdelenMotor(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Siemens 1LE1503"));
            onderdelens.add(new Onderdelen("Suzuki DF100B"));
            onderdelens.add(new Onderdelen("IE1-EG"));
            jachtOnderdelen.setOnderdelen(onderdelens);
        }


        public static void initialiseerCategorienFerryOnderdelen(ArrayList<SoortOnderdelen> ferry, SoortOnderdelen ferry1, SoortOnderdelen ferry2, SoortOnderdelen ferry3, SoortOnderdelen ferry4, SoortOnderdelen ferry5, SoortOnderdelen ferry6, SoortOnderdelen ferry7) {
            ferry.add(ferry1);
            ferry.add(ferry2);
            ferry.add(ferry3);
            ferry.add(ferry4);
            ferry.add(ferry5);
            ferry.add(ferry6);
            ferry.add(ferry7);

        }

        public static void initialiseerFerryOnderdelenRomp(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Waterverplaatsende romp"));
            onderdelens.add(new Onderdelen("Halfgeleider romp"));
            jachtOnderdelen.setOnderdelen(onderdelens);
        }

        public static void initialiseerFerryOnderdelenDek(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Autodek"));
            onderdelens.add(new Onderdelen("Passagiersdek"));
            onderdelens.add(new Onderdelen("Vrachtdek"));
            jachtOnderdelen.setOnderdelen(onderdelens);
        }

        public static void initialiseerFerryOnderdelenStuurSysteem(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Mavimare GE 30"));
            onderdelens.add(new Onderdelen("EV-100"));
            onderdelens.add(new Onderdelen("Seastar light"));
            jachtOnderdelen.setOnderdelen(onderdelens);
        }


        public static void initialiseerFerryOnderdelenMotor(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Elektromotor"));
            onderdelens.add(new Onderdelen("Vetus scheepsdiesel"));
            onderdelens.add(new Onderdelen("Lofrans Falkon"));
            jachtOnderdelen.setOnderdelen(onderdelens);
        }

        public static void initialiseerCategorienWoonBootOnderdelen(ArrayList<SoortOnderdelen> woonBoot, SoortOnderdelen woonBoot1, SoortOnderdelen woonBoot2, SoortOnderdelen woonBoot3, SoortOnderdelen woonBoot4, SoortOnderdelen woonBoot5, SoortOnderdelen woonBoot6, SoortOnderdelen woonBoot7) {
            woonBoot.add(woonBoot1);
            woonBoot.add(woonBoot2);
            woonBoot.add(woonBoot3);
            woonBoot.add(woonBoot4);
            woonBoot.add(woonBoot5);
            woonBoot.add(woonBoot6);
            woonBoot.add(woonBoot7);

        }

        public static void initialiseerWoonBootOnderdelenRomp(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Waterverplaatsende romp"));
            onderdelens.add(new Onderdelen("Halfgeleider romp"));
            jachtOnderdelen.setOnderdelen(onderdelens);

        }



        public static void initialiseerWoonBootOnderdelenDek(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Zwembad"));
            onderdelens.add(new Onderdelen("Dak terras"));
            onderdelens.add(new Onderdelen("Balkon"));

            jachtOnderdelen.setOnderdelen(onderdelens);
        }

        public static void initialiseerWoonBootOnderdelenStuur(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Sea star"));
            onderdelens.add(new Onderdelen("Steer flex 3000"));
            onderdelens.add(new Onderdelen("Mavi Mare 350hp"));
            jachtOnderdelen.setOnderdelen(onderdelens);
        }

        public static void initialiseerWoonBootOnderdelenMotor(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Motor 28.92 met CBB"));
            onderdelens.add(new Onderdelen("Honda GX390"));
            onderdelens.add(new Onderdelen("Mariner 5 PK"));

            jachtOnderdelen.setOnderdelen(onderdelens);
        }



        public static void initialiseerCategorienSpeedBootOnderdelen(ArrayList<SoortOnderdelen> speedBoot, SoortOnderdelen speedBoot1, SoortOnderdelen speedBoot2, SoortOnderdelen speedBoot3, SoortOnderdelen speedBoot4, SoortOnderdelen speedBoot5, SoortOnderdelen speedBoot6) {
            speedBoot.add(speedBoot1);
            speedBoot.add(speedBoot2);
            speedBoot.add(speedBoot3);
            speedBoot.add(speedBoot4);
            speedBoot.add(speedBoot5);
            speedBoot.add(speedBoot6);


        }

        public static void initialiseerSpeedBootOnderdelenRomp(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Planerende romp"));
            onderdelens.add(new Onderdelen("Halfgeleider romp"));
            onderdelens.add(new Onderdelen("Waterverplaatsende romp"));

            jachtOnderdelen.setOnderdelen(onderdelens);
        }



        public static void initialiseerSpeedBootOnderdelenDek(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Zonnedek"));
            onderdelens.add(new Onderdelen("Lounge dek"));
            onderdelens.add(new Onderdelen("Duikdek"));

            jachtOnderdelen.setOnderdelen(onderdelens);
        }

        public static void initialiseerSpeedBootOnderdelenStuur(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Teleflex stuursysteem"));
            onderdelens.add(new Onderdelen("Riviera AR83"));
            onderdelens.add(new Onderdelen("Ultraflex T71FC"));
            jachtOnderdelen.setOnderdelen(onderdelens);
        }

        public static void initialiseerSpeedBootOnderdelenMotor(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Suzuki DF100B"));
            onderdelens.add(new Onderdelen("Volvo Penta D13-700"));
            onderdelens.add(new Onderdelen("ePropulsion"));
            jachtOnderdelen.setOnderdelen(onderdelens);
        }

        public static void initialiseerCategorienContainerOnderdelen(ArrayList<SoortOnderdelen> container, SoortOnderdelen container1, SoortOnderdelen container2, SoortOnderdelen container3, SoortOnderdelen container4, SoortOnderdelen container5, SoortOnderdelen container6) {
            container.add(container1);
            container.add(container2);
            container.add(container3);
            container.add(container4);
            container.add(container5);
            container.add(container6);


        }

        public static void initialiseerContainerOnderdelenRomp(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Halfgeleider romp"));
            onderdelens.add(new Onderdelen("Waterverplaatsende romp"));
            jachtOnderdelen.setOnderdelen(onderdelens);
        }



        public static void initialiseerContainerOnderdelenDek(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Reefer schip"));
            onderdelens.add(new Onderdelen("Heavy lift schip"));
            jachtOnderdelen.setOnderdelen(onderdelens);
        }

        public static void initialiseerContainerOnderdelenStuur(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("HIBO 8T"));
            onderdelens.add(new Onderdelen("Vetus V-12"));
            onderdelens.add(new Onderdelen("Mavimare GE 30"));

            jachtOnderdelen.setOnderdelen(onderdelens);
        }


        public static void initialiseerContainerOnderdelenMotor(SoortOnderdelen jachtOnderdelen) {
            ArrayList<Onderdelen> onderdelens = new ArrayList<>();
            onderdelens.add(new Onderdelen("Wartsila-Sulzer RTA96"));
            onderdelens.add(new Onderdelen("Yamaha 425 PK"));
            onderdelens.add(new Onderdelen("Vetus E-line"));

            jachtOnderdelen.setOnderdelen(onderdelens);
        }

    }






