package Przedmioty;

public class Rzezba implements Przedmiot {
    int rokWykonania;
    float rozmiar;

    public Rzezba(int rokWykonania, float rozmiar) {
        this.rokWykonania = rokWykonania;
        this.rozmiar = rozmiar;
    }

    @Override
    public float okreslWartosc() {
        return ((float) (2020 - rokWykonania) * rozmiar) * 2;
    }
    
}
