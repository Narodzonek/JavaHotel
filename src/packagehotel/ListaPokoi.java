package packagehotel;

import java.util.ArrayList;

public class ListaPokoi {
    private ArrayList<Pokoj> pokoje = new ArrayList();

    public Pokoj getPokoj(int index) {
        return pokoje.get(index);
    }

    public void dodajPokoj(){
        int num = pokoje.size();
        this.pokoje.add(new Pokoj(num));
    }

    public Pokoj wyszukajPokoj(int numer_pokoju){
        if (numer_pokoju < pokoje.size()){
            return getPokoj(numer_pokoju);
        }else throw new RuntimeException("Nie ma pokoju o tym numerze.");
    }

    public String wyszukajPokoj(Status status){
        String x = "";
        for (int i = 0; i < pokoje.size(); i++){
            if (getPokoj(i).getStan() == status){
                x += getPokoj(i).toString();
            }else throw new RuntimeException("Brak pokoju o takim statusie.");
        }
        return x;
    }

    public String szukajWynajmujacego(String wynajmujacy){
        String x = "";
        for (int i = 0; i < pokoje.size(); i++){
            if (getPokoj(i).getWynajmujacy() == wynajmujacy){
                x += getPokoj(i).toString() + ";";
            }else throw new RuntimeException("Nie ma takiego nazwiska w systemie");
        }
        return x;
    }

    public void rezerwuj(int numer_pokoju, String wynajmujacy){
        if (getPokoj(numer_pokoju).getStan() == Status.WOLNY){
            getPokoj(numer_pokoju).rezerwuj(wynajmujacy);
        }else throw new RuntimeException("Nie można zarezerwowac tego pokoju.");
    }

    public void anulujRezerwacje(int numer_pokoju){
        if (getPokoj(numer_pokoju).getStan() == Status.ZAREZERWOWANY){
            getPokoj(numer_pokoju).anulujRezerwacje();
        }else throw new RuntimeException("Nie można zarezerwowac tego pokoju.");
    }

    public void wydajPokoj(int numer_pokoju){
        if (getPokoj(numer_pokoju).getStan() == Status.ZAREZERWOWANY){
            getPokoj(numer_pokoju).wydajPokoj();
        }else throw new RuntimeException("Nie można wydać tego pokoju.");
    }

    public void zwrocPokoj(int numer_pokoju){
        if (getPokoj(numer_pokoju).getStan() == Status.WYDANY){
            getPokoj(numer_pokoju).zwrocPokoj();
        }else throw new RuntimeException("Nie można zwrocic tego pokoju.");
    }

    public void wycofajPokoj(int numer_pokoju){
        if (getPokoj(numer_pokoju).getStan() == Status.ZWROCONY){
            getPokoj(numer_pokoju).wycofajpokoj();
        }else throw new RuntimeException("Nie można wycofac tego pokoju.");
    }

    public void przywrocPokoj(int numer_pokoju){
        if (getPokoj(numer_pokoju).getStan() == Status.WYCOFANY){
            getPokoj(numer_pokoju).przywrocPokoj();
        }else throw new RuntimeException("Nie można przywrocic tego pokoju.");
    }

    public ArrayList pokazListePokoi(){
        return pokoje;
    }

}
