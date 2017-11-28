package game_rpg;

import game_rpg.Postac.Postac;

/**
 * Wybieramy sobie postać z kilku dostępnych
 * Losujemy przeciwnika
 * Toczymy z nim walkę
 * Wybieramy sobie broń a przeciwnikowi losujemy
 * Jeżeli wygrywamy to walczymy z kolejnym
 * Jeżeli przegrywamy to koniec gry
 * Schemat walki:
 *  - uderza 1P -> 2P (wynik matematyczny ataku)
 *  - udarza 2P -> 1P (wynik matematyczny ataku)
 *
 * Bohater
 *  - każdy bohater ma broń
 *  - każdy bohater ma PŻ, PO, PA
 *  - każdy bohater ma zręczność
 *  - każdy bohater może robić unik
 *  - każdy bohater potrafi atakować
 *  - każdy bohater potrafi się bronić
 *  - każdy bohater ma super atak (mega pierdolnięcie)
 *      - raz na walkę
 *
 * Broń
 *  - Miecz
 *  - Kołczan
 *  - Buzdygan
 *  - Włócznia
 *  - Stara Nokia
 *  -------------------
 *  Cechy broni
 *      - broń zwiększa punkty ataku
 *      - zwiększa albo zmniejsza zręczność
 *      - broń zadaje obrażenia
 *  -------------------
 *  Gra
 *   - ma tury
 *   - trwa do śmierci gracza
 *   - gra ma zawodników
 *   - gra wyswietla komunikaty
 *
 * Maciek:
 * - główna klasa bohatera opisująca właściwości, które są uniwersalne dla wszystkich postaci
 * - potem dziedziczenie i dodawanie nowych funkcjonalności
 * - każdy wróg ma również super atak, ale nie wiemy w której turze walki nam przywali, losujemy kiedy. Może zaatakować tylko raz
 *
 * Paweł:
 * - klasa broni
 * - klasa gra, gdzie odbywają się rundy
 * - main do wywoływania jak najmniejszej liczby gówien
 *
 * Marek:
 * - klasa postaci, klasa przeciwnika, klasa gry, klasa broni
 * - metody walka, metoda losownia przedmiotów, metoda wygrywania, metoda przegrywania, metoda kończenia gry
 *
 *
 * Postac (atakuj(postac)
 *      Bohater (atakuj(postac)
 *          Rycerz Zakuta Pała (atakuj(postac)
 *          Batman (atakuj(postacKtoraAtakujesz)
 *          Spiderman (atakuj(postacKtoraAtakujesz)
 *          Wiwała (atakuj(postacKtoraAtakujesz)
 *      Wrog (atakuj(postacKtoraAtakujesz)
 *          Jedryszko  (atakuj(postacKtoraAtakujesz)
 *          Dziki Pajak (atakuj(postacKtoraAtakujesz)
 *          Pani Krysia (atakuj(postacKtoraAtakujesz)
 */

public class Main {

    public static void main(String[] args) {


    }
}
