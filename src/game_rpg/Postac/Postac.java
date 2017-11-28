package game_rpg.Postac;

import game_rpg.Bron.Bron;

public abstract class Postac {

//    public = dostępna wszędzie
//    protected = ogranicza do tej klasy i klas dziedziczących po niej
//    private - dostępna tylko dla tej klasy i jej klas wewnętrznych
//    bez modyfikatora - dostępna w ramach pakietu
//      * Bohater
//          *  - każdy bohater ma broń
//          *  - każdy bohater ma PŻ, PO, PA - pole
//          *  - każdy bohater ma zręczność - pole
//          *  - każdy bohater może robić unik - metoda
//          *  - każdy bohater potrafi atakować - metoda (to do)
//          *  - każdy bohater potrafi się bronić - metoda (to do)
//          *  - każdy bohater ma super atak (mega pierdolnięcie) - metoda
//          *      - raz na walkę

    protected int punktyZycia;
    protected int punktyObrony;
    protected int punktyZrecznosci;
    protected Bron mojaBron;

    public Postac atakuj(Postac atakowanaPostac) {

        int result = 0;
       // result = (atakowanaPostac.punktyZycia+atakowanaPostac.punktyObrony)-(this.mojaBron.getPunktyAtaku());

        //jeżeli punktyObrony są mniejsze lub równe 0, to modyfikuj punkty życia
        //jeżeli punktyŻycia to zabiłeś


        if (atakowanaPostac.punktyObrony<=0)
        {
            atakowanaPostac.punktyZycia = atakowanaPostac.punktyZycia-(this.mojaBron.getPunktyAtaku());
        } else {
            atakowanaPostac.punktyObrony = atakowanaPostac.punktyObrony - result;
        }


        if (ataka<=obrona) {
            obrona = obrona - ataka;
        } else if (ataka > obrony) {
            obrazenia = ataka - obrona;
            zycie = zycie - obrazenie;
        }



            // jezeli sila ataku <= obrony to od obrony odejmij sile ataku
        //jezeli sila ataku => obrony





            //odejmuj od punktów obrony moje punkty ataku
            // obrona = 5, punkty zycia = 100;
            // sila ataku = 35;

            //obrona = 50, punkty zycia = 100
            //sila ataku = 35

        }
        return null;
    }

