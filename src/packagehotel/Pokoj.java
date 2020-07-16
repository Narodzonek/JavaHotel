package packagehotel;

public class Pokoj {
    private Status stan = Status.WOLNY;
    private String wynajmujacy = "";
    private int numer_pokoju;

    Pokoj(int numer_pokoju){
        this.numer_pokoju = numer_pokoju;
    }

    public Status getStan() { return stan; }
    public void setStan(Status stan) { this.stan = stan; }
    public String getWynajmujacy() { return wynajmujacy; }
    public void setWynajmujacy(String wynajmujacy) { this.wynajmujacy = wynajmujacy; }
    public int getNumerPokoju(){ return numer_pokoju; }


    public void rezerwuj(String wynajmujacy){
        if (stan == Status.WOLNY){
            setStan(Status.ZAREZERWOWANY);
            setWynajmujacy(wynajmujacy);
        }else throw new RuntimeException("Nie można dokonać rezerwacji, ponieważ pokój nie jest wolny.");
    }

    public void anulujRezerwacje(){
        if (stan == Status.ZAREZERWOWANY){
            setStan(Status.WOLNY);
            setWynajmujacy("");
        }else throw new RuntimeException("Nie można anulować rezerwacji, ponieważ pokój nie jest zarezerwowany.");
    }

    public void wydajPokoj(){
        if (stan == Status.ZAREZERWOWANY || stan == Status.WOLNY){
            setStan(Status.WYDANY);
        }else throw new RuntimeException("Nie można wydać pokoju ze względu na nieprawidłowy status pokoju.");
    }

    public void zwrocPokoj(){
        if (stan == Status.WYDANY){
            setStan(Status.ZWROCONY);
            setWynajmujacy("");
        }else throw new RuntimeException("Nie można zwrócić pokoju, ponieważ nie został wydany");
    }

    public void wycofajpokoj(){
        if (stan == Status.ZWROCONY){
            setStan(Status.WYCOFANY);
        }else throw new RuntimeException("Nie można wycofać pokoju, ponieważ ma nieprawidłowy status.");
    }

    public void przywrocPokoj(){
        if (stan == Status.WYCOFANY){
            setStan(Status.WOLNY);
        }else throw new RuntimeException("Nie można przywrócić pokoju, ponieważ ma nieprawidłowy status.");
    }

    @Override
    public String toString(){
        String string = "Pokoj o numerze " + getNumerPokoju();
        if (stan == Status.WOLNY){
            string += " ma status wolny.";
        }else if (stan == Status.ZAREZERWOWANY){
            string += " ma status zarezerwowany dla " + getWynajmujacy() + ".";
        }else if (stan == Status.WYDANY){
            string += " ma status wydany dla " + getWynajmujacy() + ".";
        }else if (stan == Status.ZWROCONY){
            string += " ma status zwrocony.";
        }else if (stan == Status.WYCOFANY){
            string += " ma status wycofany.";
        }
        return string;
    }

}
