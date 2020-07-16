package packagehotel;

public class Recepcjonista extends Osoba {

    Recepcjonista(String imieNazwisko, boolean recepcjonista) {
        super(imieNazwisko, recepcjonista);
    }

    public void wydajPokoj(int numer_pokoju, ListaPokoi pokoje){
        pokoje.wydajPokoj(numer_pokoju);
    }

    public void zwrocPokoj(int numer_pokoju, ListaPokoi pokoje){
        pokoje.zwrocPokoj(numer_pokoju);
    }
}
