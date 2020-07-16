package packagehotel;

public class ZespolSprzatajacy {

    public String wyszukajPokoj(ListaPokoi lista_pokoi, Status status){
        return lista_pokoi.wyszukajPokoj(status);
    }

    public void sprzatnnijPokoj(Pokoj pokoj){
        pokoj.przywrocPokoj();
    }

}
