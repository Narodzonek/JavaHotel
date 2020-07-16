package packagehotel;

public class Osoba {
    protected String imieNazwisko;
    protected boolean recepcjonista;

    Osoba(String imieNazwisko, boolean recepcjonista){
        this.imieNazwisko = imieNazwisko;
        this.recepcjonista = recepcjonista;
    }

    public void rezerwuj(int numer_pokoju, String imieNazwisko, ListaPokoi listaPokoi){
        listaPokoi.rezerwuj(numer_pokoju, imieNazwisko);
    }

    public void anulujRezerwacje(int numer_pokoju, ListaPokoi listaPokoi){
        listaPokoi.anulujRezerwacje(numer_pokoju);
    }

}
