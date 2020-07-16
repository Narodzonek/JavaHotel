package packagehotel;

public class Dyrektor {

    public void dodajPokoj(ListaPokoi listaPokoi){
        listaPokoi.dodajPokoj();
    }

    public String wyszukajPokoj(ListaPokoi listaPokoi, Status status){
        return listaPokoi.wyszukajPokoj(status);
    }

    public void wycofajPokoj(ListaPokoi listaPokoi, int numer_pokoju){
        listaPokoi.wycofajPokoj(numer_pokoju);
    }

    public void przywrocPokoj(ListaPokoi listaPokoi, int numer_pokoju){
        listaPokoi.przywrocPokoj(numer_pokoju);
    }
}
