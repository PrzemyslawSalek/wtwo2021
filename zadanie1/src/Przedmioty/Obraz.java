package Przedmioty;

public class Obraz implements Przedmiot {
    int rokNamalowania;

    public Obraz(int rokNamalowania) {
        this.rokNamalowania = rokNamalowania;
    }

    @Override
    public float okreslWartosc() {
        return (float) (2100 - rokNamalowania) * 10;
    }
    
}
