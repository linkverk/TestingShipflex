
import java.util.ArrayList;
import java.util.Scanner;

    public class Main {


    public static void main(String[] args) {

        ArrayList<MilieuKorting> milieuKortingen = new ArrayList<>();
        milieuKortingen.add(new MilieuKorting("1"));
        milieuKortingen.add(new MilieuKorting("2"));
        milieuKortingen.add(new MilieuKorting("3"));
        milieuKortingen.add(new MilieuKorting("4"));

        ArrayList<SoortOnderdelen> jachtOnderdelen = new ArrayList<>();
         SoortOnderdelen jacht1 = new SoortOnderdelen("Romp");
        initialiseerJachtOnderdelenRomp(jacht1);
        SoortOnderdelen jacht2 = new SoortOnderdelen("Hout");
        initialiseerHout(jacht2);
        SoortOnderdelen jacht3 = new SoortOnderdelen("Dek");
        initialiseerJachtOnderdelenDek(jacht3) ;
        SoortOnderdelen jacht4 = new SoortOnderdelen("Stuur Systeem");
       initialiseerJachtOnderdelenStuurSysteem(jacht4);
        SoortOnderdelen jacht5 = new SoortOnderdelen("Motor");
        initialiseerJachtOnderdelenMotor(jacht5);
        initialiseerCategorienJachtOnderdelen(jachtOnderdelen, jacht1, jacht2, jacht3,  jacht4,  jacht5);
        Boot jacht = new Boot("Jacht",jachtOnderdelen);

        ArrayList<SoortOnderdelen> ferryOnderdelen = new ArrayList<>();
       SoortOnderdelen ferry1 = new SoortOnderdelen("Romp");
        initialiseerFerryOnderdelenRomp(ferry1);
        SoortOnderdelen ferry2 = new SoortOnderdelen("Hout");
      initialiseerFerryOnderdelen2(ferry2);
        SoortOnderdelen ferry3 = new SoortOnderdelen("Dek");
        initialiseerFerryOnderdelen3(ferry3);
        SoortOnderdelen ferry4 = new SoortOnderdelen("Stuur Systeem");

         initialiseerFerryOnderdelen4(ferry4);
        SoortOnderdelen ferry5 = new SoortOnderdelen("Motor");
         initialiseerFerryOnderdelen5(ferry5);
        initialiseerCategorienFerryOnderdelen( ferryOnderdelen, ferry1, ferry2, ferry3, ferry4, ferry5);
        Boot ferry = new Boot("Ferry",ferryOnderdelen );

        ArrayList<SoortOnderdelen> woonBootOnderdelen = new ArrayList<>();
        SoortOnderdelen woonBoot1 = new SoortOnderdelen("Romp");
         initialiseerWoonBootOnderdelen1(woonBoot1);
        SoortOnderdelen woonBoot2 = new SoortOnderdelen("Hout");
        initialiseerWoonBootOnderdelen2(woonBoot2);
        SoortOnderdelen woonBoot3 = new SoortOnderdelen("Dek");
        initialiseerWoonBootOnderdelen3(woonBoot3);
        SoortOnderdelen woonBoot4 = new SoortOnderdelen("Stuur Systeem");
        initialiseerWoonBootOnderdelen4(woonBoot4);
        SoortOnderdelen woonBoot5 = new SoortOnderdelen("Motor");
       initialiseerWoonBootOnderdelen5(woonBoot5);
        initialiseerCategorienWoonBootOnderdelen( woonBootOnderdelen, woonBoot1, woonBoot2, woonBoot3, woonBoot4, woonBoot5);
        Boot woonBoot = new Boot("WoonBoot",woonBootOnderdelen );
        ArrayList<SoortOnderdelen> speedBootOnderdelen = new ArrayList<>();
        SoortOnderdelen speedBoot1 = new SoortOnderdelen("Romp");
        initialiseerSpeedBootOnderdelen1(speedBoot1);
        SoortOnderdelen speedBoot2 = new SoortOnderdelen("Hout");
     initialiseerSpeedBootOnderdelen2(speedBoot2);
        SoortOnderdelen speedBoot3 = new SoortOnderdelen("Dek");
       initialiseerSpeedBootOnderdelen3(speedBoot3);
        SoortOnderdelen speedBoot4 = new SoortOnderdelen("Stuur Systeem");
        initialiseerSpeedBootOnderdelen4(speedBoot4);
        SoortOnderdelen speedBoot5 = new SoortOnderdelen("Motor" );
        initialiseerSpeedBootOnderdelen5(speedBoot5);
        initialiseerCategorienSpeedBootOnderdelen(speedBootOnderdelen, speedBoot1, speedBoot2,  speedBoot3, speedBoot4, speedBoot5);
        Boot speedBoot = new Boot ("Speedboot",speedBootOnderdelen );

        ArrayList<SoortOnderdelen> containerOnderdelen = new ArrayList<>();
        SoortOnderdelen container1 = new SoortOnderdelen("Romp");
         initialiseerContainerOnderdelen1(container1);
        SoortOnderdelen container2 = new SoortOnderdelen("Hout");
         initialiseerContainerOnderdelen2(container2);
        SoortOnderdelen container3 = new SoortOnderdelen("Dek");
        initialiseerContainerOnderdelen3(container3);
        SoortOnderdelen container4 = new SoortOnderdelen("Stuur Systeem");
        initialiseerContainerOnderdelen4(container4);
        SoortOnderdelen container5 = new SoortOnderdelen("Motor");
        initialiseerContainerOnderdelen5(container5);
        initialiseerCategorienContainerOnderdelen(containerOnderdelen, container1, container2, container3, container4, container5);
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




    public static void login(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens) {
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

    public static void klantMenu(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens) {
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
    public static void zieOfferte(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens) {
        System.out.println("De offerte:");
        System.out.println();
        System.out.println();
        System.out.println(jouGebruiker.getBootNaam());
        System.out.println("--------------------------------------------------");
        System.out.printf("| %-25s | %10s | %20s |%n", "Naam", "Prijs", "Milieukorting");
        System.out.println("--------------------------------------------------");

        for (Onderdelen onderdeel : jouGebruiker.getTotaal().onderdelen) {
            if (onderdeel.milieuKorting == null) {
                System.out.printf("| %-25s | %10s | %20s |%n", onderdeel.getNaam(), onderdeel.getPrijs(), "");
            } else {
                System.out.printf("| %-25s | %10s | %20s |%n", onderdeel.getNaam(), onderdeel.getPrijs(), onderdeel.milieuKorting.getNaam() + " (" + onderdeel.milieuKorting.getKortingen() + ")");
            }
        }
        System.out.println("--------------------------------------------------");

        System.out.println("Totaalprijs:" + jouGebruiker.getTotaal().getTotaalPrijs());
        System.out.print(jouGebruiker.getKlanttype().getNaam() + "   " + jouGebruiker.getKlanttype().getKorting());
        klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);

    }
    public static void ziePrijsopgave(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens) {

        System.out.println(jouGebruiker.getBootNaam());
        System.out.println();
        for (Onderdelen onderdeel : jouGebruiker.getTotaal().onderdelen) {
            System.out.println(onderdeel.getNaam() + " prijs: " + onderdeel.getPrijs());


        }
        System.out.println("Totaalprijs:" + jouGebruiker.getTotaal().getTotaalPrijs());
        klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);


    }




    public static void zieLijstopties(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, ArrayList<Gebruiker> gebruikers, KlantType klant, ArrayList<KlantType> klantTypes, Totaal totaal, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens) {
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
        SoortOnderdelen categorie = gekozenBoot.categorien.get(keuze2 - 1);
i = 0;
        for(Onderdelen onderdelen1: categorie.getOnderdelen()){
            int loopTel = i += 1;
            System.out.println(loopTel +". Naam: " + onderdelen1.getNaam());
            if (onderdelen1.getPrijs() != 0){
                System.out.print("     Prijs: " + onderdelen1.getPrijs());
            }
            if (onderdelen1.milieuKorting != null){
                System.out.print("     Milieukorting: " + onderdelen1.milieuKorting.getNaam());
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
                        Onderdelen gekozenOnderdeel = categorie.getOnderdelen().get(keuze4 - 1);
                        gekozenOnderdelen.add(gekozenOnderdeel);
                        i = 0;
                        for (SoortOnderdelen soortOnderdelen : gekozenBoot.getCategorien()) {

                            int telSoortonderdelen = i += 1;
                            System.out.println(telSoortonderdelen + ". " + soortOnderdelen.naam);
                        }
                        System.out.println("Wat voor categorie onderdelen?");
                        keuze2 = scanner.nextInt();
                        categorie = gekozenBoot.categorien.get(keuze2 - 1);
                        i = 0;
                        for (Onderdelen onderdelen1 : categorie.getOnderdelen()) {
                            int loopTel = i += 1;
                            System.out.println(loopTel + ". Naam: " + onderdelen1.getNaam());
                            if (onderdelen1.getPrijs() != 0) {
                                System.out.print("     Prijs: " + onderdelen1.getPrijs());
                            }
                            if (onderdelen1.milieuKorting != null) {
                                System.out.print("     Milieukorting: " + onderdelen1.milieuKorting.getNaam());
                            }
                        }
                            System.out.println("Wilt u opties in een mandje zetten? ja/nee: ");
                            scanner.nextLine();
                           String keuzeEinde = scanner.nextLine();
                           if (keuzeEinde.equals("nee")){
                               System.out.println("Uw mandje bestaat uit de volgende onderdelen: ");

                               for(Onderdelen onderdelen1: gekozenOnderdelen){
                                   System.out.println("- " + onderdelen1.getNaam());
                               }
                           }
                        klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);
                            keuze3 = keuzeEinde;


                    }

                    break;

                case "nee":
                    klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);

                    break;


                default:
                    System.out.println("Ongeldige invoer. Probeer het nog eens");
                    klantMenu(milieuKortingen, boten, jouGebruiker, gebruikers, klant, klantTypes, totaal, onderdelen, soortOnderdelens);
            }
        }



    public static void scheepsBouwerMenu(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
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




    public static void offerteMaker(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<Onderdelen> selectedOnderdelen, ArrayList<SoortOnderdelen> categorien, ArrayList<KlantType> klantTypes, ArrayList<Gebruiker> gebruikers) {
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

            offerteMaker(milieuKortingen, boten, jouGebruiker, totaal, klant, selectedOnderdelen, categorien, klantTypes, gebruikers);
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

            for (SoortOnderdelen soort : checkOfCategorieLeegis) {
                if (selectedCategory == soort) {
                    System.out.println("U heeft al een keer gekozen voor dit soort onderdeel.");
                    System.out.println("Wilt u dit onderdeel vervangen met een ander?. J/N");
                    scanner.nextLine();
                    String choose = scanner.nextLine();
                    if (choose.equals("N")) {
                        System.out.println("========== CATEGORIEN ==========");

                        for (i = 0; i < gekozenBoot.getCategorien().size(); i++) {
                            //print catogorien
                            System.out.println((i + 1) + ". " + gekozenBoot.getCategorien().get(i).soortOnderdeel);
                        }
                        System.out.println("Voor welke soort onderdelen wilt u kiezen?:");
                        selectedCategoryIndex = scanner.nextInt() - 1;
                        selectedCategory = gekozenBoot.getCategorien().get(selectedCategoryIndex);
                        checkOfCategorieLeegis.add(gekozenBoot.getCategorien().get(selectedCategoryIndex));
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

                System.out.println();

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
                                categorien.get(3).getExtras().get(0).setPrijs(250);
                                selectedOnderdelen.add(categorien.get(3).getExtras().get(0));
                                eindigLoop = false;
                                break;
                            case 2:
                                categorien.get(3).getExtras().get(1).setPrijs(500);
                                selectedOnderdelen.add(categorien.get(3).getExtras().get(1));
                                eindigLoop = false;
                                break;
                            case 3:
                                categorien.get(3).getExtras().get(2).setPrijs(1000);
                                selectedOnderdelen.add(categorien.get(3).getExtras().get(2));
                                eindigLoop = false;
                                break;
                            case 4:
                                categorien.get(3).getExtras().get(3).setPrijs(2000);
                                selectedOnderdelen.add(categorien.get(3).getExtras().get(3));
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

        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klantTypes, selectedOnderdelen, categorien, gebruikers);


    }

    public static void voegPrijzenOnderdelen(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
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


    public static void lijstOptiesScheepsBouwer(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
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
        scheepsBouwerMenu(milieuKortingen, boten, jouGebruiker, totaal, klant, klanten, onderdelen, soortOnderdelens, gebruikers);
    }





    public static void voegMilieukorting(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> categorien, ArrayList<Gebruiker> gebruikers) {
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
    public static void onderdelenVoegMilieukortingToe(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> categorien, ArrayList<Gebruiker> gebruikers) {
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


    public static void kiesKlantkorting(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
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

        public static void voegNieuweOnderdelen(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
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
    public static void maakNieuweKlantType(ArrayList<MilieuKorting> milieuKortingen, ArrayList<Boot> boten, Gebruiker jouGebruiker, Totaal totaal, KlantType klant, ArrayList<KlantType> klanten, ArrayList<Onderdelen> onderdelen, ArrayList<SoortOnderdelen> soortOnderdelens, ArrayList<Gebruiker> gebruikers) {
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

    public static void initialiseerHout(SoortOnderdelen hout) {
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

    }






