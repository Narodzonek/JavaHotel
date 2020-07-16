package packagehotel;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        //Tworzymy arkusz/listę pokoi
        ListaPokoi listaPokoi = new ListaPokoi();

        //Tworzymy pokoje
        listaPokoi.dodajPokoj();
        listaPokoi.dodajPokoj();
        listaPokoi.dodajPokoj();
        listaPokoi.dodajPokoj();
        listaPokoi.dodajPokoj();
        listaPokoi.dodajPokoj();
        listaPokoi.dodajPokoj();
        listaPokoi.dodajPokoj();
        listaPokoi.dodajPokoj();
        listaPokoi.dodajPokoj();
        listaPokoi.dodajPokoj();
        listaPokoi.dodajPokoj();

        listaPokoi.rezerwuj(3, "Alek Lalek");
        listaPokoi.rezerwuj(4, "Alek Lalek");
        listaPokoi.rezerwuj(11, "Janek Dzbanek");
        listaPokoi.wydajPokoj(3);

        System.out.println(listaPokoi.szukajWynajmujacego("Alek Lalek"));

        System.out.println(listaPokoi.pokazListePokoi());


        //Stworzenie aktorow/uzytkownikow

        //Poniżej działania użytkowników systemu (aktorów)









    }

}
